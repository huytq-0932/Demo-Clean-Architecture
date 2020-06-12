package com.tr4n.basedemo.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    protected val _messageToast = MutableLiveData<Any>()
    val messageToast: LiveData<Any> get() = _messageToast

    protected val _messageSnackBar = MutableLiveData<Any>()
    val messageSnackBar: LiveData<Any> get() = _messageSnackBar
}