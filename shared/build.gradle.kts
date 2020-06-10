plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinAndroidExt)
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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.koinCore)
    implementation(Dependencies.materialDesign)
}
