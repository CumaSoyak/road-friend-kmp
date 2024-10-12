
package roadfriend.app.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import roadfriend.app.main.MainViewModel
import roadfriend.app.feature.onboarding.OnboardingViewModel
import roadfriend.app.feature.bottommenu.home.HomeViewModel
import roadfriend.app.feature.bottommenu.mytrips.MyTripsViewModel
import roadfriend.app.feature.bottommenu.posttrip.PostTripViewModel
import roadfriend.app.feature.bottommenu.messages.MessagesViewModel
import roadfriend.app.feature.bottommenu.account.AccountViewModel

actual val viewModelModule = module {
    singleOf(::MainViewModel)
    singleOf(::OnboardingViewModel)
    singleOf(::HomeViewModel)
    singleOf(::MyTripsViewModel)
    singleOf(::PostTripViewModel)
    singleOf(::MessagesViewModel)
    singleOf(::AccountViewModel)




}
