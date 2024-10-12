package roadfriend.app.uikit.compose.theme.shape

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Suppress("MagicNumber")
@Immutable
data class TomShapes(
    val avatar: Shape,
    val bottomSheet: Shape,
    val button1: Shape,
    val button2: Shape,
    val card: Shape,
    val rectangle: Shape,
    val circle: Shape,
    val halfPercent: Shape
) {
    companion object {
        fun default(): TomShapes = TomShapes(
            avatar = CircleShape,
            bottomSheet = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            button1 = RoundedCornerShape(10),
            button2 = RoundedCornerShape(12.dp),
            card = RoundedCornerShape(size = 10.dp),
            rectangle = RectangleShape,
            circle = CircleShape,
            halfPercent = RoundedCornerShape(50)
        )

        // Material 3'ün Shapes sınıfına göre TomShapes'i uyarlama
        val customShapes = Shapes(
            extraSmall = default().button1 as RoundedCornerShape,  // Küçük elemanlar için button1
            small = default().button2 as RoundedCornerShape,       // Daha küçük elemanlar için button2
            medium = default().card as RoundedCornerShape,         // Orta boyutlu elemanlar için card şekli
            large = default().bottomSheet as RoundedCornerShape,   // Büyük elemanlar için bottomSheet şekli
            extraLarge = default().halfPercent as RoundedCornerShape // En büyük elemanlar için halfPercent şekli
        )
    }
}
