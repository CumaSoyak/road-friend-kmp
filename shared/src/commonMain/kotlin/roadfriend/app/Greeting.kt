package roadfriend.app

import androidx.compose.runtime.Composable

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "hello baby, ${platform.name}!"
    }
}
