package roadfriend.app.uikit.compose.buttons.defaults

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.uikit.compose.theme.shape.TomShapes

val TomButtonLargeContentPadding = PaddingValues(
    top = 0.dp,
    bottom = 0.dp,
    start = 16.dp,
    end = 16.dp
)

val TomButtonMediumContentPadding = PaddingValues(
    top = 0.dp,
    bottom = 0.dp,
    start = 16.dp,
    end = 16.dp
)

val TomButtonSmallContentPadding = PaddingValues(
    top = 0.dp,
    bottom = 0.dp,
    start = 8.dp,
    end = 8.dp
)

enum class IconSide { LEFT, RIGHT, CENTER_LEFT, CENTER_RIGHT }

@Composable
fun TomButtonsImpl(
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
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    buttonSizes: ButtonSizes = TomButtonSizes.large(),
    textColor: Color = Color.Unspecified,
    textAlign: TextAlign = TextAlign.Center,
    iconSide: IconSide? = null,
    iconTint: Color = Color.Unspecified,
    icon: Painter? = null,
    iconPaddingValues: PaddingValues,
    content: @Composable (RowScope.() -> Unit)? = null,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                modifier = Modifier
                    .wrapContentSize(Alignment.Center)
                    .padding(iconPaddingValues),
                painter = icon,
                contentDescription = null,
                tint = iconTint
            )
        }
    }

    Button(
        enabled = enabled,
        modifier = modifier
            .widthIn(min = buttonSizes.minWidth)
            .height(buttonSizes.height),
        elevation = elevation,
        border = border,
        colors = buttonColors,
        contentPadding = buttonSizes.contentPadding,
        shape = shape,
        onClick = onClick
    ) {
        if (content == null) {
            when (iconSide) {
                IconSide.LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.RIGHT -> {
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                IconSide.CENTER_LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        modifier = Modifier.padding(start = TomTheme.dimens.dp8),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.CENTER_RIGHT -> {
                    TomTexts.CallOut(
                        modifier = Modifier.padding(end = TomTheme.dimens.dp8),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                else -> {
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }
            }
        } else {
            content.invoke(this)
        }
    }
}

@Composable
fun TomTextButtonsImpl(
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
    buttonColors: ButtonColors = ButtonDefaults.textButtonColors(),
    buttonSizes: ButtonSizes = TomButtonSizes.large(),
    textColor: Color = Color.Unspecified,
    textAlign: TextAlign = TextAlign.Center,
    iconSide: IconSide? = null,
    iconTint: Color = Color.Unspecified,
    icon: Painter? = null,
    iconPaddingValues: PaddingValues,
    content: @Composable (RowScope.() -> Unit)? = null,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                modifier = Modifier
                    .wrapContentSize(Alignment.Center)
                    .padding(iconPaddingValues),
                painter = icon,
                contentDescription = null,
                tint = iconTint
            )
        }
    }

    TextButton(
        enabled = enabled,
        modifier = modifier
            .widthIn(min = buttonSizes.minWidth)
            .height(buttonSizes.height),
        elevation = elevation,
        border = border,
        colors = buttonColors,
        contentPadding = buttonSizes.contentPadding,
        shape = shape,
        onClick = onClick
    ) {
        if (content == null) {
            when (iconSide) {
                IconSide.LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.RIGHT -> {
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                IconSide.CENTER_LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.CENTER_RIGHT -> {
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                else -> {
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }
            }
        } else {
            content.invoke(this)
        }
    }
}

@Composable
fun TomButtonsOutlinedImpl(
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
    buttonColors: ButtonColors = ButtonDefaults.outlinedButtonColors(),
    buttonSizes: ButtonSizes = TomButtonSizes.large(),
    textColor: Color = Color.Unspecified,
    textAlign: TextAlign = TextAlign.Center,
    iconSide: IconSide? = null,
    iconTint: Color = Color.Unspecified,
    icon: Painter? = null,
    iconPaddingValues: PaddingValues,
    content: @Composable (RowScope.() -> Unit)? = null,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                modifier = Modifier
                    .wrapContentSize(Alignment.Center)
                    .padding(iconPaddingValues),
                painter = icon,
                contentDescription = null,
                tint = iconTint
            )
        }
    }

    OutlinedButton(
        enabled = enabled,
        modifier = modifier
            .widthIn(min = buttonSizes.minWidth)
            .height(buttonSizes.height),
        elevation = elevation,
        border = border,
        colors = buttonColors,
        contentPadding = buttonSizes.contentPadding,
        shape = shape,
        onClick = onClick
    ) {
        if (content == null) {
            when (iconSide) {
                IconSide.LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.RIGHT -> {
                    TomTexts.CallOut(
                        modifier = Modifier.weight(1f),
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                IconSide.CENTER_LEFT -> {
                    iconButton()
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }

                IconSide.CENTER_RIGHT -> {
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                    iconButton()
                }

                else -> {
                    TomTexts.CallOut(
                        text = text,
                        color = textColor,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = textAlign,
                        fontSize = buttonSizes.fontSize,
                        lineHeight = buttonSizes.lineHeight
                    )
                }
            }
        } else {
            content.invoke(this)
        }
    }
}
