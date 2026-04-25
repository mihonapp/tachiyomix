package eu.kanade.tachiyomi.source.model

@Suppress("Unused")
class MangasPage(val mangas: List<SManga>, val hasNextPage: Boolean) {

    @Deprecated("MangasPage is now a regular class")
    operator fun component1(): List<SManga> = throw Exception("Stub!")

    @Deprecated("MangasPage is now a regular class")
    operator fun component2(): Boolean = throw Exception("Stub!")

    @Deprecated("MangasPage is now a regular class")
    fun copy(mangas: List<SManga> = this.mangas, hasNextPage: Boolean = this.hasNextPage): MangasPage = throw Exception("Stub!")
}
