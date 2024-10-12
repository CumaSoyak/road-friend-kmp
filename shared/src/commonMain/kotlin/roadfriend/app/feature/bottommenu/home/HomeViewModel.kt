package roadfriend.app.feature.bottommenu.home

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */
import roadfriend.app.core.base.TBViewModel

class HomeViewModel : TBViewModel<HomeCR.State, HomeCR.Event>() {

    override fun setInitialState(): HomeCR.State {
        return HomeCR.State()
    }

    override fun onTriggerEvent(event: HomeCR.Event) {
        when (event) {
            HomeCR.Event.ReloadData -> {
                println("HomeCR.Event.ReloadData")

                setState {
                    copy(
                        isPassbookActive = "Cumaaa"
                    )
                }
            }
        }

    }



}