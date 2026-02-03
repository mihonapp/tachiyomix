package eu.kanade.tachiyomi.source.model

@Suppress("unused")
interface SChapter {

    var url: String

    var name: String

    @Suppress("PropertyName")
    var date_upload: Long

    @Suppress("PropertyName")
    var chapter_number: Float

    var scanlator: String?

    var isPremium: Boolean

    companion object {
        fun create(): SChapter = throw Exception("Stub!")
    }
}
