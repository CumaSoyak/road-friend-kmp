@file:Suppress("MagicNumber")

package roadfriend.app.uikit.compose.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class TomColors(
    val textPrimary: Color,// Siyah
    val black: Color,// Siyah
    val background: Color, // Beyaz
    val white: Color, // Beyaz
    val divider: Color, // Gri Açık
    val textSecondary: Color, // Gri Koyu
    val buttonColor: Color, // Yeşil
    val accentColor: Color, // Açık Mavi
    val textLight: Color, // Beyaz (Karanlık arka planda)
    val errorColor: Color, // Kırmızı (Hata durumu)
    val warningColor: Color, // Turuncu (Uyarı durumu)
    val successColor: Color, // Yeşil Açık (Başarı durumu)
    val linkColor: Color, // Mavi (Bağlantılar için)
    val disabledColor: Color, // Gri Açık (Devre dışı)
    val shadowColor: Color, // Koyu Gri (Gölge)
    val highlightColor: Color, // Açık Mavi (Vurgu)
    val backgroundDark: Color, // Koyu Gri (Karanlık mod)
    val inputFieldBackground: Color, // Giriş alanları
    val overlayColor: Color // Siyah (Yarı saydam)
) {
    companion object {
        fun default(): TomColors = TomColors(
            textPrimary = Color(0xFF000000), // Siyah
            black = Color(0xFF000000), // Siyah
            background = Color(0xFFFFFFFF), // Beyaz
            white = Color(0xFFFFFFFF), // Beyaz
            divider = Color(0xFFE0E0E0), // Gri Açık
            textSecondary = Color(0xFF7E7E7E), // Gri Koyu
            buttonColor = Color(0xFF22D46D), // Yeşil
            accentColor = Color(0xFF276EF1), // Açık Mavi
            textLight = Color(0xFFFFFFFF), // Beyaz (Karanlık arka planda)
            errorColor = Color(0xFFFF3D00),// Kırmızı (Hata durumu)
            warningColor = Color(0xFFFFAA00), // Turuncu (Uyarı durumu)
            successColor = Color(0xFF76FF03),// Yeşil Açık (Başarı durumu)
            linkColor = Color(0xFF1E88E5), // Mavi (Bağlantılar için)
            disabledColor = Color(0xFFB0BEC5), // Gri Açık (Devre dışı)
            shadowColor = Color(0x40000000),// Koyu Gri (Gölge)
            highlightColor = Color(0xFFBBDEFB), // Açık Mavi (Vurgu)
            backgroundDark = Color(0xFF121212), // Koyu Gri (Karanlık mod)
            inputFieldBackground = Color(0xFFF1F1F1), // Giriş alanları
            overlayColor = Color(0x80000000) // Siyah (Yarı saydam)

        )
        fun TomColors.toColorScheme(): ColorScheme {
            return lightColorScheme(
                primary = this.accentColor, // Ana renk
                onPrimary = this.white, // Ana renk üzerindeki metin rengi
                secondary = this.buttonColor, // İkincil renk
                onSecondary = this.white, // İkincil renk üzerindeki metin rengi
                background = this.background, // Arka plan rengi
                onBackground = this.textPrimary, // Arka plan üzerindeki metin rengi
                surface = this.white, // Yüzey rengi
                onSurface = this.textPrimary, // Yüzey üzerindeki metin rengi
                error = this.errorColor, // Hata rengi
                onError = this.white, // Hata üzerindeki metin rengi
                // İsterseniz daha fazla alan ekleyebilirsiniz:
                // Örnek olarak
                // outline = this.divider,
                // onOutline = this.textSecondary
            )
        }
    }
}
