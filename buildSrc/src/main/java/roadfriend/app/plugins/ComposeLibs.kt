package roadfriend.app.plugins

/**
 * @Author: cuma soyak
 * @Date: 2.10.2024
 */
object ComposeLibs {

    object Version {
        const val Compiler = "1.5.12"
        const val Material3 = "1.1.2"
        const val ConstraintLayout = "1.0.1"
        const val Coil = "2.5.0"
        const val Navigation = "2.7.5"
        const val Accompanist = "0.32.0"
        const val Lifecycle = "2.6.2"
        const val Paging = "1.0.0-alpha19"
        const val Bom = "2024.01.00"
        const val Activity = "1.8.2"
        const val Balloon = "1.5.3"
    }

    const val BOM = "androidx.compose:compose-bom:${Version.Bom}"

    const val Ui = "androidx.compose.ui:ui"
    const val Graphic = "androidx.compose.ui:ui-graphics"
    const val Preview = "androidx.compose.ui:ui-tooling-preview"
    const val Material = "androidx.compose.material:material"
    const val Material3 = "androidx.compose.material3:material3"
    const val MaterialIconCore = "androidx.compose.material:material-icons-core"
    const val MaterialIconExtended = "androidx.compose.material:material-icons-extended"
    const val ComposeIcons = "androidx.compose.material:material-icons-extended"
    const val LiveData = "androidx.compose.runtime:runtime-livedata"
    const val Foundation = "androidx.compose.foundation:foundation"
    const val Util = "androidx.compose.ui:ui-util"

    const val Activity = "androidx.activity:activity-compose:${Version.Activity}"
    const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.Lifecycle}"
    const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-compose:${Version.Lifecycle}"

    const val ConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${Version.ConstraintLayout}"

    const val Coil = "io.coil-kt:coil-compose:${Version.Coil}"

    const val Navigation = "androidx.navigation:navigation-compose:${Version.Navigation}"
    const val ThemeAdapter =
        "com.google.accompanist:accompanist-themeadapter-material:${Version.Accompanist}"

    const val Theme3Adapter =
        "com.google.accompanist:accompanist-themeadapter-material3:${Version.Accompanist}"

    const val SystemUiController =
        "com.google.accompanist:accompanist-systemuicontroller:${Version.Accompanist}"
    const val Permission = "com.google.accompanist:accompanist-permissions:${Version.Accompanist}"
    const val FlowLayout = "com.google.accompanist:accompanist-flowlayout:${Version.Accompanist}"
    const val Adaptive = "com.google.accompanist:accompanist-adaptive:${Version.Accompanist}"
    const val Pager = "com.google.accompanist:accompanist-pager:${Version.Accompanist}"
    const val PagerIndicator =
        "com.google.accompanist:accompanist-pager-indicators:${Version.Accompanist}"
    const val PlaceholderMaterial =
        "com.google.accompanist:accompanist-placeholder-material:${Version.Accompanist}"
    const val WebView = "com.google.accompanist:accompanist-webview:${Version.Accompanist}"

    const val Paging = "androidx.paging:paging-compose:${Version.Paging}"

    const val Balloon = "com.github.skydoves:balloon-compose:${Version.Balloon}"

    object Test {
        const val Junit4 = "androidx.compose.ui:ui-test-junit4"
    }

    object Debug {
        const val Tooling = "androidx.compose.ui:ui-tooling"
        const val Manifest = "androidx.compose.ui:ui-test-manifest"
    }
}