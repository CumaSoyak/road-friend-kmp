package roadfriend.app.uikit.compose.texts.clickable
/*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.ui.tooling.preview.Preview
import roadfriend.app.uikit.compose.spacers.TomVerticalSpacer
import roadfriend.app.uikit.compose.theme.TomTheme

@Preview
@Composable
internal fun TomClickableTextPreview() {
    TomTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = TomTheme.dimens.dp16)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center
        ) {

            TomClickableText(
                prefixText = "Bankacılık Hizmetleri Sözleşmesi",
                allText = "Bankacılık Hizmetleri Sözleşmesi’ni okudum, onaylıyorum.",
                onClickText = {
                    println("onClickText")
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                prefixText = "Hesap Açılışı Sözleşmesi",
                allText = "Hesap Açılışı Sözleşmesi’ni okudum, onaylıyorum.",
                onClickPrefixText = {
                    println("onClickText")
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                prefixText = "Temel Bankacılık Ürün Bilgilendirme Formu",
                allText = "Temel Bankacılık Ürün Bilgilendirme Formu’nu okudum, onaylıyorum.",
                onClickPrefixText = {
                    println("onClickText")
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                modifier = Modifier.fillMaxWidth(),
                prefixText = "Aydınlatma Metni",
                allText = "Aydınlatma Metni",
                textAlign = TextAlign.Center,
                isUnderline = true,
                onClickPrefixText = {
                    println("onClickText")                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                modifier = Modifier.fillMaxWidth(),
                prefixText = "",
                allText = "Aydınlatma Metni",
                textAlign = TextAlign.Center,
                isUnderline = false,
                onClickText = {
                    println("onClickText")
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                modifier = Modifier.fillMaxWidth(),
                prefixText = "",
                allText = "Mr.Sanchez",
                textAlign = TextAlign.Center,
                isUnderline = false
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                modifier = Modifier.fillMaxWidth(),
                prefixText = "Açık Rıza Metni",
                allText = "Kişisel verilerimin işlenmesine ve aktarılmasına Açık Rıza Metni kapsamında onay veriyorum.",
                isUnderline = false,
                onClickPrefixText = {
                    println("onClickText")
                }
            )
            TomVerticalSpacer(space = TomTheme.dimens.dp16)
            TomClickableText(
                modifier = Modifier.fillMaxWidth(),
                prefixText = "",
                allText = "T.O.M. Katılım Bankası A.Ş.’nin telefon numaram ve e-posta adresim üzerinden tarafıma ticari elektronik " +
                    "ileti göndermesini kabul ediyorum.",
                textAlign = TextAlign.Start,
                isUnderline = false,
                onClickPrefixText = {
                    println("onClickText")
                }
            )
        }
    }
}
*/