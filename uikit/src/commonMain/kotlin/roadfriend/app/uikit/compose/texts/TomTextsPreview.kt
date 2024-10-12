package roadfriend.app.uikit.compose.texts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.ui.tooling.preview.Preview
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.uikit.compose.theme.color.TomColors

@Preview
@Composable
internal fun TomTextsPreview() {
    TomTheme(color = TomColors.default().background) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(TomTheme.dimens.dp16)
        ) {
            TomTexts.NumberN1(text = "NumberN1-Normal", fontWeight = FontWeight.Normal)
            TomTexts.NumberN1(
                text = "NumberN1-Purple",
                color = TomTheme.colors.buttonColor
            )
            TomTexts.NumberN1(text = "NumberN1-Medium", fontWeight = FontWeight.Medium)
            TomTexts.NumberN1(
                text = "NumberN1-Blue",
                color = TomTheme.colors.disabledColor
            )
            TomTexts.NumberN1(
                text = "NumberN1",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.TitleH1(text = "TitleH1", color = TomTheme.colors.textPrimary)
            TomTexts.TitleH2(text = "TitleH2", color = TomTheme.colors.textPrimary)
            TomTexts.TitleH2Half(
                text = "TitleH2Half",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.TitleH3(text = "TitleH3", color = TomTheme.colors.textPrimary)
            TomTexts.TitleH4(text = "TitleH4", color = TomTheme.colors.textPrimary)
            TomTexts.TitleH5(text = "TitleH5", color = TomTheme.colors.textPrimary)
            TomTexts.CallOut(
                text = "CallOut-Bold",
                fontWeight = FontWeight.Bold,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.CallOut(
                text = "CallOut-Medium",
                fontWeight = FontWeight.Medium,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.CallOut(
                text = "CallOut-Regular",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Body(
                text = "Body-Bold",
                fontWeight = FontWeight.Bold,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Body(
                text = "Body-Medium",
                fontWeight = FontWeight.Medium,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Body(
                text = "Body-Regular",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Caption(
                text = "Caption-Bold",
                fontWeight = FontWeight.Bold,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Caption(
                text = "Caption-Medium",
                fontWeight = FontWeight.Medium,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Caption(
                text = "Caption-Regular",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Footnote(
                text = "Footnote-Bold",
                fontWeight = FontWeight.Bold,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Footnote(
                text = "Footnote-Medium",
                fontWeight = FontWeight.Medium,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.Footnote(
                text = "Footnote-Regular",
                color = TomTheme.colors.textPrimary
            )
            TomTexts.XXSmall(
                text = "XXSmall-Bold",
                fontWeight = FontWeight.Bold,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.XXSmall(
                text = "XXSmall-Medium",
                fontWeight = FontWeight.Medium,
                color = TomTheme.colors.textPrimary
            )
            TomTexts.XXSmall(
                text = "XXSmall-Regular",
                color = TomTheme.colors.textPrimary
            )
        }
    }
}
