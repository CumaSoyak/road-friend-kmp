package roadfriend.app.feature.bottommenu.posttrip

import roadfriend.app.core.base.TomUiEvent
import roadfriend.app.core.base.TomUiState

class PostTripCR {
    data class State(
        val isPassbookActive: String? = null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
