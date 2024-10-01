package roadfriend.app

import androidx.compose.runtime.Composable
import com.tom.uikit.compose.texts.TomTexts

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

@Composable
fun a(){
    TomTexts.Footnote()
}