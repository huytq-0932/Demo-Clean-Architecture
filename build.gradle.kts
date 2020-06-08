// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlin_version by extra("1.3.72")
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.androidGradlePlugin}")
        classpath(kotlin("gradle-plugin", version = Versions.kotlin))
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

task<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
