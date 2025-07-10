plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 35

    defaultConfig {
        applicationId = "com.myco.sampleapp"
        minSdk = 34
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    // TODO: add application dependencies
}
