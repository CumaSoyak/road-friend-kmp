package roadfriend.app.feature.bottommenu.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import roadfriend.app.core.base.BaseComposableScreen
import roadfriend.app.uikit.compose.BaseScaffold
import roadfriend.app.uikit.compose.buttons.defaults.TomButtons
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.utils.koinViewModel

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */

@Composable
fun HomeScreen(
    vM: HomeViewModel = koinViewModel(),
    navController: NavController
) {
    BaseComposableScreen(vM) { state, event ->
        val scaffoldState = rememberScaffoldState()
        BaseScaffold(
            modifier = Modifier.fillMaxSize(),
            isTopCornerRadiusEnable = true
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .padding(TomTheme.dimens.dp16),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.spacedBy(TomTheme.dimens.dp8)
                ) {
                    TomButtons.Primary(
                        text = "HomeViewModel",
                        onClick = {},
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }

}
