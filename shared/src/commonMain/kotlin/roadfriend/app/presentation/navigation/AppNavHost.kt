package roadfriend.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import roadfriend.app.feature.home.HomeScreen
import roadfriend.app.feature.onboarding.OnboardingScreen


@Composable
fun AppNavHost(
    completedOnboarding: Boolean,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = if (completedOnboarding) Destinations.Onboarding else Destinations.Home
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

    }
}
