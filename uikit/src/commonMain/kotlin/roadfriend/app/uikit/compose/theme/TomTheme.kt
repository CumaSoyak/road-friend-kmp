package roadfriend.app.uikit.compose.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Typography
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import roadfriend.app.uikit.compose.theme.color.TomColors
import roadfriend.app.uikit.compose.theme.dimension.TomDimension
import roadfriend.app.uikit.compose.theme.shape.TomShapes
import roadfriend.app.uikit.compose.theme.typography.TomTypography


@Composable
fun TomSurfacedContent(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium, // Default shape from MaterialTheme
    color: Color = MaterialTheme.colorScheme.background, // Default color from MaterialTheme
    contentColor: Color = contentColorFor(color),
    border: BorderStroke? = null,
    elevation: Dp = 0.dp, // Default elevation
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        border = border,
        shadowElevation = elevation,
        content = content
    )
}

@Composable
fun TomTheme(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium,
    color: Color = MaterialTheme.colorScheme.secondary,
  //  shape: Shape = TomShapes.default().rectangle,
  //  color: Color = TomColors.default().backgroundSecondary,
    elevation: Dp = TomDimension.default().dp0,
    colors: TomColors = TomColors.default(),
    border: BorderStroke? = null,
    typography: TomTypography = TomTypography.default(),
    dimens: TomDimension = TomDimension.default(),
    shapes: TomShapes = TomShapes.default(),
    content: @Composable () -> Unit,
) {
    TomProvideResources(colors, typography, shapes, dimens) {
        MaterialTheme(
            colorScheme = lightColorScheme(), // Customize the color scheme as needed
            typography = Typography(), // Customize typography as needed
            shapes = Shapes(), // Customize shapes as needed
        ) {
            TomSurfacedContent(
                modifier = modifier,
                shape = shape,
                color = color,
                border = border,
                elevation = elevation,
                content = content
            )
        }
    }
}


@Composable
fun TomProvideResources(
    colors: TomColors,
    typography: TomTypography,
    shapes: TomShapes,
    dimens: TomDimension,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalTomColors provides colors,
        LocalTomTypography provides typography,
        LocalTomShapes provides shapes,
        LocalTomDimens provides dimens
    ) {
        ProvideTextStyle(value = typography.bodyMedium, content = content)
    }
}

internal val LocalTomColors = staticCompositionLocalOf<TomColors> {
    error("No colors provided! Make sure to wrap all usages of Tom components.")
}

internal val LocalTomTypography = staticCompositionLocalOf<TomTypography> {
    error("No typography provided! Make sure to wrap all usages of Tom components.")
}

internal val LocalTomShapes = staticCompositionLocalOf<TomShapes> {
    error("No shapes provided! Make sure to wrap all usages of Tom components.")
}

internal val LocalTomDimens = staticCompositionLocalOf<TomDimension> {
    error("No dimens provided! Make sure to wrap all usages of Tom components.")
}

val MaterialTheme.tomColors: TomColors
    @Composable
    @ReadOnlyComposable
    get() = LocalTomColors.current

val MaterialTheme.tomTypography: TomTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTomTypography.current

val MaterialTheme.tomShapes: TomShapes
    @Composable
    @ReadOnlyComposable
    get() = LocalTomShapes.current

val MaterialTheme.tomDimens: TomDimension
    @Composable
    @ReadOnlyComposable
    get() = LocalTomDimens.current

/**
 * Contains functions to access the current theme values provided at the call site's position in
 * the hierarchy.
 */
object TomTheme {
    val colors: TomColors
        @Composable
        @ReadOnlyComposable
        get() = LocalTomColors.current

    val typography: TomTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTomTypography.current

    val shapes: TomShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalTomShapes.current

    val dimens: TomDimension
        @Composable
        @ReadOnlyComposable
        get() = LocalTomDimens.current
}