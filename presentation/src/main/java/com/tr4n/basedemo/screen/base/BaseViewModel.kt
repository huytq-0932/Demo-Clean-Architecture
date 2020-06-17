package com.tr4n.basedemo.screen.base

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.*
import com.tr4n.data.scheduler.ProcessState
import com.tr4n.domain.scheduler.DispatchersProvider
import kotlinx.coroutines.*
import org.koin.core.KoinComponent
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope, KoinComponent, Observable {

    protected val _messageToast = MutableLiveData<Any>()
    val messageToast: LiveData<Any> get() = _messageToast

    protected val _messageSnackBar = MutableLiveData<Any>()
    val messageSnackBar: LiveData<Any> get() = _messageSnackBar

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        exception.postValue(throwable)
    }

    protected val scope = viewModelScope.plus(exceptionHandler)

    private val callbacks: PropertyChangeRegistry = PropertyChangeRegistry()

    override val coroutineContext: CoroutineContext = Dispatchers.Main

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.add(callback)

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.remove(callback)

    fun notifyChange() = callbacks.notifyCallbacks(this, 0, null)

    fun notifyPropertyChanged(fieldId: Int) = callbacks.notifyCallbacks(this, fieldId, null)

    val exception = MediatorLiveData<Throwable>()
    val loading = MediatorLiveData<Boolean>()

    init {
        loading.addSource(exception) { loading.value = it == null }
    }

    protected fun <T> addSource(vararg liveDatas: LiveData<out ProcessState<T>>) {
        liveDatas.map { liveData ->
            loading.addSource(liveData) { state ->
                loading.value = state.isLoading
            }
        }
    }

    fun launchDataLoad(dispatchers: DispatchersProvider, block: suspend () -> Unit): Job {
        return scope.launch {
            try {
                loading.value = true
                withContext(dispatchers.dispatcher()) {
                    block()
                }
            } catch (e: Throwable) {
                exception.value = e
            } finally {
                loading.value = false
            }
        }
    }
}
