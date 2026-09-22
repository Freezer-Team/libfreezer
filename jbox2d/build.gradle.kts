plugins {
    id("com.android.library")
}

android {
    namespace = "org.jbox2d"
    compileSdk = 37
    enableKotlin = false

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
        minSdk = 31
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
