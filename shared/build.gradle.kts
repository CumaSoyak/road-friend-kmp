import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinX.serialization.plugin)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

kotlin {


    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "shared"
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":uikit"))
            implementation(project(":extension"))
            implementation(project(":core"))

            api(libs.koin.core)
            implementation(libs.koin.compose)

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(compose.materialIconsExtended)
            implementation(libs.kotlinX.serializationJson)
            implementation(libs.material3.window.size.multiplatform)
            implementation(libs.coroutines.extensions)
            implementation(libs.primitive.adapters)

            api(libs.multiplatformSettings.noArg)
            api(libs.multiplatformSettings.coroutines)

            implementation(libs.androidx.lifecycle.viewmodel.compose)
            implementation(libs.androidx.navigation.compose)



        }
        androidMain.dependencies {

            implementation(libs.androidx.appcompat)
            implementation(libs.androidx.activity.compose)
           // implementation(libs.viewbinding)
           // implementation(libs.databinding.runtime)
            implementation(libs.androidx.lifecycle.viewmodel.compose)
            implementation(libs.androidx.navigation.compose)

            implementation(libs.compose.ui.tooling.preview)
            // Multiplatform bağımlılıkları buraya ekleyin
            implementation(libs.firebase.functions)
            implementation(libs.firebase.auth)
            implementation(libs.firebase.firestore)
            implementation(libs.firebase.database)
            implementation(libs.firebase.storage)
            //implementation(libs.firebase.messaging)
            implementation(libs.firebase.functions)
            implementation(libs.firebase.analytics)
            implementation(libs.firebase.crashlytics)
            implementation(libs.koin.core)

            implementation(libs.koin.android)
            implementation(libs.koin.androidx.compose)
            implementation(libs.accompanist.systemUIController)



        }
        jvmMain.dependencies {

            implementation(libs.kotlinx.coroutines.swing)

            // JNA for Linux
            implementation("de.jangassen:jfa:1.2.0") {
                // not excluding this leads to a strange error during build:
                // > Could not find jna-5.13.0-jpms.jar (net.java.dev.jna:jna:5.13.0)
                exclude(group = "net.java.dev.jna", module = "jna")
            }

          }
        iosMain.dependencies {
            @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)
            implementation(compose.ui)
            implementation(compose.foundation)
            implementation(compose.material)


        }
    }

}

android {
    namespace = "roadfriend.app"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}
