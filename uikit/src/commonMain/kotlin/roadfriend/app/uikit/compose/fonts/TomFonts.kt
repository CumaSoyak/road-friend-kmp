package roadfriend.app.uikit.compose.fonts

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import roadfriend.app.uikit.resources.Res
import org.jetbrains.compose.resources.Font
import roadfriend.app.uikit.resources.tom_roboto_black
import roadfriend.app.uikit.resources.tom_roboto_black_italic
import roadfriend.app.uikit.resources.tom_roboto_bold
import roadfriend.app.uikit.resources.tom_roboto_bold_italic
import roadfriend.app.uikit.resources.tom_roboto_light
import roadfriend.app.uikit.resources.tom_roboto_light_italic
import roadfriend.app.uikit.resources.tom_roboto_medium
import roadfriend.app.uikit.resources.tom_roboto_medium_italic
import roadfriend.app.uikit.resources.tom_roboto_regular
import roadfriend.app.uikit.resources.tom_roboto_thin
import roadfriend.app.uikit.resources.tom_roboto_thin_italic

@Composable
fun montserrat():FontFamily{
   return FontFamily(
        Font(resource = Res.font.tom_roboto_light, weight = FontWeight.Light),
        Font(resource = Res.font.tom_roboto_light, weight = FontWeight.Light),
        Font(
            resource = Res.font.tom_roboto_light_italic,
            weight = FontWeight.Light,
            style = FontStyle.Italic
        ),
        Font(resource = Res.font.tom_roboto_thin, weight = FontWeight.Thin),
        Font(resource = Res.font.tom_roboto_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
        Font(resource = Res.font.tom_roboto_regular, weight = FontWeight.Normal),
        Font(resource = Res.font.tom_roboto_medium, weight = FontWeight.Medium),
        Font(
            resource = Res.font.tom_roboto_medium_italic,
            weight = FontWeight.Medium,
            style = FontStyle.Italic
        ),
        Font(resource = Res.font.tom_roboto_medium, weight = FontWeight.SemiBold),
        Font(
            resource = Res.font.tom_roboto_medium_italic,
            weight = FontWeight.SemiBold,
            style = FontStyle.Italic
        ),
        Font(resource = Res.font.tom_roboto_bold, weight = FontWeight.Bold),
        Font(resource = Res.font.tom_roboto_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
        Font(resource = Res.font.tom_roboto_black, weight = FontWeight.Black),
        Font(
            resource = Res.font.tom_roboto_black_italic,
            weight = FontWeight.Black,
            style = FontStyle.Italic
        )
    )
}
