package roadfriend.app.feature.bottommenu.messages

import roadfriend.app.core.base.TomUiEvent
import roadfriend.app.core.base.TomUiState

class MessagesCR {
    data class State(
        val isPassbookActive: String? = null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
