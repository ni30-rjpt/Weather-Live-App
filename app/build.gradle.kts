@file:Suppress("UNUSED_EXPRESSION")

import android.databinding.tool.writer.ViewBinding

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.cscormer.weatherlive"
    compileSdk = 34
    buildFeatures{
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.cscormer.weatherlive"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //  lottie animations
    implementation("com.airbnb.android:lottie:6.4.0")
    // GSON converter
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
// retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    implementation("io.github.ParkSangGwon:tedpermission-normal:3.3.0")

    // Coroutine
    implementation("io.github.ParkSangGwon:tedpermission-coroutine:3.3.0")

    // RxJava2
    implementation("io.github.ParkSangGwon:tedpermission-rx2:3.3.0")
    // RxJava3
    implementation("io.github.ParkSangGwon:tedpermission-rx3:3.3.0")


}