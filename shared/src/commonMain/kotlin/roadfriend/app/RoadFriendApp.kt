package roadfriend.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun RoadFriendApp(
) {
    TomTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(TomTheme.dimens.dp16),
            verticalArrangement = Arrangement.Center
        ) {

            TomTexts.NumberN1(text = "NumberN1-Normal", fontWeight = FontWeight.Normal)
        }
    }
}
