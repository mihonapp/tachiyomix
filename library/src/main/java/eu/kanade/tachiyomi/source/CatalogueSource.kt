package eu.kanade.tachiyomi.source

@Suppress("Unused")
@Deprecated("Use Source interface directly", ReplaceWith("Source"))
interface CatalogueSource : Source {

    override val language: String get() = throw Exception("Stub!")

    /**
     * An ISO 639-1 compliant language code (two letters in lower case).
     */
    @Deprecated("Use the language API instead", ReplaceWith("language"))
    val lang: String
}
