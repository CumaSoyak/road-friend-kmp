package roadfriend.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import roadfriend.app.feature.bottommenu.home.HomeScreen
import roadfriend.app.uikit.compose.theme.TomTheme

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

@Preview
@Composable
fun a() {
    TomTheme {
        HomeScreen(navController = rememberNavController())
    }
}