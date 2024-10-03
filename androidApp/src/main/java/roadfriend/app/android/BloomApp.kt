
package roadfriend.app.android

import android.app.Application
import roadfriend.app.android.di.androidModule
import com.russhwolf.settings.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level
import roadfriend.app.di.KoinInit

class BloomApp : Application() {
    override fun onCreate() {
        super.onCreate()

        KoinInit().init {
            androidLogger(level = if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(androidContext = this@BloomApp)
            modules(
                listOf(
                    androidModule,
                ),
            )
        }
    }
}
