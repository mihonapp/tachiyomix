package eu.kanade.tachiyomi.source.model

@Suppress("UNUSED", "PropertyName")
interface SManga {

    /**
     * Stable unique identifier for the chapter.
     *
     * This field is intended to eventually replace [url] as the primary identifier used by the
     * host app.
     *
     * Currently, this field is optional. However, if [key] is non-null, it MUST be used instead of
     * [url] when identifying or referencing the chapter. Otherwise, [url] is used as the fallback
     * identifier, i.e. `key ?: url`.
     *
     * When [key] is non-null, it is expected to be unique within the scope of its source, and
     * uniqueness validation is performed immediately.
     *
     * Future versions will make this field required.
     *
     * @since tachiyomix 1.6
     */
    var key: String?

    var title: String

    /**
     * Alternative titles for the manga.
     *
     * This list can include official translations, romanizations,
     * or other titles the series is known by in different regions or languages.
     *
     * @since tachiyomix 1.6
     */
    var altTitles: List<String>

    var thumbnail_url: String?

    /**
     * URL of the manga's banner image.
     *
     * Typically, a wide image shown in headers or detailed views.
     * May be `null` if the source does not provide one.
     *
     * @since tachiyomix 1.6
     */
    var banner: String?

    var artist: String?

    var author: String?

    var status: Int

    /**
     * Main language of the manga's chapters content.
     *
     * Expected to be a valid IETF BCP 47 language tag such as:
     * * `"en"` → English
     * * `"en-US"` → English (United States)
     * * `"zh-Hant"` → Traditional Chinese
     * * `"es-419"` → Spanish (Latin America)
     *
     * A value of `null` indicates that the language is unknown or unspecified.
     *
     * @see SChapter.language
     * @since tachiyomix 1.6
     */
    var language: String?

    /**
     * Age or content rating for the manga.
     *
     * Indicates the suitability of the manga’s content for different audiences.
     * Apps can utilize it to provide filters or cover blurring in their app.
     * Realistically only relevant for sources with an `isNsfw` marker.
     *
     * Defaults to [ContentRating.SAFE]
     */
    var contentRating: ContentRating

    /**
     * Source-provided rating score for the manga.
     *
     * Must be a percentile value (e.g., between 0 and 100).
     * `null` if no rating is available.
     *
     * @since tachiyomix 1.6
     */
    var score: Int?

    var description: String?

    @Deprecated("Provide SManga.genres instead")
    var genre: String?

    var genres: List<String>

    /**
     * Preferred reading mode provided by the source, or the majority from the source.
     *
     * Leave it `null` if the source provides entries of various modes and doesn't provide explicit data.
     *
     * @since tachiyomix 1.6
     */
    var readingMode: ReadingMode?

    var update_strategy: UpdateStrategy

    var url: String

    /**
     * Extra metadata associated with the manga.
     *
     * These key-value pairs are invisible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mhx.*"`) for sources to populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * chapter data.
     *
     * @since tachiyomix 1.6
     */
    var memo: Map<String, String>

    var initialized: Boolean

    enum class ContentRating {
        SAFE,
        SUGGESTIVE,
        ADULT,
    }

    enum class ReadingMode {
        RIGHT_TO_LEFT,
        LEFT_TO_RIGHT,
        LONG_STRIP,
    }

    companion object {
        const val UNKNOWN = 0
        const val ONGOING = 1
        const val COMPLETED = 2
        const val LICENSED = 3
        const val PUBLISHING_FINISHED = 4
        const val CANCELLED = 5
        const val ON_HIATUS = 6

        fun create(): SManga = throw Exception("Stub!")
    }
}
