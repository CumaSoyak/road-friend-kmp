package roadfriend.app.uikit.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun BaseScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    backgroundColor: Color = TomTheme.colors.background,
    isTopCornerRadiusEnable: Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        containerColor = backgroundColor,
        topBar = { topBar() },
        content = { insetPadding ->
            if (isTopCornerRadiusEnable) {
                Box(
                    modifier = Modifier
                        .padding(insetPadding)
                        .clip(
                            shape = RoundedCornerShape(
                                topStart = TomTheme.dimens.dp12,
                                topEnd = TomTheme.dimens.dp12
                            )
                        )
                        .background(color = backgroundColor)
                        .fillMaxSize()
                ) { content(insetPadding) }
            } else {
                content(insetPadding)
            }
        }
    )
}
