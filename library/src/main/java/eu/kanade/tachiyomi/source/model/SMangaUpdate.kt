package eu.kanade.tachiyomi.source.model

@Suppress("Unused")
class SMangaUpdate(
    val manga: suspend () -> SManga,
    val chapters: suspend () -> List<SChapter>,
    val related: (suspend () -> List<SManga>)? = null,
) {
    constructor(
        manga: SManga,
        chapters: List<SChapter>,
        related: List<SManga>? = null,
    ) : this({ manga }, { chapters }, related?.let { list -> suspend { list } })

    constructor(
        manga: SManga,
        chapters: suspend () -> List<SChapter>,
        related: (suspend () -> List<SManga>)? = null,
    ) : this({ manga }, chapters, related)

    @Deprecated("Use the constructor with related instead", level = DeprecationLevel.HIDDEN)
    constructor(manga: SManga, chapters: List<SChapter>) : this({ manga }, { chapters })

    @Deprecated("Use the suspend API instead", level = DeprecationLevel.HIDDEN)
    @JvmName("getManga")
    fun getMangaLegacy(): SManga = throw Exception("Stub!")

    @Deprecated("Use the suspend API instead", level = DeprecationLevel.HIDDEN)
    @JvmName("getChapters")
    fun getChaptersLegacy(): List<SChapter> = throw Exception("Stub!")
}
