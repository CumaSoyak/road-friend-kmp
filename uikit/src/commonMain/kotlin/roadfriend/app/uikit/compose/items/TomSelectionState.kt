package roadfriend.app.uikit.compose.items

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.resources.DrawableResource
import roadfriend.app.uikit.compose.theme.color.TomColors
import roadfriend.app.uikit.compose.theme.dimension.TomDimension

data class TomSelectionState(
    val id: Int = 0,
    val text: String = "",
    val textColor: Color = TomColors.default().textPrimary,
    val icon: DrawableResource? = null,
    val iconTint: Color = TomColors.default().textPrimary,
    val textFontSize: TextUnit = TomDimension.default().textSizeCaption,
    val enabled: Boolean = true,
    var selected: Boolean = false
)
