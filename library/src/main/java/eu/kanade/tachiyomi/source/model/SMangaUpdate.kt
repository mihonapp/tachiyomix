package eu.kanade.tachiyomi.source.model

@Suppress("Unused")
class SMangaUpdate(
    val manga: suspend () -> SManga,
    val chapters: suspend () -> List<SChapter>,
) {
    constructor(manga: SManga, chapters: List<SChapter>) : this({ manga }, { chapters })
}
