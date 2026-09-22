plugins {
    id("com.android.library")
}

android {
    namespace = "io.github.libxposed.api"

    defaultConfig {
        minSdk = 29
        compileSdk = 37
    }

    lint {
        targetSdk = 37
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.10.0")
    compileOnly("io.github.libxposed:annotation:1.0.0")
}
