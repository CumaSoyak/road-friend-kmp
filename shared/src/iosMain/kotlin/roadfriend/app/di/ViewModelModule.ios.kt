
package roadfriend.app.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import roadfriend.app.main.MainViewModel
import roadfriend.app.feature.home.HomeViewModel

actual val viewModelModule = module {
    singleOf(::HomeViewModel)
    singleOf(::MainViewModel)
}
