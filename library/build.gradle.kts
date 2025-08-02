import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:5.1.0")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("io.reactivex:rxandroid:1.2.1")
    implementation("org.jsoup:jsoup:1.21.1")
    implementation("com.github.mihonapp:injekt:91edab2317")
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
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
