package eu.kanade.tachiyomi.source.model

@Suppress("Unused")
class SMangaUpdate(
    val manga: suspend () -> SManga,
    val chapters: suspend () -> List<SChapter>,
) {
    constructor(manga: SManga, chapters: List<SChapter>) : this({ manga }, { chapters })
    constructor(manga: SManga, chapters: suspend () -> List<SChapter>) : this({ manga }, chapters)

    @Deprecated("Use the suspend API instead", level = DeprecationLevel.HIDDEN)
    @JvmName("getManga")
    fun getMangaLegacy(): SManga = throw Exception("Stub!")

    @Deprecated("Use the suspend API instead", level = DeprecationLevel.HIDDEN)
    @JvmName("getChapters")
    fun getChaptersLegacy(): List<SChapter> = throw Exception("Stub!")
}
