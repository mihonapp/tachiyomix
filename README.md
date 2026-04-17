# 📚 TachiyomiX

Tachiyomi-based extensions library used in [Mihon](https://github.com/mihonapp/mihon).

## 📦 Usage

Add `jitpack.io` repository to your root `build.gradle.kts` file:
```kotlin
dependencyResolutionManagement {
    repositories {
        maven(url = "https://www.jitpack.io")
    }
}
```

Then add the dependency:

```kotlin
dependencies {
    compileOnly("com.github.mihonapp:tachiyomix:1.6")
}
```
> [!NOTE]
>
> `compileOnly` is used because `tachiyomix` provides stub interfaces only. The actual implementations are included in the host app.

## 🔧 App Dependency Requirements

Host apps using `tachiyomix` must include the following dependencies (or newer versions) to ensure compatibility with version **1.6**:

| Dependency            | Artifact(s)                                                                                                                                                                 | Version  |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| Kotlin                | `org.jetbrains.kotlin:kotlin-stdlib`                                                                                                                                        | `2.2.0`  |
| kotlinx.coroutines    | `org.jetbrains.kotlinx:kotlinx-coroutines-core`                                                                                                                             | `1.10.2` |
| kotlinx.serialization | `org.jetbrains.kotlinx:kotlinx-serialization-json` <br> `org.jetbrains.kotlinx:kotlinx-serialization-json-okio` <br> `org.jetbrains.kotlinx:kotlinx-serialization-protobuf` | `1.9.0`  |
| OkHttp                | `com.squareup.okhttp3:okhttp` <br> `com.squareup.okhttp3:okhttp-brotli` <br> `com.squareup.okhttp3:okhttp-coroutines` <br> `com.squareup.okhttp3:okhttp-zstd`               | `5.1.0`  |
| jsoup                 | `org.jsoup:jsoup`                                                                                                                                                           | `1.21.1` |
| Injekt                | `com.github.mihonapp:injekt`                                                                                                                                                | `1.0.0`  |

## 📄 License

TachiyomiX is distributed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
