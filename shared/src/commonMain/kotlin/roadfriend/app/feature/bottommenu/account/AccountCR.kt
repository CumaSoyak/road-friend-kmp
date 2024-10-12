package roadfriend.app.feature.bottommenu.account

import roadfriend.app.core.base.TomUiEvent
import roadfriend.app.core.base.TomUiState

class AccountCR {
    data class State(
        val isPassbookActive: String? = null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
