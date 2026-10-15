plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.kotlin.plugin.serialization")
}

val ciRun = System.getenv("GITHUB_RUN_NUMBER")?.toIntOrNull() ?: 1

// Version from release-notes/CURRENT (e.g. "v2.0"). versionCode keeps rising past the 1.0.x builds.
val releaseTag = rootProject.file("release-notes/CURRENT").takeIf { it.exists() }?.readText()?.trim() ?: "v2.0"
val appVersion = releaseTag.removePrefix("v")

// Signing key: GitHub Actions Secrets in CI, keystore/lumisignal.jks locally. Never stored in the repo.
val keystorePath = System.getenv("LUMI_KEYSTORE_PATH") ?: rootProject.file("keystore/lumisignal.jks").path
val keystorePassword = System.getenv("LUMI_KEYSTORE_PASSWORD") ?: ""

android {
    namespace = "com.lumisignal.idx"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.lumisignal.idx"
        minSdk = 26
        targetSdk = 35
        versionCode = 2000 + ciRun
        versionName = appVersion
    }

    signingConfigs {
        create("release") {
            storeFile = file(keystorePath)
            storePassword = keystorePassword
            keyAlias = "lumi"
            keyPassword = keystorePassword
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
        debug {
            if (file(keystorePath).exists()) signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            all {
                it.systemProperty("lumi.screens", System.getProperty("lumi.screens") ?: "0")
                it.systemProperty("roborazzi.test.record", "true")
                // Screenshot checks need the debug-only test activity.
                if (it.name.contains("Release")) it.exclude("**/ScreensTest*")
            }
        }
    }
    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.12.01")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-core")

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.7")
    implementation("androidx.navigation:navigation-compose:2.8.5")
    implementation("androidx.work:work-runtime-ktx:2.10.0")
    implementation("androidx.webkit:webkit:1.12.1")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")

    testImplementation("junit:junit:4.13.2")
    // Screenshot checks of the main screens (run in CI with -Dlumi.screens=1, never part of the app)
    testImplementation(composeBom)
    testImplementation("androidx.compose.ui:ui-test-junit4")
    testImplementation("androidx.test.ext:junit:1.2.1")
    testImplementation("org.robolectric:robolectric:4.14.1")
    testImplementation("io.github.takahirom.roborazzi:roborazzi:1.26.0")
    testImplementation("io.github.takahirom.roborazzi:roborazzi-compose:1.26.0")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
