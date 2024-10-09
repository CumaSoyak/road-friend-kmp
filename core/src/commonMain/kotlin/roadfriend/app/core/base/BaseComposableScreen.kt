package roadfriend.app.core.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue


/**
 * @Author: cuma soyak
 * @Date: 4.10.2024
 */

@Composable
fun <VM : TomStateViewModel<STATE, EVENT>, STATE, EVENT> BaseComposableScreen(
    viewModel: VM,
    content: @Composable (state: STATE, event: (EVENT) -> Unit) -> Unit
) {
    val state by viewModel.state.collectAsState()
    val event = viewModel::onTriggerEvent

    content(state, event)
}