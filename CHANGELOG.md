# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).
- `Added` - for new features.
- `Changed ` - for changes in existing functionality.
- `Deprecated` - for soon-to-be removed features.
- `Removed` - for now removed features.
- `Fixed` - for any bug fixes.
- `Other` - for technical stuff.

## [Unreleased]

### Added
- `HttpSource.getHomeUrl`; New method to determine the URL opened when tapping “Open in WebView” in the browse screen.
- `SChapter.number` and `SChapter.volume`; Chapter number and volume in string format.
- `SChapter.note`; Optional note associated with the chapter (e.g., lock status or a short description).
- `SManga.banner`; Optional URL for the banner image associated with the manga.
- `SManga.altTitles`; List of alternative titles associated with the manga.
- `SManga.contentRating`; Content rating of the manga.
- `SManga.score`; Source-provided rating score of the manga.
- `SManga.readingMode`; Preferred reading mode indicated by the source.
- `SManga.memo` and `SChapter.memo`; Internal key–value pairs associated with the manga or chapter.

### Deprecated
- `rateLimit` and `rateLimitHost`; Deprecated with no replacement.
- `ParsedHttpSource`; Deprecated with no replacement.
- `NetworkHelper.cloudflareClient`; Deprecated in favor of `NetworkHelper.client`, which should support cloudflare bypass by default.
- `SChapter.chapter_number`; Deprecated in favor of `SChapter.number`.

### Other
- Begin tracking ABI changes.
- Bump Android `compileSdk` to 36.
- Update Kotlin to `v2.2.21`.
- Update OkHttp to `v5.3.0`.
- Update jsoup to `v1.21.2`.
- Replace dependency `com.github.inorichi.injekt:injekt-core` → `com.github.mihonapp:injekt`.
