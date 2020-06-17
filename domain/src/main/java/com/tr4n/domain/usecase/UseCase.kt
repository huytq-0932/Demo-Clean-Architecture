package com.tr4n.domain.usecase

import com.tr4n.domain.interactor.outputport.BaseObserver
import com.tr4n.domain.scheduler.AppDispatchers
import com.tr4n.domain.scheduler.ControlledRunner
import com.tr4n.domain.scheduler.DispatchersProvider
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.get
import org.koin.core.qualifier.named

abstract class UseCase<in Input, out Output> : KoinComponent {

    protected val dispatchersProvider = get<DispatchersProvider>(named(AppDispatchers.IO))

    private var controlledRunner = ControlledRunner<Unit>()

    suspend operator fun invoke(input: Input, block: BaseObserver<out Output>.() -> Unit) {
        controlledRunner.cancelPreviousThenRun {
            val response = BaseObserver<Output>().apply { block() }
            response()
            try {
                val result = withContext(dispatchersProvider.dispatcher()) {
                    buildUseCase(input)
                }
                response(result)
            } catch (cancellationException: CancellationException) {
                response(cancellationException)
            } catch (e: Exception) {
                response(e)
            }
        }
    }

    protected abstract suspend fun buildUseCase(input: Input): Output
}
