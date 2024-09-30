plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.kotlinCocoapods) apply false

}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jcenter.bintray.com")
        gradlePluginPortal()
        maven("https://jitpack.io")
        maven("https://developer.huawei.com/repo/")
        mavenLocal { url = uri("${rootDir}/repos") }
        maven {
            isAllowInsecureProtocol = true
            setUrl("http://172.35.21.183:8081/repository/tom-mobile/")
            credentials {
                username = "mobile"
                password = "Ata1881%%"
            }
        }
    }
}


