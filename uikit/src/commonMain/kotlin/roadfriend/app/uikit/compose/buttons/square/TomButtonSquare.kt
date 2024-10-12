package roadfriend.app.uikit.compose.buttons.square

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.theme.TomTheme

@Composable
fun TomButtonSquare(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    painter: Painter,
    text: String,
    textColor: Color = TomTheme.colors.textPrimary,
    textAlign: TextAlign = TextAlign.Center,
    isInRow: Boolean = false,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(TomTheme.dimens.dp10))
            .background(color = TomTheme.colors.white)
            .clickable(enabled = enabled, role = Role.Button, onClick = onClick)
            .padding(all = TomTheme.dimens.dp8)
            .then(Modifier),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .padding(
                    start = TomTheme.dimens.dp10,
                    end = TomTheme.dimens.dp10
                )
                .size(TomTheme.dimens.dp40)
        )
        if (isInRow) {
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .heightIn(min = TomTheme.dimens.dp4)
            )
            TomTexts.Footnote(
                modifier = Modifier
                    .padding(top = TomTheme.dimens.dp4),
                text = text,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                textAlign = textAlign
            )
        } else {
            TomTexts.Footnote(
                modifier = Modifier
                    .padding(top = TomTheme.dimens.dp8),
                text = text,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                textAlign = textAlign
            )
        }
    }
}
