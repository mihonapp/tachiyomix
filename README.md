# 📚 TachiyomiX

Tachiyomi-based extensions library used in [Mihon](https://github.com/mihonapp/mihon).

## 📦 Installation

Add the following to your Gradle dependencies:

```kotlin
dependencies {
    compileOnly("com.github.mihonapp:tachiyomix:1.6")
}
```

## 🔧 Recommended Dependency Versions

To ensure compatibility with **TachiyomiX 1.6**, forks should use at least the following versions:

| Dependency            | Artifact(s)                                                                                                                                                                 | Version(s) |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| Kotlin                | `org.jetbrains.kotlin:kotlin-stdlib`                                                                                                                                        | `2.2.0`    |
| kotlinx.coroutines    | `org.jetbrains.kotlinx:kotlinx-coroutines-core`                                                                                                                             | `1.10.2`   |
| kotlinx.serialization | `org.jetbrains.kotlinx:kotlinx-serialization-json` <br> `org.jetbrains.kotlinx:kotlinx-serialization-json-okio` <br> `org.jetbrains.kotlinx:kotlinx-serialization-protobuf` | `1.9.0`    |
| OkHttp                | `com.squareup.okhttp3:okhttp` <br> `com.squareup.okhttp3:okhttp-brotli` <br> `com.squareup.okhttp3:okhttp-coroutines` <br> `com.squareup.okhttp3:okhttp-zstd`               | `5.1.0`    |
| jsoup                 | `org.jsoup:jsoup`                                                                                                                                                           | `1.21.1`   |
| Ksoup                 | `com.fleeksoft.ksoup:ksoup` <br> `com.fleeksoft.ksoup:ksoup-okio`                                                                                                           | `0.2.5`    |

## 📄 License

TachiyomiX is distributed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
