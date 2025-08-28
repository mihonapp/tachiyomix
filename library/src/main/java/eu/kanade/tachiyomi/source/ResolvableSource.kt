package eu.kanade.tachiyomi.source

import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga

// TODO(antsy): add KDoc
interface ResolvableSource {

    fun getType(uri: String): UriType?

    suspend fun getManga(uri: String): SManga?

    suspend fun getChapter(uri: String): Pair<SManga, SChapter?>?

    sealed interface UriType {
        data object Manga : UriType
        data object Chapter : UriType
    }
}
