package roadfriend.app.uikit.compose.buttons.defaults

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import roadfriend.app.uikit.compose.theme.TomTheme

@Immutable
data class ButtonSizes(
    val fontSize: TextUnit,
    val lineHeight: TextUnit,
    val minWidth: Dp,
    val height: Dp,
    val iconSize: Dp,
    val contentPadding: PaddingValues
)

object TomButtonSizes {
    @Composable
    fun large(
        fontSize: TextUnit = TomTheme.typography.callOutSemiBold.fontSize,
        lineHeight: TextUnit = TomTheme.typography.callOutSemiBold.lineHeight,
        minWidth: Dp = TomTheme.dimens.dp84,
        height: Dp = TomTheme.dimens.dp48,
        iconSize: Dp = TomTheme.dimens.dp24,
        contentPadding: PaddingValues = TomButtonLargeContentPadding
    ): ButtonSizes = remember(
        fontSize,
        lineHeight,
        minWidth,
        height,
        iconSize,
        contentPadding
    ) {
        ButtonSizes(
            fontSize = fontSize,
            lineHeight = lineHeight,
            minWidth = minWidth,
            height = height,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun medium(
        fontSize: TextUnit = TomTheme.typography.bodySemiBold.fontSize,
        lineHeight: TextUnit = TomTheme.typography.bodySemiBold.lineHeight,
        minWidth: Dp = TomTheme.dimens.dp84,
        height: Dp = TomTheme.dimens.dp36,
        iconSize: Dp = TomTheme.dimens.dp24,
        contentPadding: PaddingValues = TomButtonMediumContentPadding
    ): ButtonSizes = remember(
        fontSize,
        lineHeight,
        minWidth,
        height,
        iconSize,
        contentPadding
    ) {
        ButtonSizes(
            fontSize = fontSize,
            lineHeight = lineHeight,
            minWidth = minWidth,
            height = height,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun small(
        fontSize: TextUnit = TomTheme.typography.bodySemiBold.fontSize,
        lineHeight: TextUnit = TomTheme.typography.bodySemiBold.lineHeight,
        minWidth: Dp = TomTheme.dimens.dp64,
        height: Dp = TomTheme.dimens.dp24,
        iconSize: Dp = TomTheme.dimens.dp12,
        contentPadding: PaddingValues = TomButtonSmallContentPadding
    ): ButtonSizes = remember(
        fontSize,
        lineHeight,
        minWidth,
        height,
        iconSize,
        contentPadding
    ) {
        ButtonSizes(
            fontSize = fontSize,
            lineHeight = lineHeight,
            minWidth = minWidth,
            height = height,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }
}
