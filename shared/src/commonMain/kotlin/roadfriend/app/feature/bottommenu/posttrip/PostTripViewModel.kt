package roadfriend.app.feature.bottommenu.posttrip

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */
import roadfriend.app.core.base.TBViewModel

class PostTripViewModel : TBViewModel<PostTripCR.State, PostTripCR.Event>() {

    override fun setInitialState(): PostTripCR.State {
        return PostTripCR.State()
    }

    override fun onTriggerEvent(event: PostTripCR.Event) {
        when (event) {
            PostTripCR.Event.ReloadData -> {
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