plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Apps.compileSdk
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = Apps.pacakageName
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = Versions.java_version
        targetCompatibility = Versions.java_version
    }
    kotlinOptions {
        jvmTarget = Versions.jvm_version
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(KotlinDependencies.kotlin)
    implementation(KotlinDependencies.serialization)
    implementation(KotlinDependencies.dateTime)
    implementation(KotlinDependencies.coroutinesCore)
    implementation(KotlinDependencies.coroutinesAndroid)
    implementation(KotlinDependencies.coroutinesReactive)
    implementation(AndroidXDependencies.appCompat)
    implementation(AndroidXDependencies.coreKtx)
    implementation(MaterialDesignDependencies.materialDesign)
    implementation(AndroidXDependencies.constraintLayout)
    implementation(AndroidXDependencies.fragment)
    implementation(AndroidXDependencies.legacy)
    implementation(AndroidXDependencies.lifecycleKtx)
    implementation(AndroidXDependencies.lifecycleJava8)
    implementation(AndroidXDependencies.security)
    implementation(AndroidXDependencies.startUp)
    // Test Implementation
    testImplementation(TestDependencies.jUnit)
    androidTestImplementation(TestDependencies.androidTest)
    androidTestImplementation(TestDependencies.espresso)
}

ktlint {
    android.set(true)
    debug.set(true)
    coloredOutput.set(true)
    verbose.set(true)
    outputToConsole.set(true)
}
