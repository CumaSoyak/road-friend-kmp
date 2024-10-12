package roadfriend.app.feature.bottommenu.home

import roadfriend.app.core.base.TomUiEvent
import roadfriend.app.core.base.TomUiState

class HomeCR {
    data class State(
        val isPassbookActive: String? = null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
