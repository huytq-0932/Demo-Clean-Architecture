package com.tr4n.domain.scheduler

import kotlin.coroutines.CoroutineContext

interface DispatchersProvider {
    fun dispatcher(): CoroutineContext
}
