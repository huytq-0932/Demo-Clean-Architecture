package com.tr4n.data.scheduler

import com.tr4n.domain.scheduler.DispatchersProvider
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

class IODispatcher : DispatchersProvider {
    override fun dispatcher(): CoroutineContext = Dispatchers.IO
}

