package roadfriend.app.feature.home

import roadfriend.app.base.TomUiEvent
import roadfriend.app.base.TomUiState

class HomeCR {
    data class State(
        val isPassbookActive: String?=null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
