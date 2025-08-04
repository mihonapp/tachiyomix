@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import mihonx.models.Manga
import mihonx.models.Staff

interface SManga {

    var key: String

    @Deprecated("Provide SChapter.key instead which will be a unique identifier instead of relative url")
    var url: String

    var title: String

    var cover: String?

    var banner: String?

    var altTitles: List<String>

    var staff: List<Staff.Manga>

    @Deprecated("Provide SChapter.staff instead")
    var artist: String?

    @Deprecated("Provide SChapter.staff instead")
    var author: String?

    var contentRating: Manga.ContentRating

    var score: Float?

    var description: String?

    var tags: List<Manga.Tag>

    var readingMode: Manga.ReadingMode?

    var updateStrategy: Manga.UpdateStrategy

    @Deprecated("Provide SChapter.tags instead")
    var genre: String?

    var status: Int

    @Suppress("PropertyName")
    @Deprecated("Provide SChapter.cover instead")
    var thumbnail_url: String?

    @Suppress("DEPRECATION", "PropertyName")
    @Deprecated("Provide SChapter.updateStrategy instead")
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

fun SManga.setStaff(
    author: String? = null,
    artist: String? = null,
    circle: String? = null,
): SManga {
    return also {
        it.staff = buildList(2) {
            if (author != null) add(Staff.Author(author, author))
            if (artist != null) add(Staff.Artist(artist, artist))
            if (circle != null) add(Staff.Circle(circle, circle))
        }
    }
}

fun SManga.setTags(tags: List<String>): SManga {
    return also {
        it.tags = tags.map { tag ->
            Manga.Tag(key = tag, type = null, displayName = tag)
        }
    }
}
