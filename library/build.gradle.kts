import org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.tapmoc)
    alias(libs.plugins.spotless)

}

dependencies {
    implementation(libs.okhttp)
    implementation(libs.rxjava)
    implementation(libs.rxandroid)
    implementation(libs.jsoup)
    implementation(libs.injekt)
}

kotlin {
    @OptIn(ExperimentalAbiValidation::class)
    abiValidation {
        enabled.set(true)
    }

    androidTarget()
}

android {
    namespace = "eu.kanade.tachiyomi.extensions"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }
}

spotless {
    val ktlintVersion = libs.ktlint.cli.get().version
    kotlin {
        target("src/**/*.kt")
        ktlint(ktlintVersion)
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktlint(ktlintVersion)
    }
}

compatPatrouille {
    java(17)
    kotlin("2.2.0")
}

mavenPublishing {
    coordinates("com.github.mihonapp", "tachiyomix", "1.6.0-SNAPSHOT")

    pom {
        name.set("TachiyomiX")
        description.set("Tachiyomi based extension API for Mihon")
        url.set("https://github.com/mihonapp/tachiyomix")

        licenses {
            license {
                name.set("Apache License 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0")
                distribution.set("repo")
            }
        }

        organization {
            name.set("Mihon Open Source Project")
            url.set("https://github.com/mihon")
        }

        scm {
            connection.set("scm:git:git://github.com/mihonapp/tachiyomix.git")
            url.set("https://github.com/mihonapp/tachiyomix")
        }
    }
}
