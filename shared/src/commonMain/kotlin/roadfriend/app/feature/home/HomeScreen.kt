package roadfriend.app.feature.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import roadfriend.app.core.base.BaseComposableScreen
import roadfriend.app.presentation.navigation.Destinations
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.texts.clickable.TomClickableText
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.utils.koinViewModel

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HomeScreen(
    vM: HomeViewModel = koinViewModel(),
    navController: NavController
) {
    BaseComposableScreen(vM) { state, event ->
        TomTexts.NumberN1(
            text = state.isPassbookActive,
            fontWeight = FontWeight.Normal
        )
        TomClickableText(
            modifier = Modifier
                .padding(all = TomTheme.dimens.dp32)
                .fillMaxWidth(),
            prefixText = "Aydınlatma Metni",
            allText = "Aydınlatma Metni",
            textAlign = TextAlign.Center,
            onClickText = {
                event(HomeCR.Event.ReloadData)
                navController.navigate(Destinations.Onboarding)

            }
        )
    }

}