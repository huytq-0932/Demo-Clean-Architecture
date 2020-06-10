object Versions {
    const val androidGradlePlugin = "4.0.0"
    const val androidTest = "1.2.0-beta01"
    const val androidX = "1.1.0-alpha05"
    const val assertJ = "3.12.2"
    const val assertJAndroid = "1.2.0"
    const val cardView = "1.0.0"
    const val constraintlayout = "2.0.0-beta4"
    const val coreKtx = "1.2.0-alpha01"
    const val coreTesting = "1.1.1"
    const val coroutinesCore = "1.3.2"
    const val espresso = "3.2.0-beta01"
    const val expandableTextview = "0.1.4"
    const val groupie = "2.4.0-alpha1"
    const val glide = "4.9.0"
    const val junit = "4.13-beta-2"
    const val koin = "2.0.0-rc-3"
    const val kotlin = "1.3.72"
    const val leakCanary = "1.6.3"
    const val leakCanaryNoop = "1.6.3"
    const val lifecycle = "2.2.0-alpha01"
    const val material = "1.1.0-alpha06"
    const val mockk = "1.9.3"
    const val mockWebServer = "3.14.1"
    const val moshi = "1.8.0"
    const val navigation = "2.3.0-beta01"
    const val okHttp = "3.14.1"
    const val retrofit = "2.5.0"
    const val retrofitCoroutinesAdapter = "0.9.2"
    const val room = "2.1.0-beta01"
    const val testExt = "1.1.1-beta01"
}

object Dependencies {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.androidX}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesCore}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val expandableTextview = "com.ms-square:expandableTextView:${Versions.expandableTextview}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val groupie = "com.xwray:groupie:${Versions.groupie}"
    const val groupieKotlinAndroidExtension =
        "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    const val koinCore = "org.koin:koin-core:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
    const val leakCanaryNoOp =
        "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanaryNoop}"
    const val livecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val materialDesign = "com.google.android.material:material:${Versions.material}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.navigation}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment:${Versions.navigation}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.androidX}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitCoroutinesAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}"
    const val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
}


object TestDependencies {
    const val archCoreTesting = "android.arch.core:core-testing:${Versions.coreTesting}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
    const val assertJAndroid = "com.squareup.assertj:assertj-android:${Versions.assertJAndroid}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoCont = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesCore}"
    const val junit = "junit:junit:${Versions.junit}"
    const val koinTest = "org.koin:koin-test:${Versions.koin}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
    const val roomTest = "androidx.room:room-testing:${Versions.room}"
    const val testExt = "androidx.test.ext:junit:${Versions.testExt}"
    const val testRule = "androidx.test:rules:${Versions.androidTest}"
    const val testRunner = "androidx.test:runner:${Versions.androidTest}"
}

object Plugins {
    const val androidLibrary = "com.android.library"
    const val androidApp = "com.android.application"
    const val androidNotification = "com.android.notification"
    const val apolloAndroid = "com.apollographql.android"
    const val fabric = "io.fabric"
    const val googleServices = "com.google.gms.google-services"
    const val javalib = "java-notification"
    const val kotlin = "kotlin"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExt = "kotlin-android-extensions"
    const val kotlinExt = "android.extensions"
    const val kotlinApt = "kotlin-kapt"
    const val kotlinPlatform = "platform.android"
    const val navigationSafeArgs = "androidx.navigation.safeargs.kotlin"
}
