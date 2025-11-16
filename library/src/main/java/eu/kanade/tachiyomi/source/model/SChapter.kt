@file:Suppress("UNUSED", "PropertyName")

package eu.kanade.tachiyomi.source.model

interface SChapter {

    var url: String

    var name: String

    @Suppress("PropertyName")
    var date_upload: Long

    @Deprecated("Provide SChapter.number instead")
    @Suppress("PropertyName")
    var chapter_number: Float

    /**
     * Chapter number in string format.
     *
     * Typically validated using the pattern:
     * ```
     * ^(?:-?\d+(?:\.\d+)?[a-z]?|nan)$
     * ```
     *
     * This format supports:
     * * Whole numbers → `"1"`
     * * Decimal numbers → `"1.5"`
     * * Optional trailing lowercase letters → `"1a"`, `"1.5b"`
     * * Negative values → `"-1"`
     * * `null` for unnumbered chapters
     * * Literal `"nan"` for unknown or ambiguous values
     *
     * When encountering `"nan"`, the app may attempt to infer a chapter number manually.
     * If parsing still fails, it is recommended to treat the value as `null`.
     *
     * See also: [volume]
     */
    var number: String?

    /**
     * Volume number in string format.
     *
     * Typically validated using the pattern:
     * ```
     * ^(?:-?\d+(?:\.\d+)?[a-z]?|nan)$
     * ```
     *
     * This format supports:
     * * Whole numbers → `"1"`
     * * Decimal numbers → `"1.5"`
     * * Optional trailing lowercase letters → `"1a"`, `"1.5b"`
     * * Negative values → `"-1"`
     * * `null` for unnumbered volumes
     * * Literal `"nan"` for unknown or ambiguous values
     *
     * When encountering `"nan"`, the app may attempt to infer a volume number manually.
     * If parsing still fails, it is recommended to treat the value as `null`.
     *
     * See also: [number]
     */
    var volume: String?

    var scanlator: String?

    /**
     * Optional note associated with the chapter.
     *
     * This can include date of availability, locked status, or other context shown to the user
     * alongside the chapter. Content is free-form and source-defined.
     */
    var note: String?

    /**
     * Extra metadata associated with the chapter.
     *
     * These key-value pairs are invisible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mhx.*"`) for sources can populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * chapter data.
     */
    var memo: Map<String, String>

    companion object {
        fun create(): SChapter = throw Exception("Stub!")
    }
}
