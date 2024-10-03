package roadfriend.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import roadfriend.app.utils.koinViewModel
import roadfriend.app.main.MainScreen
import org.koin.compose.KoinContext
import roadfriend.app.main.MainViewModel
import roadfriend.app.platform.StatusBarColors
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun RoadFriendApp(
      mainViewModel: MainViewModel = koinViewModel()
) {

    // val darkTheme = when (mainViewModel.appTheme.collectAsState().value) {
    //     1 -> true
    //     else -> false
    // }
    // val onBoardingCompleted = mainViewModel.onBoardingCompleted.collectAsState().value
    KoinContext {
        TomTheme {
            Column {
                val navController = rememberNavController()

                StatusBarColors(
                    statusBarColor = MaterialTheme.colorScheme.background,
                    navBarColor = MaterialTheme.colorScheme.background,
                )
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    MainScreen(
                        onBoardingCompleted = true,
                        navController = navController,
                    )
                }
            }
        }
    }
}
