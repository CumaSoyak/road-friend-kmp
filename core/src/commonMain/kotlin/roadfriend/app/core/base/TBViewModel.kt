package roadfriend.app.core.base

abstract class TBViewModel<STATE, EVENT> : TomStateViewModel<STATE, EVENT>() {

    override fun handleError(exception: Exception) {

    }
    /*
        fun <T : BaseModelDto?> apiRequest(
            showLoading: Boolean = true,
            closeLoading: Boolean = true,
            allowResultDetails: Boolean = true,
            request: suspend () -> T,
            success: ((T) -> Unit)? = null,
            successForNavigation: ((T) -> Unit)? = null,
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
    */
}
