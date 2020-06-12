package com.tr4n.basedemo.screen.base

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.core.KoinComponent
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope, KoinComponent, Observable {

    protected val _messageToast = MutableLiveData<Any>()
    val messageToast: LiveData<Any> get() = _messageToast

    protected val _messageSnackBar = MutableLiveData<Any>()
    val messageSnackBar: LiveData<Any> get() = _messageSnackBar

    private val callbacks: PropertyChangeRegistry = PropertyChangeRegistry()

    override val coroutineContext: CoroutineContext = Dispatchers.Main

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.add(callback)

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.remove(callback)

    fun notifyChange() = callbacks.notifyCallbacks(this, 0, null)

    fun notifyPropertyChanged(fieldId: Int) = callbacks.notifyCallbacks(this, fieldId, null)
}
