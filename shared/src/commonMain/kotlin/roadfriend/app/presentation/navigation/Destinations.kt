package roadfriend.app.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Destinations {
    @Serializable
    object Onboarding

    @Serializable
    object Home

    @Serializable
    object MyTrips

    @Serializable
    object PostTrip

    @Serializable
    object Messages

    @Serializable
    object Account

}
