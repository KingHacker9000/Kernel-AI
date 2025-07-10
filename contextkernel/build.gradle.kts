plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ash.contextkernel"
    compileSdk = 35

    defaultConfig {
        minSdk = 34
        targetSdk = 35
    }
}

dependencies {
    // TODO: add library dependencies
}
