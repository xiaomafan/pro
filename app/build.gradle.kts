plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

println("helleo world")

val userName:String by rootProject.extra
val password:String by rootProject.extra
val isRelease :Boolean by rootProject.extra

println(userName)
println(password)
println(isRelease)

android {
    namespace = "com.example.pro"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pro"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    ext{
        var userName = "xiaoma"
    }
}