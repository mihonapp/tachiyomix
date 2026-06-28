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

## 📜 Extension Manifest Requirements

Extensions are required to declare the following features and metadata to be correctly recognized and loaded in the app.

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-feature android:name="tachiyomi.extension" />
    <application>
        <!-- The display name of the extension -->
        <meta-data android:name="tachiyomix.name" android:value="Mihon Manga" />

        <!-- Content Rating: 0 = Safe, 1 = Mixed, 2 = NSFW -->
        <meta-data android:name="tachiyomix.contentWarning" android:value="0" />

        <!-- Target library version -->
        <meta-data android:name="tachiyomix.extensionLib" android:value="1.6" />

        <!-- The fully qualified (or relative to package name) class name of the extension -->
        <meta-data android:name="tachiyomi.extension.class" android:value=".Mihon" />
    </application>
</manifest>
```

## 🔧 App Dependency Requirements

Host apps using `tachiyomix` must include the following dependencies (or newer compatible versions) to ensure compatibility with version **1.6**:

| Dependency            | Artifact(s)                                                                                                                                                                 | Version      |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------|
| Kotlin                | `org.jetbrains.kotlin:kotlin-stdlib`                                                                                                                                        | `2.4.0`      |
| kotlinx.coroutines    | `org.jetbrains.kotlinx:kotlinx-coroutines-core`                                                                                                                             | `1.10.2`     |
| kotlinx.serialization | `org.jetbrains.kotlinx:kotlinx-serialization-json` <br> `org.jetbrains.kotlinx:kotlinx-serialization-json-okio` <br> `org.jetbrains.kotlinx:kotlinx-serialization-protobuf` | `1.7.3`      |
| OkHttp                | `com.squareup.okhttp3:okhttp` <br> `com.squareup.okhttp3:okhttp-brotli` <br> `com.squareup.okhttp3:okhttp-zstd`                                                             | `5.4.0`      |
| jsoup                 | `org.jsoup:jsoup`                                                                                                                                                           | `1.22.2`     |
| Injekt                | `com.github.mihonapp:injekt`                                                                                                                                                | `91edab2317` |

## 📄 License

TachiyomiX is distributed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
