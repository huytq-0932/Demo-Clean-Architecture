plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinAndroidExt)
    id(Plugins.kotlinApt)
    id(Plugins.navigationSafeArgs)
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

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.appCompat)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.glide)
    implementation(Dependencies.koinCore)
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.materialDesign)
    implementation(Dependencies.navigationFragmentKtx)
    implementation(Dependencies.navigationUiKtx)
    implementation(Dependencies.recyclerView)
}
