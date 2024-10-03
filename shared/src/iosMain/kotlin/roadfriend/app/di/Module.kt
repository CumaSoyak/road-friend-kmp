
package roadfriend.app.di


import roadfriend.app.platform.MultiplatformSettingsWrapper
import org.koin.core.module.Module
import org.koin.dsl.module


actual fun platformModule(): Module = module {
   single { MultiplatformSettingsWrapper().createSettings() }
}

