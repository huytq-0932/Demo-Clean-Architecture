plugins {
    id(Plugins.androidApp)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinAndroidExt)
    id(Plugins.kotlinApt)
    id(Plugins.navigationSafeArgs)
}

android {
    compileSdkVersion(AndroidSettings.compileSdkVersion)
    buildToolsVersion = AndroidSettings.buildToolVersion

    defaultConfig {
        applicationId = AndroidSettings.applicationId
        versionCode = 1
        versionName = "1.0"

        minSdkVersion(AndroidSettings.minSdkVersion)
        targetSdkVersion(AndroidSettings.targetSdkVersion)
        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner

        vectorDrawables.useSupportLibrary = true
    }
    compileOptions {
        sourceCompatibility = AndroidSettings.sourceCompatibility
        targetCompatibility = AndroidSettings.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    flavorDimensions("appVariant")
    productFlavors {
        create("dev") {
            setDimension("appVariant")
            applicationIdSuffix = ".dev"
            resValue("string", "app_name", "Goal Dev")
        }
        create("prod") {
            setDimension("appVariant")
            resValue("string", "app_name", "Goal")
        }
        create("stg") {
            setDimension("appVariant")
            applicationIdSuffix = ".stg"
            resValue("string", "app_name", "Goal Staging")
        }
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-Debug"
            signingConfig = signingConfigs.getByName("debug")
            resValue("string", "app_name", "app_name - Debug")
        }
        getByName("release") {
            isDebuggable = false
            isZipAlignEnabled = true
            isShrinkResources = true
            isMinifyEnabled = true
//            signingConfig = signingConfigs.getByName("release")
            setProguardFiles(
                setOf(
                    getDefaultProguardFile("proguard-android.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }

    androidExtensions {
        isExperimental = true
    }

    dataBinding {
        isEnabled = true
    }

    configurations.all {
        resolutionStrategy.force("com.google.code.findbugs:jsr305:1.3.9")
    }

    lintOptions {
        isWarningsAsErrors = true
        isCheckReleaseBuilds = false
        disable("ObsoleteLintCustomCheck")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":shared"))
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Dependencies.appCompat)
    implementation(Dependencies.cardView)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.glide)
    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinViewModel)
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.lifecycleLiveData)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.lifecycleViewModelKtx)
    implementation(Dependencies.materialDesign)
    implementation(Dependencies.navigationFragmentKtx)
    implementation(Dependencies.navigationUiKtx)
    implementation(Dependencies.recyclerView)

    testImplementation(TestDependencies.junit)
    androidTestImplementation(TestDependencies.espresso)
}
