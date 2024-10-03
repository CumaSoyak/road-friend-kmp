package roadfriend.app.uikit.compose.extension

/**
 * @Author: cuma soyak
 * @Date: 2.10.2024
 */

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp



fun highlightedAnnotatedStringIndex(
    prefixText: String,
    allText: String,
): Pair<Int, Int> {
    val startIndex = if (prefixText.isNotEmpty()) {
        allText.indexOf(prefixText)
    } else -1

    val endIndex = if (startIndex == 0) {
        prefixText.length
    } else if (startIndex > 0) {
        startIndex + prefixText.length
    } else {
        allText.length
    }
    return Pair(startIndex, endIndex)
}

@Composable
fun highlightedAnnotatedString(
    prefixTextColor: Color = Color.Magenta,
    prefixText: String,
    allText: String,
    prefixFontSize: TextUnit = 14.sp,
    isUnderline: Boolean = false
): AnnotatedString {
    val indexPair = highlightedAnnotatedStringIndex(prefixText, allText)
    return remember(allText, prefixText) {
        if (allText.contains(prefixText)) {
            buildAnnotatedString {
                append(allText)
                addStyle(
                    style = SpanStyle(
                        color = prefixTextColor,
                        textDecoration = if (isUnderline) TextDecoration.Underline else TextDecoration.None,
                        fontSize = prefixFontSize
                    ),
                    start = indexPair.first,
                    end = indexPair.second
                )
            }
        } else {
            buildAnnotatedString {
                append(allText)
            }
        }
    }
}