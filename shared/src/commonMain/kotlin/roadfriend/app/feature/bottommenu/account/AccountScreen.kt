package roadfriend.app.feature.bottommenu.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import road_friend_kmp.shared.generated.resources.Res
import road_friend_kmp.shared.generated.resources.home_filled
import roadfriend.app.core.base.BaseComposableScreen
import roadfriend.app.uikit.compose.BaseScaffold
import roadfriend.app.uikit.compose.items.TomMenuList
import roadfriend.app.uikit.compose.items.TomSelectionState
import roadfriend.app.uikit.compose.theme.TomTheme
import roadfriend.app.utils.koinViewModel

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */

@Composable
fun AccountScreen(
    vM: AccountViewModel = koinViewModel(),
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
                    TomMenuList(
                        items = getDrawerContent()
                    ) {

                    }
                }
            }
        }
    }

}

private fun getDrawerContent(): List<TomSelectionState> = listOf(
    TomSelectionState(
        text = "Cuma",
        icon = Res.drawable.home_filled
    ),
    TomSelectionState(
        text = "Ahsen",
        icon = Res.drawable.home_filled
    ),
    TomSelectionState(
        text = "Hume",
        icon = Res.drawable.home_filled
    )
)
