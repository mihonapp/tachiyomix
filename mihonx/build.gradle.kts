plugins {
    id("mihon.library.multiplatform")
}

kotlin {
    explicitApi()

    androidTarget()
    jvm()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.kotlinx.serialization.protobuf)
            }
        }
    }
}

android {
    namespace = "mihonx"
}
