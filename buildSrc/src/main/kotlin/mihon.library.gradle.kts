@file:Suppress("DEPRECATION")

import com.android.build.gradle.LibraryExtension
import org.gradle.accessors.dm.LibrariesForLibs
import org.jetbrains.kotlin.gradle.dsl.KotlinBaseExtension
import org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation

plugins {
    id("com.android.library")
    id("com.gradleup.tapmoc")
    id("com.diffplug.spotless")
}

val libs = the<LibrariesForLibs>()

configure<KotlinBaseExtension> {
    @OptIn(ExperimentalAbiValidation::class)
    abiValidation()
}

configure<LibraryExtension> {
    compileSdk = BuildConfig.COMPILE_SDK

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK
    }
}

tapmoc {
    java(BuildConfig.JAVA_VERSION)
}

spotless {
    val ktlintVersion = libs.versions.ktlint.get()

    kotlin {
        target("src/**/*.kt")
        ktlint(ktlintVersion)
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktlint(ktlintVersion)
    }
}
