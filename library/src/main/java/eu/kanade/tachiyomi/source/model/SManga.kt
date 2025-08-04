@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import mihonx.models.Manga

interface SManga {

    var url: String

    var title: String

    var cover: String?

    var banner: String?

    var altTitles: List<String>

    var artist: String?

    var author: String?

    var contentRating: Manga.ContentRating

    var score: Float?

    var description: String?

    var readingMode: Manga.ReadingMode?

    var updateStrategy: Manga.UpdateStrategy

    var genre: String?

    var status: Int

    @Suppress("PropertyName")
    @Deprecated("Provide SManga.cover instead")
    var thumbnail_url: String?

    @Suppress("DEPRECATION", "PropertyName")
    @Deprecated("Provide SManga.updateStrategy instead")
    var update_strategy: UpdateStrategy

    var initialized: Boolean

    var extras: Map<String, String>

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
