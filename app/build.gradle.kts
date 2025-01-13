plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
<<<<<<< HEAD
=======
    alias(libs.plugins.kotlin.compose)
>>>>>>> 25a168f63cd9344fe6681e58ca420744249ca05d
}

android {
    namespace = "com.example.recipe"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.recipe"
<<<<<<< HEAD
        minSdk = 25
=======
        minSdk = 24
>>>>>>> 25a168f63cd9344fe6681e58ca420744249ca05d
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
<<<<<<< HEAD
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
=======
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
>>>>>>> 25a168f63cd9344fe6681e58ca420744249ca05d
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
<<<<<<< HEAD
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
=======
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.androidx.appcompat)
>>>>>>> 25a168f63cd9344fe6681e58ca420744249ca05d
}