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
### Breaking Changes
- Bump Android `minSdk` to `26`.
- `SMangaUpdate.manga` and `SMangaUpdate.chapters` are now suspend lambdas; The existing constructor still accepts an `SManga` and a `List<SChapter>`, so the change is source compatible but not binary compatible.

### Added
- `Source.language`; Primary language of the source, represented as an IETF BCP 47 language tag.
- `SManga.genres`; Manga genres in list format.
- `SManga.banner`; Optional URL for the banner image associated with the manga.
- `SManga.altTitles`; List of alternative titles associated with the manga.
- `SManga.contentRating`; Content rating of the manga.
- `SManga.score`; Source-provided rating score of the manga.
- `SManga.readingMode`; Preferred reading mode indicated by the source.
- `SManga.language`; Primary language of the manga, represented as an IETF BCP 47 language tag.
- `SChapter.number` and `SChapter.volume`; Chapter number and volume in string format.
- `SChapter.scanlators`; Chapter scanlators in list format.
- `SChapter.note`; Optional note associated with the chapter (e.g., lock status or a short description).
- `SChapter.language`; Language of the chapter content, represented as an IETF BCP 47 language tag.
- `SChapter.locked`; Whether the chapter is currently locked or inaccessible.
- `SMangaUpdate` constructor taking suspend lambdas; Lets sources defer fetching the details and the chapters, so the app doesn't wait for both when they come from separate endpoints.

### Deprecated
- `CatalogueSource`; Deprecated in favor of `Source`.
- `CatalogueSource.lang`; Deprecated in favor of `Source.language`.
- `SManga.genre`; Deprecated in favor of `SManga.genres`.
- `SChapter.chapter_number`; Deprecated in favor of `SChapter.number`.
- `SChapter.scanlator`; Deprecated in favor of `SChapter.scanlators`.

### Removed
- `CatalogueSource.fetchPopularManga`; Removed in favor of `Source.getPopularManga`.
- `CatalogueSource.fetchLatestUpdates`; Removed in favor of `Source.getLatestUpdates`.
- `CatalogueSource.fetchSearchManga`; Removed in favor of `Source.getSearchManga`.
- `Source.fetchMangaDetails`; Removed in favor of `Source.getMangaUpdate`.
- `Source.fetchChapterList`; Removed in favor of `Source.getMangaUpdate`.
- `Source.fetchPageList`; Removed in favor of `Source.getPageList`.
- `HttpSource.fetchImageUrl`; Removed in favor of `HttpSource.getImageUrl`.
- `HttpSource.xxxRequest` and `HttpSource.xxxParse` except `HttpSource.imageRequest`; Removed with no replacement.
- `HttpSource.prepareNewChapter`; Removed with no replacement.
- `ParsedHttpSource`; Removed with no replacement.
- `MangasPage.component1`, `MangasPage.component2` and `MangasPage.copy`; Removed with no replacement.
- `rateLimit` and `rateLimitHost`; Removed with no replacement.
- `NetworkHelper.cloudflareClient`; Removed in favor of `NetworkHelper.client`, which supports cloudflare bypass by default.
- `Call.asObservable` and `Call.asObservableSuccess`; Removed with no replacement.

### Other
- Dropped the RxJava and RxAndroid dependencies along with the last Observable based APIs.
- Relicense the project under Mozilla Public License 2.0; `tachiyomix` library remain under Apache License 2.0.
- Bump host app dependency requirements; Kotlin → `2.4.10`, kotlinx.coroutines → `1.11.0`, kotlinx.serialization → `1.11.0`, OkHttp → `5.5.0`, jsoup → `1.23.1`.

## [1.6.0] - Jun 28, 2026
### Added
- `Source.getPopularManga`; Suspend alternative to `CatalogueSource.fetchPopularManga`.
- `Source.getLatestUpdates`; Suspend alternative to `CatalogueSource.fetchLatestUpdates`.
- `Source.getSearchManga`; Suspend alternative to `CatalogueSource.fetchSearchManga`.
- `Source.getMangaUpdate`; Combined suspend alternative to `Source.fetchMangaDetails` and `Source.fetchChapterList`.
- `Source.getPageList`; Suspend alternative to `Source.fetchPageList`.
- `Source.getFilterList`; Moving up the hierarchy from  `CatalogueSource.getFilterList`.
- `HttpSource.getHomeUrl`; New method to determine the URL opened when tapping “Open in WebView” in the browse screen.
- `HttpSource.getImageUrl`; Suspend alternative to `CatalogueSource.fetchImageUrl`.
- `SManga.memo` and `SChapter.memo`; Internal JSON object associated with the manga or chapter.
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
- `Call.asObservable` and `Call.asObservableSuccess`; Deprecated with no replacement.

### Removed
- `HttpSource.fetchImage`; Removed with no replacement.

### Other
- Begin tracking ABI changes.
- Bump Android `compileSdk` to `37`.
- Replace dependency `com.github.inorichi.injekt:injekt-core` → `com.github.mihonapp:injekt`.

[Unreleased]: https://github.com/mihonapp/tachiyomix/compare/1.6.0...main
[1.6.0]: https://github.com/mihonapp/tachiyomix/compare/607fb6e...1.6.0
