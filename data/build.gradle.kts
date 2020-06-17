plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinAndroidExt)
    id(Plugins.kotlinApt)
}

android {
    compileSdkVersion(AndroidSettings.compileSdkVersion)
    buildToolsVersion = AndroidSettings.buildToolVersion

    defaultConfig {
        minSdkVersion(AndroidSettings.minSdkVersion)
        targetSdkVersion(AndroidSettings.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":domain"))
    implementation(Dependencies.koinCore)
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
    implementation(Dependencies.retrofit){
        exclude(module = "okhttp")
    }
    implementation(Dependencies.retrofitCoroutinesAdapter)
    implementation(Dependencies.retrofitGson)

    kapt(Dependencies.roomCompiler)
    implementation(Dependencies.roomKtx)
    implementation(Dependencies.roomRuntime)

}
