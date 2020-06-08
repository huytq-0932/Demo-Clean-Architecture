import org.gradle.api.JavaVersion

object AndroidSettings {

    const val minSdkVersion = 23
    const val compileSdkVersion = 29
    const val targetSdkVersion = 29

    const val buildToolVersion = "29.0.3"
    const val applicationId = "com.tr4n.basedemo"

    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}
