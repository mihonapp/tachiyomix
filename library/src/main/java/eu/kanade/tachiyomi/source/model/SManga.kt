@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import mihonx.models.Manga

interface SManga {

    var url: String

    var title: String

    /**
     * URL of the manga's banner image.
     *
     * Typically a wide image shown in headers or detailed views.
     * May be `null` if the source does not provide one.
     */
    var banner: String?

    /**
     * Alternative titles for the manga.
     *
     * This list can include official translations, romanizations,
     * or other titles the series is known by in different regions or languages.
     */
    var altTitles: List<String>

    var artist: String?

    var author: String?

    /**
     * Age or content rating for the manga.
     *
     * Indicates the suitability of the manga’s content for different audiences.
     * Consumers can utilize it to provide filters or cover blurring in their app.
     * Realistically only relevant for sources with an `isNsfw` marker.
     */
    var contentRating: Manga.ContentRating

    /**
     * Source-provided rating score for the manga.
     *
     * Must be a percentile value (e.g., between 0 and 100).
     * `null` if no rating is available.
     */
    var score: Float?

    var description: String?

    /**
     * Preferred reading mode for this manga.
     *
     * Defines how pages are presented to the reader.
     *
     * This value defaults to [Manga.ReadingMode.RightToLeft] if not otherwise specified,
     * and should only used if the user has chosen the default reading mode in their settings.
     */
    var readingMode: Manga.ReadingMode

    var genre: String?

    var status: Int

    @Suppress("PropertyName")
    var thumbnail_url: String?

    @Suppress("DEPRECATION", "PropertyName")
    var update_strategy: UpdateStrategy

    var initialized: Boolean

    /**
     * Arbitrary metadata attached to this manga.
     *
     * Sources may use key prefixes (e.g., `"mhx.*"`) to indicate custom fields relevant to specific consumers.
     */
    var memo: Map<String, String>

    companion object {
        const val UNKNOWN = 0
        const val ONGOING = 1
        const val COMPLETED = 2
        const val LICENSED = 3
        const val PUBLISHING_FINISHED = 4
        const val CANCELLED = 5
        const val ON_HIATUS = 6

        fun create(): SManga {
            throw Exception("Stub!")
        }
    }
}
