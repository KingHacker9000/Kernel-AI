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

    sourceSets {
        getByName("main") {
            aidl.srcDirs("src/main/aidl")
        }
    }
}

dependencies {
    // TODO: add library dependencies
}
