package roadfriend.app.feature.bottommenu.mytrips

import roadfriend.app.core.base.TomUiEvent
import roadfriend.app.core.base.TomUiState

class MyTripsCR {
    data class State(
        val isPassbookActive: String? = null
    ) : TomUiState

    sealed class Event : TomUiEvent {
        object ReloadData : Event()
    }
}
