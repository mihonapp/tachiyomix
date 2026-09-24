package eu.kanade.tachiyomi.source

import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import okhttp3.HttpUrl

/**
 * Represents a source that can resolve a URL into a specific type of [Resource].
 */
interface ResolvableSource {

    /**
     * Checks whether the given [url] can be resolved by this source.
     *
     * @param url The [HttpUrl] to test.
     * @return `true` if this source can resolve the URL, `false` otherwise.
     */
    fun canResolve(url: HttpUrl): Boolean

    /**
     * Resolves the given [url] into a [Resource].
     *
     * @param url The [HttpUrl] to resolve.
     * @return The resolved [Resource].
     * @throws Exception if the resource cannot be resolved.
     */
    suspend fun getResource(url: HttpUrl): Resource

    sealed interface Resource {

        /**
         * A manga resource, optionally containing a specific chapter.
         *
         * @property manga The resolved manga metadata.
         * @property chapter An optional specific chapter of the manga.
         */
        data class Manga(
            val manga: SManga,
            val chapter: SChapter? = null
        ) : Resource
    }
}
