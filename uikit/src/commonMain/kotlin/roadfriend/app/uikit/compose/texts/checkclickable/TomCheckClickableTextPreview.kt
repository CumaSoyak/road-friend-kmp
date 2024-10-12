package roadfriend.app.uikit.compose.texts.checkclickable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import roadfriend.app.uikit.compose.spacers.TomVerticalSpacer
import roadfriend.app.uikit.compose.theme.TomTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
internal fun TomCheckClickableTextPreview() {
    TomTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = TomTheme.dimens.dp16)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center
        ) {
            var checked by remember { mutableStateOf(false) }
            var checked2 by remember { mutableStateOf(true) }
            var checked3 by remember { mutableStateOf(false) }
            TomCheckClickableText(
                modifier = Modifier
                    .background(TomTheme.colors.buttonColor)
                    .padding(TomTheme.dimens.dp4),
                modifierCheckBox = Modifier.padding(
                    top = TomTheme.dimens.dp2,
                    end = TomTheme.dimens.dp8
                ),
                checked = checked,
                prefixText = "Açık Rıza Metni",
                allText = "Kişisel verilerimin işlenmesine ve aktarılmasına Açık Rıza Metni kapsamında onay veriyorum.",
                onClickPrefixText = {
                    checked = it
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomCheckClickableText(
                modifierCheckBox = Modifier.padding(
                    top = TomTheme.dimens.dp2,
                    end = TomTheme.dimens.dp8
                ),
                checked = checked2,
                prefixText = "",
                allText = "T.O.M. Katılım Bankası A.Ş.’nin telefon numaram ve e-posta adresim üzerinden tarafıma ticari elektronik ileti " +
                    "göndermesini kabul ediyorum.",
                onClickRow = {
                    checked2 = it
                },
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomCheckClickableText(
                modifierCheckBox = Modifier.padding(
                    top = TomTheme.dimens.dp2,
                    end = TomTheme.dimens.dp8
                ),
                checked = checked3,
                prefixText = "Açık Rıza Metni",
                allText = "Kişisel verilerimin işlenmesine ve aktarılmasına Açık Rıza Metni kapsamında onay veriyorum.",
                onClickRow = {
                    checked3 = it
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomCheckClickableText(
                modifierCheckBox = Modifier
                    .padding(end = TomTheme.dimens.dp8)
                    .align(Alignment.CenterHorizontally),
                checked = checked2,
                prefixText = "",
                allText = "T.O.M. Katılım Bankası A.Ş.’nin telefon numaram ve e-posta adresim üzerinden tarafıma ticari elektronik ileti " +
                    "göndermesini kabul ediyorum.",
                onClickRow = {
                    checked2 = it
                }
            )
        }
    }
}
