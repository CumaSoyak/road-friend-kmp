package roadfriend.app.base

import androidx.core.bundle.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import roadfriend.app.extension.castOrNull
import kotlin.coroutines.CoroutineContext

abstract class TomCoreViewModel : ViewModel(), TomFetchBundle {
    private val safeLaunchExceptionTag = "TomCoreViewModel-ExceptionHandler"

    private val handler = CoroutineExceptionHandler { _, exception ->
        // Timber.tag(safeLaunchExceptionTag).e(exception)
        exception.castOrNull<Exception>()?.let { handleError(it) }
    }

    protected fun safeScope(block: suspend CoroutineScope.() -> Unit) =
        viewModelScope.launch(handler, block = block)

    protected suspend fun safeContext(
        context: CoroutineContext = Dispatchers.IO,
        block: suspend CoroutineScope.() -> Unit
    ) {
        withContext(context) { block() }
    }

    abstract fun handleError(exception: Exception)

    private val _isLoading: Channel<Boolean> = Channel()
    val isLoading = _isLoading.receiveAsFlow()

    private val _effect: Channel<TomUiEffect> = Channel()
    val effect = _effect.receiveAsFlow()

    protected fun setEffect(builder: () -> TomUiEffect) = safeScope {
        val effectValue = builder()
        _effect.send(effectValue)
    }

    open fun showLoading() = safeScope { _isLoading.send(true) }

    open fun hideLoading() = safeScope { _isLoading.send(false) }

    override fun fetchBundle(bundle: Bundle) = Unit

    fun <T : Any?> sendRequest(
        showLoading: Boolean = true,
        closeLoading: Boolean = true,
        request: suspend () -> T,
        success: ((T) -> Unit)? = null,
        error: ((Exception) -> Unit)? = null,
        complete: (() -> Unit)? = null
    ) = safeScope {
        if (showLoading) {
            showLoading()
        }
        var clsLoading = closeLoading

        try {
            val result = request.invoke()
            success?.invoke(result)
        } catch (exception: Exception) {
            clsLoading = true
            // Timber.e(exception)
            if (error != null) {
                error.invoke(exception)
            } else {
                handleError(exception)
            }
        }

        if (showLoading && clsLoading) {
            hideLoading()
        }
        complete?.invoke()
    }
}
