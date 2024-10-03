package roadfriend.app.uikit.compose.texts.clickable

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import roadfriend.app.uikit.compose.extension.highlightedAnnotatedString
import roadfriend.app.uikit.compose.extension.highlightedAnnotatedStringIndex
import roadfriend.app.uikit.compose.fonts.montserrat
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun TomClickableText(
    modifier: Modifier = Modifier,
    prefixText: String,
    allText: String,
    prefixTextColor: Color = TomTheme.colors.textPurple,
    allTextColor: Color = TomTheme.colors.textSecondary,
    textAlign: TextAlign = TextAlign.Start,
    isUnderline: Boolean = false,
    fontFamily: FontFamily = montserrat(),
    fontWeight: FontWeight = FontWeight.Medium,
    prefixFontSize: TextUnit = TomTheme.dimens.textSizeBody,
    allTextFontSize: TextUnit = TomTheme.dimens.textSizeBody,
    lineHeight: TextUnit = TomTheme.dimens.lineHeightBody,
    onClickPrefixText: (() -> Unit)? = null,
    onClickText: (() -> Unit)? = null
) {
    val indexPair = highlightedAnnotatedStringIndex(prefixText, allText)
    val annotatedText = highlightedAnnotatedString(
        prefixTextColor = prefixTextColor,
        prefixText = prefixText,
        allText = allText,
        prefixFontSize = prefixFontSize,
        isUnderline = isUnderline
    )
    ClickableText(
        text = annotatedText,
        style = TextStyle(
            color = allTextColor,
            fontFamily = fontFamily,
            fontSize = allTextFontSize,
            fontWeight = fontWeight,
            lineHeight = lineHeight,
            letterSpacing = 0.6.sp,
            textAlign = textAlign,
        ),
        overflow = TextOverflow.Ellipsis,
        modifier = modifier.clearAndSetSemantics {},
        onClick = {
            if (onClickPrefixText != null) {
                if (indexPair.first <= it && indexPair.second >= it) {
                    onClickPrefixText.invoke()
                }
            } else {
                onClickText?.invoke()
            }
        }
    )
}
