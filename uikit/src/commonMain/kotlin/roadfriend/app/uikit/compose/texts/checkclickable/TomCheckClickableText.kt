package roadfriend.app.uikit.compose.texts.checkclickable

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import roadfriend.app.uikit.compose.fonts.montserrat
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun TomCheckClickableText(
    modifier: Modifier = Modifier,
    modifierCheckBox: Modifier = Modifier,
    checked: Boolean,
    prefixText: String,
    allText: String,
    prefixTextColor: Color = TomTheme.colors.textPurple,
    allTextColor: Color = TomTheme.colors.textSecondary,
    isUnderline: Boolean = false,
    fontFamily: FontFamily = montserrat(),
    fontWeight: FontWeight = FontWeight.Medium,
    prefixFontSize: TextUnit = TomTheme.dimens.textSizeBody,
    allTextFontSize: TextUnit = TomTheme.dimens.textSizeBody,
    lineHeight: TextUnit = TomTheme.dimens.lineHeightBody,
    enabled: Boolean = true,
    enableRipple: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    //selectedImage: Painter = painterResource(resource = Res.drawable.tom_ic_checkbox_selected),
    //unSelectedImage: Painter = painterResource(resource = R.drawable.tom_ic_checkbox_unselected),
    //selectedPassiveImage: Painter = painterResource(resource = R.drawable.tom_ic_checkbox_passive),
    onClickPrefixText: ((Boolean) -> Unit)? = null,
    onClickRow: ((Boolean) -> Unit)? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Start
    ) {
        /*
        TomCheckBox(
            modifier = modifierCheckBox,
            checked = checked,
            enabled = enabled,
            enableRipple = enableRipple,
            interactionSource = interactionSource,
            selectedImage = selectedImage,
            unSelectedImage = unSelectedImage,
            selectedPassiveImage = selectedPassiveImage,
            onCheckedChange = {
                if (onClickPrefixText == null) {
                    onClickRow?.invoke(checked.not())
                } else {
                    onClickPrefixText.invoke(checked.not())
                }
            }
        )
        if (onClickRow == null) {
            TomClickableText(
                prefixText = prefixText,
                allText = allText,
                prefixTextColor = prefixTextColor,
                allTextColor = allTextColor,
                isUnderline = isUnderline,
                fontFamily = fontFamily,
                fontWeight = fontWeight,
                prefixFontSize = prefixFontSize,
                allTextFontSize = allTextFontSize,
                lineHeight = lineHeight,
                onClickPrefixText = {
                    onClickPrefixText?.invoke(checked.not())
                },
                onClickText = null
            )
        } else {
            TomClickableText(
                prefixText = prefixText,
                allText = allText,
                prefixTextColor = prefixTextColor,
                allTextColor = allTextColor,
                isUnderline = isUnderline,
                fontFamily = fontFamily,
                fontWeight = fontWeight,
                prefixFontSize = prefixFontSize,
                allTextFontSize = allTextFontSize,
                lineHeight = lineHeight,
                onClickPrefixText = null,
                onClickText = {
                    onClickRow.invoke(checked.not())
                }
            )
        }
        */
    }
}
