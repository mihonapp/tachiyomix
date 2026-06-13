package eu.kanade.tachiyomi.source.model

import kotlinx.serialization.json.JsonObject

@Suppress("UNUSED", "PropertyName")
interface SManga {

    var url: String

    var title: String

    var thumbnail_url: String?

    var artist: String?

    var author: String?

    var status: Int

    var description: String?

    var genre: String?

    var update_strategy: UpdateStrategy

    /**
     * Extra metadata associated with the manga.
     *
     * The JSON object is not visible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mihon.*"`) for sources to populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * manga data.
     *
     * @since tachiyomix 1.6
     */
    var memo: JsonObject

    var initialized: Boolean

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
