package roadfriend.app.uikit.compose.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import roadfriend.app.uikit.compose.fonts.montserrat
import roadfriend.app.uikit.compose.theme.TomTheme

@Suppress("ComposableNaming")
object TomTexts {
    @Composable
    operator fun invoke(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = Color.Unspecified,
        fontSize: TextUnit = TextUnit.Unspecified,
        fontWeight: FontWeight? = null,
        fontFamily: FontFamily? = null,
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TextUnit.Unspecified,
        overflow: TextOverflow = TextOverflow.Clip,
        maxLines: Int = Int.MAX_VALUE
    ) {
        if (textAnnotated != null) {
            Text(
                text = textAnnotated,
                modifier = modifier.clearAndSetSemantics {},
                color = color,
                fontSize = fontSize,
                fontWeight = fontWeight,
                fontFamily = fontFamily,
                letterSpacing = letterSpacing,
                textDecoration = textDecoration,
                textAlign = textAlign,
                lineHeight = lineHeight,
                overflow = overflow,
                maxLines = maxLines
            )
        } else {
            Text(
                text = text.orEmpty(),
                modifier = modifier,
                color = color,
                fontSize = fontSize,
                fontWeight = fontWeight,
                fontFamily = fontFamily,
                letterSpacing = letterSpacing,
                textDecoration = textDecoration,
                textAlign = textAlign,
                lineHeight = lineHeight,
                overflow = overflow,
                maxLines = maxLines
            )
        }
    }

    @Composable
    fun NumberN1(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeNumberN1,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightNumberN1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) {
        TomTexts(
            text = text,
            modifier = modifier,
            textAnnotated = textAnnotated,
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            maxLines = maxLines
        )
    }

    @Composable
    fun TitleH1(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH1,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun TitleH2(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH2,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH2,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun TitleH2Half(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH2Half,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH2Half,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun TitleH3(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH3,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH3,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun TitleH4(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH4,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH4,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun TitleH5(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeTitleH5,
        fontWeight: FontWeight? = FontWeight.SemiBold,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightTitleH5,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun CallOut(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeCallOut,
        fontWeight: FontWeight? = FontWeight.Normal,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightCallOut,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun Body(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeBody,
        fontWeight: FontWeight? = FontWeight.Normal,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightBody,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun Caption(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeCaption,
        fontWeight: FontWeight? = FontWeight.Normal,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightCaption,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun Footnote(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textSecondary,
        fontSize: TextUnit = TomTheme.dimens.textSizeFootnote,
        fontWeight: FontWeight? = FontWeight.Normal,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightFootnote,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )

    @Composable
    fun XXSmall(
        modifier: Modifier = Modifier,
        text: String? = null,
        textAnnotated: AnnotatedString? = null,
        color: Color = TomTheme.colors.textPrimary,
        fontSize: TextUnit = TomTheme.dimens.textSizeXxSmall,
        fontWeight: FontWeight? = FontWeight.Normal,
        fontFamily: FontFamily? = montserrat(),
        letterSpacing: TextUnit = TextUnit.Unspecified,
        textDecoration: TextDecoration? = null,
        textAlign: TextAlign? = null,
        lineHeight: TextUnit = TomTheme.dimens.lineHeightXxSmall,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        maxLines: Int = Int.MAX_VALUE
    ) = TomTexts(
        text = text,
        modifier = modifier,
        textAnnotated = textAnnotated,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        maxLines = maxLines
    )
}
