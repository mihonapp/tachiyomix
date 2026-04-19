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
- `SManga.genres`; Manga genres in list format.
- `SChapter.number` and `SChapter.volume`; Chapter number and volume in string format.
- `SChapter.scanlators`; Chapter scanlators in list format.
- `SChapter.note`; Optional note associated with the chapter (e.g., lock status or a short description).
- `SManga.banner`; Optional URL for the banner image associated with the manga.
- `SManga.altTitles`; List of alternative titles associated with the manga.
- `SManga.contentRating`; Content rating of the manga.
- `SManga.score`; Source-provided rating score of the manga.
- `SManga.readingMode`; Preferred reading mode indicated by the source.
- `SManga.memo` and `SChapter.memo`; Internal key–value pairs associated with the manga or chapter.
- `HttpException`; Use it to have a standardized error message in the app across the extensions.
- `Call.awaitSuccess`; `Call.await` variant with a check to `Response.isSuccessful`.

### Deprecated
- `CatalogueSource.fetchPopularManga`; Deprecated in favor of `Source.getPopularManga`.
- `CatalogueSource.fetchLatestUpdates`; Deprecated in favor of `Source.getLatestUpdates`.
- `CatalogueSource.fetchSearchManga`; Deprecated in favor of `Source.getSearchManga`.
- `Source.fetchMangaDetails`; Deprecated in favor of `Source.getMangaUpdate`.
- `Source.fetchChapterList`; Deprecated in favor of `Source.getMangaUpdate`.
- `Source.fetchPageList`; Deprecated in favor of `Source.getPageList`.
- `HttpSource.fetchImageUrl`; Deprecated in favor of `Source.getImageUrl`.
- `HttpSource.xxxRequest` and `HttpSource.xxxParse` except `HttpSource.imageRequest`; Deprecated with no replacement.
- `HttpSource.prepareNewChapter`; Deprecated with no replacement.
- `rateLimit` and `rateLimitHost`; Deprecated with no replacement.
- `ParsedHttpSource`; Deprecated with no replacement.
- `NetworkHelper.cloudflareClient`; Deprecated in favor of `NetworkHelper.client`, which should support cloudflare bypass by default.
- `SManga.genre`; Deprecated in favor of `SManga.genres`.
- `SChapter.chapter_number`; Deprecated in favor of `SChapter.number`.
- `SChapter.scanlator`; Deprecated in favor of `SChapter.scanlators`.
- `Call.asObservable` and `Call.asObservableSuccess`; Deprecated with no replacement.

### Removed
- `HttpSource.fetchImage`; Removed with no replacement.

### Other
- Begin tracking ABI changes.
- Bump Android `compileSdk` to 36.
- Update Kotlin to `v2.2.21`.
- Update OkHttp to `v5.3.0`.
- Update jsoup to `v1.21.2`.
- Replace dependency `com.github.inorichi.injekt:injekt-core` → `com.github.mihonapp:injekt`.
