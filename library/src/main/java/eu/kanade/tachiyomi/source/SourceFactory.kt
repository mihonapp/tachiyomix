package eu.kanade.tachiyomi.source

/**
 * A factory for creating sources at runtime.
 */
@Suppress("Unused")
@Deprecated("Utilize the language field of SManga and SChapter")
interface SourceFactory {
    /**
     * Create a new copy of the sources
     * @return The created sources
     */
    fun createSources(): List<Source>
}
