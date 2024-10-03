
package roadfriend.app.di


import org.koin.core.module.Module
import org.koin.dsl.module

fun commonModule() = module {

    /**
     * Multiplatform-Settings

    single<PreferenceManager> {
        PreferenceManager(settings = get())
    }
    */
    /**
     * Repositories

    single<SettingsRepository> {
        SettingsRepositoryImpl(
            preferenceManager = get(),
        )
    }

    single<TasksRepository> {
        TasksRepositoryImpl(
            bloomDatabase = get(),
        )
    }
     */
}

expect fun platformModule(): Module
