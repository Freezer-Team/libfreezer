import com.android.build.api.dsl.LibraryExtension

plugins {
    id("com.android.base")
    id("com.android.library")
}

configure<LibraryExtension> {
    namespace = "io.github.libxposed.api"

    defaultConfig {
        minSdk = 29
        compileSdk = 37
    }

    lint {
        targetSdk = 37
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.10.0")
    compileOnly("io.github.libxposed:annotation:1.0.0")
}
