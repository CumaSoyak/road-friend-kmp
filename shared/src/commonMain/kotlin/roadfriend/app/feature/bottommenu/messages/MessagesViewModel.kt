package roadfriend.app.feature.bottommenu.messages

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */
import roadfriend.app.core.base.TBViewModel

class MessagesViewModel : TBViewModel<MessagesCR.State, MessagesCR.Event>() {

    override fun setInitialState(): MessagesCR.State {
        return MessagesCR.State()
    }

    override fun onTriggerEvent(event: MessagesCR.Event) {
        when (event) {
            MessagesCR.Event.ReloadData -> {
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