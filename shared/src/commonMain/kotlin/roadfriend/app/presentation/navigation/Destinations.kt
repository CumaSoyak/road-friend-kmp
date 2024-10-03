package roadfriend.app.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Destinations {
    @Serializable
    object Onboarding

    @Serializable
    object Username

    @Serializable
    object Home

    @Serializable
    data class AllTasks(val type: String)

    @Serializable
    data class AddTask(val taskId: Int = -1)

    @Serializable
    object Calendar

    @Serializable
    object Statistics

    @Serializable
    object AllStatistics

    @Serializable
    object Settings

    @Serializable
    data class TaskProgress(val taskId: Int)
}
