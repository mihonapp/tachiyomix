package eu.kanade.tachiyomi.source

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import rx.Observable

/**
 * A basic interface for creating a source. It could be an online source, a local source, etc...
 */
@Suppress("UNUSED")
interface Source {

    /**
     * Id for the source. Must be unique.
     */
    val id: Long

    /**
     * Name of the source.
     */
    val name: String

    /**
     * Whether the source has support for latest updates.
     */
    val supportsLatest: Boolean

    /**
     * Returns the list of filters for the source.
     */
    fun getFilterList(): FilterList

    /**
     * Get a page with a list of manga.
     *
     * @since tachiyomix 1.6
     * @param page the page number to retrieve.
     */
    suspend fun getPopularManga(page: Int): MangasPage = throw Exception("Stub!")

    /**
     * Get a page with a list of latest manga updates.
     *
     * @since tachiyomix 1.6
     * @param page the page number to retrieve.
     */
    suspend fun getLatestUpdates(page: Int): MangasPage = throw Exception("Stub!")

    /**
     * Get a page with a list of manga.
     *
     * @since tachiyomix 1.6
     * @param page the page number to retrieve.
     * @param query the search query.
     * @param filters the list of filters to apply.
     */
    suspend fun getSearchManga(page: Int, query: String, filters: FilterList): MangasPage = throw Exception("Stub!")

    /**
     * Get the updated details for a manga.
     *
     * @since tachiyomix 1.6
     * @param manga the manga to update.
     * @return the updated manga.
     */
    suspend fun getMangaDetails(manga: SManga): SManga = throw Exception("Stub!")

    /**
     * Get all the available chapters for a manga.
     *
     * @since tachiyomix 1.6
     * @param manga the manga to update.
     * @return the chapters for the manga.
     */
    suspend fun getChapterList(manga: SManga): List<SChapter> = throw Exception("Stub!")

    /**
     * Get the list of pages a chapter has. Pages should be returned
     * in the expected order; the index is ignored.
     *
     * @since tachiyomix 1.6
     * @param chapter the chapter.
     * @return the pages for the chapter.
     */
    suspend fun getPageList(chapter: SChapter): List<Page> = throw Exception("Stub!")

    @Deprecated("Use the suspend API instead", ReplaceWith("getMangaDetails"))
    fun fetchMangaDetails(manga: SManga): Observable<SManga> = throw Exception("Stub!")

    @Deprecated("Use the suspend API instead", ReplaceWith("getChapterList"))
    fun fetchChapterList(manga: SManga): Observable<List<SChapter>> = throw Exception("Stub!")

    @Deprecated("Use the suspend API instead", ReplaceWith("getPageList"))
    fun fetchPageList(chapter: SChapter): Observable<List<Page>> = throw Exception("Stub!")
}
