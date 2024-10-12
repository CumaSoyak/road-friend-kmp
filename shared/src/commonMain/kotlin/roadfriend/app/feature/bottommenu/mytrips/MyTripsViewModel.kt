package roadfriend.app.feature.bottommenu.mytrips

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */
import roadfriend.app.core.base.TBViewModel

class MyTripsViewModel : TBViewModel<MyTripsCR.State, MyTripsCR.Event>() {

    override fun setInitialState(): MyTripsCR.State {
        return MyTripsCR.State()
    }

    override fun onTriggerEvent(event: MyTripsCR.Event) {
        when (event) {
            MyTripsCR.Event.ReloadData -> {
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