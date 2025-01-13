package eu.kanade.tachiyomi.source

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import rx.Observable

@Suppress("unused")
interface CatalogueSource : Source {

    /**
     * An ISO 639-1 compliant language code (two letters in lower case).
     */
    @Deprecated("Use language instead", ReplaceWith("language"))
    val lang: String

    /**
     * Whether the source has support for latest updates.
     */
    val supportsLatest: Boolean

    /**
     * Returns an observable containing a page with a list of manga.
     *
     * @param page the page number to retrieve.
     */
    @Deprecated("Use the new suspend variant instead", ReplaceWith("getPopularMangaList"))
    fun fetchPopularManga(page: Int): Observable<MangasPage>

    /**
     * Returns an observable containing a page with a list of manga.
     *
     * @param page the page number to retrieve.
     * @param query the search query.
     * @param filters the list of filters to apply.
     */
    @Deprecated("Use the new suspend variant instead", ReplaceWith("getMangaList"))
    fun fetchSearchManga(page: Int, query: String, filters: FilterList): Observable<MangasPage>

    /**
     * Returns an observable containing a page with a list of latest manga updates.
     *
     * @param page the page number to retrieve.
     */
    @Deprecated("Use the new suspend variant instead", ReplaceWith("getLatestMangaList"))
    fun fetchLatestUpdates(page: Int): Observable<MangasPage>

    /**
     * Returns the list of filters for the source.
     */
    @Deprecated("Use the new suspend variant instead", ReplaceWith("getSearchFilters"))
    fun getFilterList(): FilterList
}
