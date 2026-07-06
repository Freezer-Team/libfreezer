import com.android.build.api.dsl.LibraryExtension

plugins {
    id("com.android.base")
    id("com.android.library")
}

configure<LibraryExtension> {
    namespace = "nep.timeline.freezer.core.script.api"

    defaultConfig {
        minSdk = 29
        compileSdk = 37
    }

    lint {
        targetSdk = 37
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    compileOnly(project(":app"))
}
