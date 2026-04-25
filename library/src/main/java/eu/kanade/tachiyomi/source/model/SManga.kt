package eu.kanade.tachiyomi.source.model

@Suppress("UNUSED", "PropertyName")
interface SManga {

    var url: String

    var title: String

    /**
     * Alternative titles for the manga.
     *
     * This list can include official translations, romanizations,
     * or other titles the series is known by in different regions or languages.
     */
    var altTitles: List<String>

    var thumbnail_url: String?

    /**
     * URL of the manga's banner image.
     *
     * Typically, a wide image shown in headers or detailed views.
     * May be `null` if the source does not provide one.
     */
    var banner: String?

    var artist: String?

    var author: String?

    var status: Int

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
     */
    var readingMode: ReadingMode?

    var update_strategy: UpdateStrategy

    /**
     * Extra metadata associated with the manga.
     *
     * These key-value pairs are invisible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mhx.*"`) for sources to populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * chapter data.
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
