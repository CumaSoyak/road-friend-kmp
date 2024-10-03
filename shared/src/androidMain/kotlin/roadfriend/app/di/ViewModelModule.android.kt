
package roadfriend.app.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import roadfriend.app.main.MainViewModel
import roadfriend.app.feature.home.HomeViewModel


actual val viewModelModule = module {
    viewModelOf(::HomeViewModel)
    viewModelOf(::MainViewModel)
}
