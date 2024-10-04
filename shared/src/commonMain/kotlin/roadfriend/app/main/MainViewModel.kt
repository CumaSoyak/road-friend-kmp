package roadfriend.app.main

import androidx.lifecycle.ViewModel
import roadfriend.app.base.TBViewModel
import roadfriend.app.feature.home.HomeCR

class MainViewModel : TBViewModel<HomeCR.State, HomeCR.Event>()  {
    override fun setInitialState(): HomeCR.State {
        return HomeCR.State()
    }

    override fun onTriggerEvent(event: HomeCR.Event) {
    }


}
