package com.tr4n.domain.interactor.outputport

import kotlinx.coroutines.CancellationException

open class BaseObserver<Output> {
    private var onSubscribe: () -> Unit = {}
    private var onSuccess: (Output?) -> Unit = { _ -> }
    private var onError: (Throwable) -> Unit = { _ -> }
    private var onCancel: (CancellationException) -> Unit = { _ -> }

    fun onSubscribe(block: () -> Unit) {
        onSubscribe = block
    }

    fun onSuccess(block: (Output?) -> Unit) {
        onSuccess = block
    }

    fun onError(block: (Throwable) -> Unit) {
        onError = block
    }

    fun onCancel(block: (CancellationException) -> Unit) {
        onCancel = block
    }

    operator fun invoke() = onSubscribe.invoke()
    operator fun invoke(output: Output?) = onSuccess.invoke(output)
    operator fun invoke(throwable: Throwable) = onError.invoke(throwable)
    operator fun invoke(exception: CancellationException) = onCancel.invoke(exception)
}
