package roadfriend.app.plugins

object Libs {

    object Version {
        const val CoreKtx = "1.12.0"
        const val Appcompat = "1.6.1"
        const val Material = "1.9.0"
        const val ConstraintLayout = "2.1.4"
        const val Recyclerview = "1.3.0"
        const val Coil = "2.5.0"
        const val Navigation = "2.7.5"
        const val Coroutines = "1.8.0"
        const val Viewpager2 = "1.0.0"
        const val Timber = "5.0.1"
        const val PagingKtx = "3.1.1"
        const val ActivityKtx = "1.8.2"
        const val FragmentKtx = "1.6.2"
        const val Lifecycle = "2.6.2"
        const val Hilt = "2.51.1"

        const val OkHttp = "4.12.0"
        const val Retrofit = "2.11.0"
        const val Chucker = "3.5.2" //4.0.0
        const val Gson = "2.10.1"
        const val Moshi = "1.14.0"
        const val Okio = "3.2.0"

        const val Splashscreen = "1.0.1"
        const val Roborazzi = "1.13.0"
    }

    object Support {
        const val CoreKtx = "androidx.core:core-ktx:${Version.CoreKtx}"
        const val Appcompat = "androidx.appcompat:appcompat:${Version.Appcompat}"
        const val Material = "com.google.android.material:material:${Version.Material}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.ConstraintLayout}"

        const val CoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Coroutines}"
        const val CoroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.Coroutines}"

        const val Coil = "io.coil-kt:coil:${Version.Coil}"

        const val Timber = "com.jakewharton.timber:timber:${Version.Timber}"
        const val Paging = "androidx.paging:paging-runtime-ktx:${Version.PagingKtx}"

        const val ActivityKtx = "androidx.activity:activity-ktx:${Version.ActivityKtx}"
        const val FragmentKtx = "androidx.fragment:fragment-ktx:${Version.FragmentKtx}"

        const val Viewpager2 = "androidx.viewpager2:viewpager2:${Version.Viewpager2}"
        const val Recyclerview = "androidx.recyclerview:recyclerview:${Version.Recyclerview}"
        const val SwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

        const val Runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.Lifecycle}"
        const val LiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.Lifecycle}"

        const val Splashscreen = "androidx.core:core-splashscreen:${Version.Splashscreen}"

        const val LibPhoneNumber = "com.googlecode.libphonenumber:libphonenumber:8.13.11"
        const val Zxing = "com.google.zxing:core:3.5.1"
        const val DotIndicator = "ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.2.4"

        const val DesugarJdkLibs = "com.android.tools:desugar_jdk_libs:2.0.3"

        // debugImplementation because LeakCanary should only run in debug builds.
        const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:2.10"
        const val TooltipBalloons = "com.github.skydoves:balloon:1.5.3"

        const val Dexter = "com.karumi:dexter:6.2.3"
        const val Lottie = "com.airbnb.android:lottie:6.0.0"
        const val Glide = "com.github.bumptech.glide:glide:4.15.1"
        const val BerTlv = "com.payneteasy:ber-tlv:1.0-11"
        const val Guava = "com.google.guava:guava:30.1.1-android"
        const val GifDrawable = "pl.droidsonroids.gif:android-gif-drawable:1.2.25"
    }

    object Network {
        const val Gson = "com.google.code.gson:gson:${Version.Gson}"
        const val Moshi = "com.squareup.moshi:moshi-kotlin:${Version.Moshi}"
        const val MoshiLazyAdapter = "com.serjltt.moshi:moshi-lazy-adapters:2.2"
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
        const val RetrofitGson = "com.squareup.retrofit2:converter-gson:${Version.Retrofit}"
        const val RetrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Version.Retrofit}"

        // platform
        const val OkHttpBom = "com.squareup.okhttp3:okhttp-bom:${Version.OkHttp}"
        const val OkHttp = "com.squareup.okhttp3:okhttp"
        const val LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
        const val MockWebServer = "com.squareup.okhttp3:mockwebserver:${Version.OkHttp}"

        const val ChuckerDebug = "com.github.chuckerteam.chucker:library:${Version.Chucker}"
        const val ChuckerRelease = "com.github.chuckerteam.chucker:library-no-op:${Version.Chucker}"

        const val Okio = "com.squareup.okio:okio:${Version.Okio}"
    }

    object Storage {
        const val RoomKtx = "androidx.room:room-ktx:2.4.3"
        const val RoomCompiler = "androidx.room:room-compiler:2.4.3"
        const val DatastorePref = "androidx.datastore:datastore-preferences:1.0.0"
        const val Datastore = "androidx.datastore:datastore:1.0.0"
        const val SecurityPref = "androidx.security:security-crypto-ktx:1.1.0-alpha06"
    }

    object Hilt {
        const val Android = "com.google.dagger:hilt-android:${Version.Hilt}"
        const val Compiler = "com.google.dagger:hilt-compiler:${Version.Hilt}"
    }

    object Navigation {
        const val Fragment = "androidx.navigation:navigation-fragment-ktx:${Version.Navigation}"
        const val Ui = "androidx.navigation:navigation-ui-ktx:${Version.Navigation}"
        const val Dynamic =
            "androidx.navigation:navigation-dynamic-features-fragment:${Version.Navigation}"
    }

    object Firebase {
        const val Bom = "com.google.firebase:firebase-bom:32.3.1"
        const val Analytics = "com.google.firebase:firebase-analytics-ktx"
        const val Messaging = "com.google.firebase:firebase-messaging-ktx"
        const val Crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val RemoteConfig = "com.google.firebase:firebase-config-ktx"
        const val Performance = "com.google.firebase:firebase-perf-ktx"
    }

    object Huawei {
        const val Base = "com.huawei.hms:base:6.9.0.301"
        const val ConnectCore = "com.huawei.agconnect:agconnect-core:1.8.0.300"

        const val Face = "com.huawei.hms:ml-computer-vision-face:3.11.0.301"
        const val FeatureModel = "com.huawei.hms:ml-computer-vision-face-feature-model:3.7.0.301"
        const val EmotionModel = "com.huawei.hms:ml-computer-vision-face-emotion-model:3.7.0.301"
        const val ShapePointModel =
            "com.huawei.hms:ml-computer-vision-face-shape-point-model:3.7.0.301"
        const val Ocr = "com.huawei.hms:ml-computer-vision-ocr:3.11.0.301"
        const val OcrLatinModel = "com.huawei.hms:ml-computer-vision-ocr-latin-model:3.11.0.301"
    }

    object Google {
        const val SmsRetriever = "com.google.android.gms:play-services-auth-api-phone:18.0.1"
        const val TextRecognition =
            "com.google.android.gms:play-services-mlkit-text-recognition:19.0.0"
        const val FaceDetection = "com.google.android.gms:play-services-mlkit-face-detection:17.1.0"
        const val LocationServices = "com.google.android.gms:play-services-location:21.0.0"
    }

    object SpongyCastle {
        const val Core = "com.madgag.spongycastle:core:1.58.0.0"
        const val Prov = "com.madgag.spongycastle:prov:1.58.0.0"
        const val Pkix = "com.madgag.spongycastle:pkix:1.54.0.0"
        const val Pg = "com.madgag.spongycastle:pg:1.54.0.0"
    }

    object Camera {
        const val Core = "androidx.camera:camera-core:1.2.2"
        const val Camera2 = "androidx.camera:camera-camera2:1.2.2"
        const val Lifecycle = "androidx.camera:camera-lifecycle:1.2.2"
        const val View = "androidx.camera:camera-view:1.2.2"
        const val OtaliaStudios = "com.otaliastudios:cameraview:2.7.2"
    }

    object Test {
        const val Junit = "junit:junit:4.13.2"
        const val JunitExt = "androidx.test.ext:junit:1.1.5"
        const val EspressoCore = "androidx.test.espresso:espresso-core:3.5.1"
        const val Coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0"
        const val Truth = "com.google.truth:truth:1.4.2"
        const val Robolectric = "org.robolectric:robolectric:4.12"
        const val Turbine = "app.cash.turbine:turbine:1.1.0"
        const val Mockk = "io.mockk:mockk:1.13.10"
        const val Hamcrest = "org.hamcrest:hamcrest-library:2.2"
        const val Json = "org.json:json:20220924"
        const val Mockito = "org.mockito:mockito-core:5.3.1"
        const val Hilt = "com.google.dagger:hilt-android-testing:${Version.Hilt}"
        const val TestParameterInjector = "com.google.testparameterinjector:test-parameter-injector:1.9"
        const val Roborazzi = "io.github.takahirom.roborazzi:roborazzi:${Version.Roborazzi}"
        const val RoborazziCompose = "io.github.takahirom.roborazzi:roborazzi-compose:${Version.Roborazzi}"
        const val RoborazziJunitRule = "io.github.takahirom.roborazzi:roborazzi-junit-rule:${Version.Roborazzi}"
    }

    object UIKit {
        private const val version = "1.0.0"
        const val Compose = "roadfriend.app.uikit:uikit-compose:$version"
        const val Resources = "roadfriend.app.uikit:uikit-resources:$version"
    }

    object TomBank {
        object Extension {
            private const val version = "1.0.5"
            const val Core = "roadfriend.appbank.extension:core:$version"
            const val Compose = "roadfriend.appbank.extension:compose:$version"
        }
    }
}
