package roadfriend.app.uikit.compose.buttons.defaults

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.uikit.compose.theme.shape.TomShapes

object TomButtons {
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = TomTheme.dimens.dp0,
            pressedElevation = TomTheme.dimens.dp0,
            hoveredElevation = TomTheme.dimens.dp0,
            focusedElevation = TomTheme.dimens.dp0
        ),
        shape: Shape = TomShapes.default().button1,
        border: BorderStroke? = null,
        buttonColors: ButtonColors = TomButtonsColors.primary(),
        buttonSizes: ButtonSizes = TomButtonSizes.large(),
        textColor: Color = TomTheme.colors.white,
        textAlign: TextAlign = TextAlign.Center,
        iconSide: IconSide? = null,
        iconTint: Color = Color.Unspecified,
        icon: Painter? = null,
        iconPaddingValues: PaddingValues = PaddingValues(TomTheme.dimens.dp0),
        content: @Composable (RowScope.() -> Unit)? = null,
        onClick: () -> Unit
    ) = TomButtonsImpl(
        text = text,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        buttonColors = buttonColors,
        buttonSizes = buttonSizes,
        textColor = textColor,
        textAlign = textAlign,
        iconSide = iconSide,
        iconTint = iconTint,
        icon = icon,
        iconPaddingValues = iconPaddingValues,
        content = content,
        onClick = onClick
    )

    @Composable
    fun Neutral(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = TomTheme.dimens.dp0,
            pressedElevation = TomTheme.dimens.dp0,
            hoveredElevation = TomTheme.dimens.dp0,
            focusedElevation = TomTheme.dimens.dp0
        ),
        shape: Shape = TomShapes.default().halfPercent,
        border: BorderStroke? = null,
        buttonColors: ButtonColors = TomButtonsColors.neutral(),
        buttonSizes: ButtonSizes = TomButtonSizes.large(),
        textColor: Color = TomTheme.colors.textPrimary,
        textAlign: TextAlign = TextAlign.Center,
        iconSide: IconSide? = null,
        iconTint: Color = Color.Unspecified,
        icon: Painter? = null,
        iconPaddingValues: PaddingValues = PaddingValues(TomTheme.dimens.dp0),
        content: @Composable (RowScope.() -> Unit)? = null,
        onClick: () -> Unit
    ) = TomButtonsImpl(
        text = text,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        buttonColors = buttonColors,
        buttonSizes = buttonSizes,
        textColor = textColor,
        textAlign = textAlign,
        iconSide = iconSide,
        iconTint = iconTint,
        icon = icon,
        iconPaddingValues = iconPaddingValues,
        content = content,
        onClick = onClick
    )

    @Composable
    fun Semantic(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = TomTheme.dimens.dp0,
            pressedElevation = TomTheme.dimens.dp0,
            hoveredElevation = TomTheme.dimens.dp0,
            focusedElevation = TomTheme.dimens.dp0
        ),
        shape: Shape = TomShapes.default().halfPercent,
        border: BorderStroke? = null,
        buttonColors: ButtonColors = TomButtonsColors.semantic(),
        buttonSizes: ButtonSizes = TomButtonSizes.large(),
        textColor: Color = TomTheme.colors.white,
        textAlign: TextAlign = TextAlign.Center,
        iconSide: IconSide? = null,
        iconTint: Color = Color.Unspecified,
        icon: Painter? = null,
        iconPaddingValues: PaddingValues = PaddingValues(TomTheme.dimens.dp0),
        content: @Composable (RowScope.() -> Unit)? = null,
        onClick: () -> Unit
    ) = TomButtonsImpl(
        text = text,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        buttonColors = buttonColors,
        buttonSizes = buttonSizes,
        textColor = textColor,
        textAlign = textAlign,
        iconSide = iconSide,
        iconTint = iconTint,
        icon = icon,
        iconPaddingValues = iconPaddingValues,
        content = content,
        onClick = onClick
    )

    @Composable
    fun Text(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = TomTheme.dimens.dp0,
            pressedElevation = TomTheme.dimens.dp0,
            hoveredElevation = TomTheme.dimens.dp0,
            focusedElevation = TomTheme.dimens.dp0
        ),
        shape: Shape = TomShapes.default().halfPercent,
        border: BorderStroke? = null,
        buttonColors: ButtonColors = TomButtonsColors.text(),
        buttonSizes: ButtonSizes = TomButtonSizes.large(),
        textColor: Color = TomTheme.colors.textPrimary,
        textAlign: TextAlign = TextAlign.Center,
        iconSide: IconSide? = null,
        iconTint: Color = Color.Unspecified,
        icon: Painter? = null,
        iconPaddingValues: PaddingValues = PaddingValues(TomTheme.dimens.dp0),
        content: @Composable (RowScope.() -> Unit)? = null,
        onClick: () -> Unit
    ) = TomTextButtonsImpl(
        text = text,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        buttonColors = buttonColors,
        buttonSizes = buttonSizes,
        textColor = textColor,
        textAlign = textAlign,
        iconSide = iconSide,
        iconTint = iconTint,
        icon = icon,
        iconPaddingValues = iconPaddingValues,
        content = content,
        onClick = onClick
    )

    @Composable
    fun Outlined(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = TomTheme.dimens.dp0,
            pressedElevation = TomTheme.dimens.dp0,
            hoveredElevation = TomTheme.dimens.dp0,
            focusedElevation = TomTheme.dimens.dp0
        ),
        shape: Shape = TomShapes.default().halfPercent,
        border: BorderStroke = BorderStroke(TomTheme.dimens.dp1, TomTheme.colors.black),
        buttonColors: ButtonColors = TomButtonsColors.outlined(),
        buttonSizes: ButtonSizes = TomButtonSizes.large(),
        textColor: Color = TomTheme.colors.white,
        textAlign: TextAlign = TextAlign.Center,
        iconSide: IconSide? = null,
        iconTint: Color = Color.Unspecified,
        icon: Painter? = null,
        iconPaddingValues: PaddingValues = PaddingValues(TomTheme.dimens.dp0),
        content: @Composable (RowScope.() -> Unit)? = null,
        onClick: () -> Unit
    ) = TomButtonsOutlinedImpl(
        text = text,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border,
        buttonColors = buttonColors,
        buttonSizes = buttonSizes,
        textColor = textColor,
        textAlign = textAlign,
        iconSide = iconSide,
        iconTint = iconTint,
        icon = icon,
        iconPaddingValues = iconPaddingValues,
        content = content,
        onClick = onClick
    )
}
