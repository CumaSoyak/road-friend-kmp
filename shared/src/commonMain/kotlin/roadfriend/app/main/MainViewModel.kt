package roadfriend.app.main


import roadfriend.app.core.base.TBViewModel
import roadfriend.app.feature.bottommenu.home.HomeCR

class MainViewModel : TBViewModel<HomeCR.State, HomeCR.Event>()  {
    override fun setInitialState(): HomeCR.State {
        return HomeCR.State()
    }

    override fun onTriggerEvent(event: HomeCR.Event) {
    }


}
