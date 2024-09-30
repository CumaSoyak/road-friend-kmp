plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}



kotlin {
    androidTarget {
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
            dependencies {
                api(libs.uikit.compose)
                api(libs.uikit.resources)

                api(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(libs.androidx.appcompat)
                implementation(libs.androidx.activity.compose)
                implementation(libs.kotlin.test)
                implementation(libs.viewbinding)
                implementation(libs.databinding.runtime)
                implementation(libs.androidx.lifecycle.viewmodel.compose)
                implementation(libs.androidx.navigation.compose)
            }
        }
        androidMain.dependencies {
            dependencies {
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

            }
        }
        iosMain.dependencies {
            dependencies {

            }
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
