package roadfriend.app.core.base

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

abstract class TomStateViewModel<STATE, EVENT> : TomCoreViewModel() {

    private val initialState: STATE by lazy { setInitialState() }

    abstract fun setInitialState(): STATE

    private val _state: MutableStateFlow<STATE> = MutableStateFlow(initialState)
    val state: StateFlow<STATE> = _state.asStateFlow()

    private val _event: MutableSharedFlow<EVENT> = MutableSharedFlow()

    abstract fun onTriggerEvent(event: EVENT)


    init {
        subscribeToEvents()
    }

    private fun subscribeToEvents() = safeScope { _event.collect { onTriggerEvent(it) } }

    /**
     * setEvent(UsersContract.Event.Retry)
     */
    fun setEvent(event: EVENT) = safeScope { _event.emit(event) }

    /**
     * setState { copy(data = it) }
     */
    fun setState(state: STATE.() -> STATE) = _state.update(state)
}
