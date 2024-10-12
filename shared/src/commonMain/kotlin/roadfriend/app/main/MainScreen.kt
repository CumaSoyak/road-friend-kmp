package roadfriend.app.main

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import org.jetbrains.compose.resources.painterResource
import roadfriend.app.presentation.navigation.AppNavHost
import roadfriend.app.presentation.navigation.BottomNav
import roadfriend.app.presentation.navigation.Destinations
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.uikit.compose.theme.color.TomColors

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun MainScreen(
    navController: NavHostController,
    onBoardingCompleted: Boolean,
) {
    Scaffold(
        content = { innerPadding ->
            AppNavHost(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
                completedOnboarding = onBoardingCompleted,
            )
        },
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route?.substringBefore("?")
                ?: Destinations.Onboarding::class.qualifiedName.orEmpty()
            val showBottomNavigation =
                currentRoute in BottomNav.entries.map { it.route::class.qualifiedName }

            val addTask = Destinations.PostTrip::class.qualifiedName?.substringBefore("?")

            if (showBottomNavigation || currentRoute == addTask) {
                BottomNavigation(
                    backgroundColor = TomTheme.colors.background,
                ) {
                    BottomNav.entries
                        .forEach { navigationItem ->
                            val isSelected by remember(currentRoute) {
                                derivedStateOf { currentRoute == navigationItem.route::class.qualifiedName }
                            }
                            BottomNavigationItem(
                                modifier = Modifier
                                    .testTag(navigationItem.name)
                                    ,
                                selected = isSelected,
                                label = {
                                    TomTexts.XXSmall(text = navigationItem.label)
                                },
                                icon = {
                                    Icon(
                                        painter = painterResource(if (isSelected) navigationItem.selectedIcon else navigationItem.unselectedIcon),
                                        contentDescription = navigationItem.label,
                                        tint = if (isSelected) {
                                            TomColors.default().textPrimary
                                        } else {
                                            TomColors.default().textSecondary
                                        },
                                    )
                                },
                                onClick = {
                                    navController.navigate(navigationItem.route)
                                },
                            )
                        }
                }
            }
        },
    )

}
