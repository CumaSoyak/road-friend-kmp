package roadfriend.app.uikit.compose.items

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import roadfriend.app.uikit.compose.fonts.montserrat
import roadfriend.app.uikit.compose.texts.TomTexts
import roadfriend.app.uikit.compose.theme.TomTheme


@Composable
fun TomMenuList(
    items: List<TomSelectionState>,
    onSelectedItem: ((TomSelectionState) -> Unit)? = null,
) {
    LazyColumn(
        modifier = Modifier
            .padding(
                start = TomTheme.dimens.dp16,
                end = TomTheme.dimens.dp16,
                bottom = TomTheme.dimens.dp32
            )
            .fillMaxWidth()
            .clip(RoundedCornerShape(TomTheme.dimens.dp10))
    ) {
        itemsIndexed(items) { _, item ->
            TomMenuItems(
                text = item.text,
                textColor = item.textColor,
                icon = item.icon,
                iconTint = item.iconTint,
                textFontSize = item.textFontSize
            ) {
                if (onSelectedItem != null) {
                    onSelectedItem(item)
                }
            }
        }
    }
}

@Composable
fun TomMenuItems(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = TomTheme.colors.textPrimary,
    icon: DrawableResource? = null,
    iconTint: Color = TomTheme.colors.textPrimary,
    textAlign: TextAlign = TextAlign.Start,
    fontFamily: FontFamily = montserrat(),
    fontWeight: FontWeight = FontWeight.Medium,
    textFontSize: TextUnit = TomTheme.dimens.textSizeCaption,
    onSelectedItem: (() -> Unit)
) {

    Row(
        modifier = Modifier.fillMaxWidth().clickable {
            onSelectedItem.invoke()
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        TomTexts.Body(
            modifier = Modifier
                .weight(1f)
                .padding(end = TomTheme.dimens.dp4),
            text = text,
            color = textColor,
            fontWeight = fontWeight,
            fontSize = textFontSize,
            maxLines = 1
        )
        icon?.let {
            Icon(
                modifier = Modifier.size(TomTheme.dimens.dp12),
                painter = painterResource(icon),
                tint = iconTint,
                contentDescription = null
            )
        }

    }

}




