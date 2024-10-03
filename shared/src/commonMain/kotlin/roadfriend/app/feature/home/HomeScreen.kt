package roadfriend.app.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import roadfriend.app.uikit.compose.texts.TomTexts

/**
 * @Author: cuma soyak
 * @Date: 3.10.2024
 */

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HomeScreen(navController: NavController) {
    TomTexts.NumberN1(text = "HomeScreen", fontWeight = FontWeight.Normal)

}