package roadfriend.app.feature.bottommenu.account

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */
import roadfriend.app.core.base.TBViewModel

class AccountViewModel : TBViewModel<AccountCR.State, AccountCR.Event>() {

    override fun setInitialState(): AccountCR.State {
        return AccountCR.State()
    }

    override fun onTriggerEvent(event: AccountCR.Event) {
        when (event) {
            AccountCR.Event.ReloadData -> {
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