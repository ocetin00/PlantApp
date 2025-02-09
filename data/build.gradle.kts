plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
    kotlin("plugin.serialization") version "2.0.20"
}
android {
    namespace = "com.oguzhan.data"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(project(":core"))
    implementation(project(":domain"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.google.android.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Room
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)

    //Retrofit
    implementation(libs.square.retrofit2)
    implementation(libs.okhttp3)
    implementation(libs.gson)
    implementation(libs.converter.gson)
    implementation(libs.okhttp.logging)
    implementation(libs.okhttp3.mockwebserver)

    //DataStore
    implementation(libs.datastore)

    //Sandwich for network responses
    implementation(libs.sandwich)
    implementation(libs.sandwich.retrofit)

    //Hilt
    implementation(libs.hilt.android)
    kspAndroidTest(libs.hilt.compiler)
    kspTest(libs.hilt.compiler)
    ksp(libs.hilt.compiler)

}