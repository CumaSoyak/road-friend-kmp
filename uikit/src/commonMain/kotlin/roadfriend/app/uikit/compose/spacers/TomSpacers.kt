package roadfriend.app.uikit.compose.spacers

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Deprecated(
    message = "Use TomVerticalSpacer(space: Dp) instead.",
    replaceWith = ReplaceWith("TomVerticalSpacer(...)")
)
@Composable
fun TomSpacerVerticalHeight(height: Dp) {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
    )
}

@Deprecated(
    message = "Use TomSpacer(space: Dp) instead.",
    replaceWith = ReplaceWith("TomSpacer()")
)
@Composable
fun ColumnScope.TomSpacerVerticalHeightFull(modifier: Modifier = Modifier) {
    Spacer(
        modifier = modifier
            .fillMaxWidth()
            .weight(1f)
    )
}

@Deprecated(
    message = "Use TomSpacer(space: Dp) instead.",
    replaceWith = ReplaceWith("TomSpacer(...)")
)
@Composable
fun RowScope.TomSpacerHorizontal(modifier: Modifier? = null) {
    Spacer(modifier = (modifier ?: Modifier.fillMaxHeight()).weight(1f))
}

@Composable
fun TomHorizontalSpacer(space: Dp) {
    Spacer(modifier = Modifier.width(space))
}

@Composable
fun TomVerticalSpacer(space: Dp) {
    Spacer(modifier = Modifier.height(space))
}

@Composable
fun RowScope.TomSpacer(space: Dp? = null) {
    val modifier = if (space == null) {
        Modifier.weight(1f)
    } else {
        Modifier.width(space)
    }
    Spacer(modifier = modifier)
}

@Composable
fun ColumnScope.TomSpacer(space: Dp? = null) {
    val modifier = if (space == null) {
        Modifier.weight(1f)
    } else {
        Modifier.height(space)
    }
    Spacer(modifier = modifier)
}
