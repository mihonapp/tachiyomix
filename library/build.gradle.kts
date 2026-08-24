plugins {
    id("mihon.library.android")
    alias(libs.plugins.maven.publish)
}

dependencies {
    api(project(":mihonx"))

    implementation(libs.okhttp)
    implementation(libs.rxjava)
    implementation(libs.rxandroid)
    implementation(libs.jsoup)
    implementation(libs.injekt)
    compileOnlyApi(libs.kotlinx.serialization.json)
}

android {
    namespace = "eu.kanade.tachiyomi.extensions"
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
