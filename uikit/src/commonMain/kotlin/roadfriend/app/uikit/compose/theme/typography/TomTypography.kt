package roadfriend.app.uikit.compose.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import roadfriend.app.uikit.compose.fonts.montserrat
import roadfriend.app.uikit.compose.theme.color.TomColors
import roadfriend.app.uikit.compose.theme.dimension.TomDimension

@Immutable
data class TomTypography(
    val numberN1SemiBold: TextStyle,
    val titleH1SemiBold: TextStyle,
    val titleH2SemiBold: TextStyle,
    val titleH2HalfSemiBold: TextStyle,
    val titleH3SemiBold: TextStyle,
    val titleH4SemiBold: TextStyle,
    val titleH5SemiBold: TextStyle,
    val callOutSemiBold: TextStyle,
    val callOutMedium: TextStyle,
    val callOutRegular: TextStyle,
    val bodySemiBold: TextStyle,
    val bodyMedium: TextStyle,
    val bodyRegular: TextStyle,
    val captionSemiBold: TextStyle,
    val captionMedium: TextStyle,
    val captionRegular: TextStyle,
    val footnoteSemiBold: TextStyle,
    val footnoteMedium: TextStyle,
    val footnoteRegular: TextStyle,
    val xxSmallSemiBold: TextStyle,
    val xxSmallMedium: TextStyle,
    val xxSmallRegular: TextStyle
) {
    companion object {
        @Composable
        fun default(): TomTypography = TomTypography(
            numberN1SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeNumberN1,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightNumberN1,
                color = TomColors.default().textPrimary
            ),
            titleH1SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH1,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH1,
                color = TomColors.default().textPrimary
            ),
            titleH2SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH2,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH2,
                color = TomColors.default().textPrimary
            ),
            titleH2HalfSemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH2Half,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH2Half,
                color = TomColors.default().textPrimary
            ),
            titleH3SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH3,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH3,
                color = TomColors.default().textPrimary
            ),
            titleH4SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH4,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH4,
                color = TomColors.default().textPrimary
            ),
            titleH5SemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeTitleH5,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightTitleH5,
                color = TomColors.default().textPrimary
            ),
            callOutSemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCallOut,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightCallOut,
                color = TomColors.default().textSecondary
            ),
            callOutMedium = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCallOut,
                fontWeight = FontWeight.Medium,
                lineHeight = TomDimension.default().lineHeightCallOut,
                color = TomColors.default().textSecondary
            ),
            callOutRegular = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCallOut,
                fontWeight = FontWeight.Normal,
                lineHeight = TomDimension.default().lineHeightCallOut,
                color = TomColors.default().textSecondary
            ),
            bodySemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeBody,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightBody,
                color = TomColors.default().textSecondary
            ),
            bodyMedium = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeBody,
                fontWeight = FontWeight.Medium,
                lineHeight = TomDimension.default().lineHeightBody,
                color = TomColors.default().textSecondary
            ),
            bodyRegular = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeBody,
                fontWeight = FontWeight.Normal,
                lineHeight = TomDimension.default().lineHeightBody,
                color = TomColors.default().textSecondary
            ),
            captionSemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCaption,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightCaption,
                color = TomColors.default().textSecondary
            ),
            captionMedium = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCaption,
                fontWeight = FontWeight.Medium,
                lineHeight = TomDimension.default().lineHeightCaption,
                color = TomColors.default().textSecondary
            ),
            captionRegular = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeCaption,
                fontWeight = FontWeight.Normal,
                lineHeight = TomDimension.default().lineHeightCaption,
                color = TomColors.default().textSecondary
            ),
            footnoteSemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeFootnote,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightFootnote,
                color = TomColors.default().textSecondary
            ),
            footnoteMedium = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeFootnote,
                fontWeight = FontWeight.Medium,
                lineHeight = TomDimension.default().lineHeightFootnote,
                color = TomColors.default().textSecondary
            ),
            footnoteRegular = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeFootnote,
                fontWeight = FontWeight.Normal,
                lineHeight = TomDimension.default().lineHeightFootnote,
                color = TomColors.default().textSecondary
            ),
            xxSmallSemiBold = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeXxSmall,
                fontWeight = FontWeight.SemiBold,
                lineHeight = TomDimension.default().lineHeightXxSmall,
                color = TomColors.default().textSecondary
            ),
            xxSmallMedium = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeXxSmall,
                fontWeight = FontWeight.Medium,
                lineHeight = TomDimension.default().lineHeightXxSmall,
                color = TomColors.default().textSecondary
            ),
            xxSmallRegular = TextStyle(
                fontFamily = montserrat(),
                fontSize = TomDimension.default().textSizeXxSmall,
                fontWeight = FontWeight.Normal,
                lineHeight = TomDimension.default().lineHeightXxSmall,
                color = TomColors.default().textSecondary
            )
        )
    }
}
