package roadfriend.app.uikit.compose.buttons.defaults


import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import roadfriend.app.uikit.compose.theme.TomTheme

object TomButtonsColors {
    @Composable
    fun primary(
        backgroundColor: Color = TomTheme.colors.black,
        disabledBackgroundColor: Color = TomTheme.colors.warningColor.copy(
            alpha = 0.25f
        )
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor =backgroundColor ,
        disabledContainerColor = disabledBackgroundColor
    )

    @Composable
    fun neutral(
        backgroundColor: Color = TomTheme.colors.black,
        disabledBackgroundColor: Color = TomTheme.colors.white.copy(
            alpha = 0.25f
        )
    ): ButtonColors = ButtonDefaults.buttonColors(
        contentColor = backgroundColor,
        disabledContentColor = disabledBackgroundColor
    )

    @Composable
    fun neutralLight(
        backgroundColor: Color = TomTheme.colors.warningColor,
        disabledBackgroundColor: Color = TomTheme.colors.warningColor.copy(
            alpha = 0.25f
        )
    ): ButtonColors = ButtonDefaults.buttonColors(
        contentColor = backgroundColor,
        disabledContentColor = disabledBackgroundColor
    )

    @Composable
    fun semantic(
        backgroundColor: Color = TomTheme.colors.warningColor,
        disabledBackgroundColor: Color = TomTheme.colors.warningColor.copy(
            alpha = 0.25f
        )
    ): ButtonColors = ButtonDefaults.buttonColors(
        contentColor = backgroundColor,
        disabledContentColor = disabledBackgroundColor
    )

    @Composable
    fun text(
        backgroundColor: Color = TomTheme.colors.warningColor,
        contentColor: Color = TomTheme.colors.textPrimary,
        disabledContentColor: Color = TomTheme.colors.textPrimary
           // .copy(alpha = ContentAlpha.disabled)
    ): ButtonColors = ButtonDefaults.textButtonColors(

        contentColor = contentColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlined(
        backgroundColor: Color = TomTheme.colors.warningColor,
        contentColor: Color = TomTheme.colors.textPrimary,
        disabledContentColor: Color = TomTheme.colors.textPrimary
            //.copy(alpha = ContentAlpha.disabled)
    ): ButtonColors = ButtonDefaults.outlinedButtonColors(
        contentColor = contentColor,
        disabledContentColor = disabledContentColor
    )
}
