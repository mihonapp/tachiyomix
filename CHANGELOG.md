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
- `Source.getPopularManga`; Suspend alternative to `CatalogueSource.fetchPopularManga`.
- `Source.getLatestUpdates`; Suspend alternative to `CatalogueSource.fetchLatestUpdates`.
- `Source.getSearchManga`; Suspend alternative to `CatalogueSource.fetchSearchManga`.
- `Source.getMangaUpdate`; Combined suspend alternative to `Source.fetchMangaDetails` and `Source.fetchChapterList`.
- `Source.getPageList`; Suspend alternative to `Source.fetchPageList`.
- `Source.getFilterList`; Moving up the hierarchy from  `CatalogueSource.getFilterList`.
- `HttpSource.getHomeUrl`; New method to determine the URL opened when tapping “Open in WebView” in the browse screen.
- `HttpSource.getImageUrl`; Suspend alternative to `CatalogueSource.fetchImageUrl`.
- `HttpSource.getImage`; Suspend alternative to `CatalogueSource.fetchImage`.
- `SChapter.number` and `SChapter.volume`; Chapter number and volume in string format.
- `SChapter.note`; Optional note associated with the chapter (e.g., lock status or a short description).
- `SManga.banner`; Optional URL for the banner image associated with the manga.
- `SManga.altTitles`; List of alternative titles associated with the manga.
- `SManga.contentRating`; Content rating of the manga.
- `SManga.score`; Source-provided rating score of the manga.
- `SManga.readingMode`; Preferred reading mode indicated by the source.
- `SManga.memo` and `SChapter.memo`; Internal key–value pairs associated with the manga or chapter.
- `HttpException`; Use it to have a standardized error message in the app across the extensions.
- `Call.await` and `Call.awaitSuccess`; Suspend helper function for `OkHttp`. Use instead of `com.squareup.okhttp3:okhttp-coroutines`.

### Deprecated
- `CatalogueSource.fetchPopularManga`; Deprecated in favor of `Source.getPopularManga`.
- `CatalogueSource.fetchLatestUpdates`; Deprecated in favor of `Source.getLatestUpdates`.
- `CatalogueSource.fetchSearchManga`; Deprecated in favor of `Source.getSearchManga`.
- `Source.fetchMangaDetails`; Deprecated in favor of `Source.getMangaUpdate`.
- `Source.fetchChapterList`; Deprecated in favor of `Source.getMangaUpdate`.
- `Source.fetchPageList`; Deprecated in favor of `Source.getPageList`.
- `HttpSource.fetchImageUrl`; Deprecated in favor of `Source.getImageUrl`.
- `HttpSource.fetchImage`; Deprecated in favor of `Source.getImage`.
- `HttpSource.xxxRequest` and `HttpSource.xxxParse`; Deprecated with no replacement.
- `HttpSource.prepareNewChapter`; Deprecated with no replacement.
- `rateLimit` and `rateLimitHost`; Deprecated with no replacement.
- `ParsedHttpSource`; Deprecated with no replacement.
- `NetworkHelper.cloudflareClient`; Deprecated in favor of `NetworkHelper.client`, which should support cloudflare bypass by default.
- `SChapter.chapter_number`; Deprecated in favor of `SChapter.number`.
- `Call.asObservable` and `Call.asObservableSuccess`; Deprecated with no replacement.
- `Call.await`; Moved to a new package.

### Other
- Begin tracking ABI changes.
- Bump Android `compileSdk` to 36.
- Update Kotlin to `v2.2.21`.
- Update OkHttp to `v5.3.0`.
- Update jsoup to `v1.21.2`.
- Replace dependency `com.github.inorichi.injekt:injekt-core` → `com.github.mihonapp:injekt`.
