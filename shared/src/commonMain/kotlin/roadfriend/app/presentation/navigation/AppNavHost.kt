package roadfriend.app.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import roadfriend.app.feature.bottommenu.account.AccountScreen
import roadfriend.app.feature.bottommenu.home.HomeScreen
import roadfriend.app.feature.bottommenu.messages.MessagesScreen
import roadfriend.app.feature.bottommenu.mytrips.MyTripsScreen
import roadfriend.app.feature.bottommenu.posttrip.PostTripScreen
import roadfriend.app.feature.onboarding.OnboardingScreen
import roadfriend.app.uikit.compose.theme.TomTheme


@Composable
fun AppNavHost(
    completedOnboarding: Boolean,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = Modifier.background(TomTheme.colors.background),
        navController = navController,
        startDestination = if (completedOnboarding) Destinations.Home else Destinations.Home
    ) {
        composable<Destinations.Onboarding> {
            OnboardingScreen(
                navController = navController
            )
        }
        composable<Destinations.Home> {
            HomeScreen(
                navController = navController
            )
        }
        composable<Destinations.MyTrips> {
            MyTripsScreen(
                navController = navController
            )
        }
        composable<Destinations.PostTrip> {
            PostTripScreen(
                navController = navController
            )
        }
        composable<Destinations.Messages> {
            MessagesScreen(
                navController = navController
            )
        }
        composable<Destinations.Account> {
            AccountScreen(
                navController = navController
            )
        }


    }
}
