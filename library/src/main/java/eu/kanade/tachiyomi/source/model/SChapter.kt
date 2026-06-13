package eu.kanade.tachiyomi.source.model

import kotlinx.serialization.json.JsonObject

@Suppress("UNUSED", "PropertyName")
interface SChapter {

    var url: String

    var name: String

    var chapter_number: Float

    var scanlator: String?

    var date_upload: Long

    /**
     * Extra metadata associated with the chapter.
     *
     * The JSON object is not visible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mihon.*"`) for sources to populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * chapter data.
     *
     * @since tachiyomix 1.6
     */
    var memo: JsonObject

    companion object {
        fun create(): SChapter = throw Exception("Stub!")
    }
}
