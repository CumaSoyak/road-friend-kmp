package roadfriend.app.uikit.compose.buttons.defaults

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.ui.tooling.preview.Preview
import roadfriend.app.uikit.compose.theme.TomTheme

@Preview
@Composable
internal fun TomButtonsPreview() {
    TomTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(TomTheme.dimens.dp12)
                .verticalScroll(rememberScrollState())
        ) {
            TomButtons.Primary(
                text = "Primary",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                textAlign = TextAlign.Center,
                buttonSizes = TomButtonSizes.large(),
                onClick = {}
            )

            TomButtons.Primary(
                text = "Primary Next",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                shape = RoundedCornerShape(TomTheme.dimens.dp10),
                buttonSizes = TomButtonSizes.large(),
                textAlign = TextAlign.Start,
                iconSide = IconSide.RIGHT,
              //  icon = painterResource(resource = DrawableResource .drawable.tom_ic_next),
                iconTint = TomTheme.colors.white,
                onClick = {}
            )

            TomButtons.Neutral(
                text = "Neutral",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                onClick = {}
            )

            TomButtons.Neutral(
                text = "Neutral - Icon",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                iconSide = IconSide.CENTER_LEFT,
              //  icon = painterResource(id = R.drawable.tom_ic_plus),
                iconTint = TomTheme.colors.black,
                onClick = {}
            )

            TomButtons.Neutral(
                text = "NeutralPrimary",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
               // textColor = TomTheme.colors.textPurple,
                onClick = {}
            )

            TomButtons.Neutral(
                text = "NeutralSecondary",
                modifier = Modifier.padding(TomTheme.dimens.dp6),
                buttonColors = TomButtonsColors.neutralLight(),
                buttonSizes = TomButtonSizes.medium(),
                textColor = TomTheme.colors.textSecondary,
                onClick = {}
            )

            TomButtons.Semantic(
                text = "Semantic",
                modifier = Modifier.padding(TomTheme.dimens.dp6),
                buttonSizes = TomButtonSizes.medium(),
                onClick = {}
            )

            TomButtons.Text(
                text = "Text",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                textColor = TomTheme.colors.textPrimary,
                onClick = {}
            )

            TomButtons.Text(
                text = "TextPrimary",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                textColor = TomTheme.colors.black,
                onClick = {}
            )

            TomButtons.Text(
                text = "TextSecondary",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                textColor = TomTheme.colors.textSecondary,
                onClick = {}
            )

            TomButtons.Outlined(
                text = "OutlinedPrimary",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                onClick = {}
            )

            TomButtons.Outlined(
                text = "OutlinedPrimary Next",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(TomTheme.dimens.dp6),
                textAlign = TextAlign.Start,
                iconSide = IconSide.RIGHT,
              //  icon = painterResource(id = R.drawable.tom_ic_next),
                iconTint = TomTheme.colors.black,
                onClick = {}
            )
        }
    }
}
