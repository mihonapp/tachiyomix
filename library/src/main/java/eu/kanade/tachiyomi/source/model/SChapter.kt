package eu.kanade.tachiyomi.source.model

import eu.kanade.tachiyomi.source.Source
import kotlinx.serialization.json.JsonObject

@Suppress("UNUSED", "PropertyName")
interface SChapter {

    /**
     * Stable unique identifier for the chapter.
     *
     * This field is intended to eventually replace [url] as the primary identifier used by the
     * host app.
     *
     * Currently, this field is optional. However, if [key] is non-null, it MUST be used instead of
     * [url] when identifying or referencing the chapter. Otherwise, [url] is used as the fallback
     * identifier, i.e. `key ?: url`.
     *
     * When [key] is non-null, it is expected to be unique within the scope of its source, and
     * uniqueness validation is performed immediately.
     *
     * Future versions will make this field required.
     *
     * @since tachiyomix 1.6
     */
    var key: String?

    var name: String

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
     * @see number
     * @since tachiyomix 1.6
     */
    var volume: String?

    @Deprecated("Provide SChapter.number instead")
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
     * @see volume
     * @since tachiyomix 1.6
     */
    var number: String?

    @Deprecated("Provide SChapter.scanlators instead")
    var scanlator: String?

    var scanlators: List<String>

    var date_upload: Long

    /**
     * Language of the chapter content.
     *
     * Expected to be a valid IETF BCP 47 language tag, for example:
     * * `"en"` → English
     * * `"en-US"` → English (United States)
     * * `"zh-Hant"` → Traditional Chinese
     * * `"es-419"` → Spanish (Latin America)
     *
     * A value of `null` indicates that the language is unknown, unspecified,
     * or not applicable (for example artwork or textless content).
     *
     * If [SManga.language] is not inferred as `"multi"`, any non-null value
     * must match it.
     *
     * @see Source.language
     * @see SManga.language
     * @since tachiyomix 1.6
     */
    var language: String?

    /**
     * Whether the chapter is currently locked or otherwise inaccessible.
     *
     * Locked chapters may require payment, waiting, authentication, or another action before
     * they can be read.
     *
     * @since tachiyomix 1.6
     */
    var locked: Boolean

    /**
     * Optional note associated with the chapter.
     *
     * This can include date of availability, locked status, or other context shown to the user
     * alongside the chapter. Content is free-form and source-defined.
     *
     * @since tachiyomix 1.6
     */
    var note: String?

    var url: String

    /**
     * Extra metadata associated with the chapter.
     *
     * These key-value pairs are invisible to users and intended for internal or source-specific
     * purposes. Apps may define their own namespaced keys (e.g., `"mhx.*"`) for sources to populate.
     *
     * This allows apps to attach and ask for custom information without affecting the visible
     * chapter data.
     *
     * @since tachiyomix 1.6
     */
    var memo: JsonObject

    companion object {
        fun create(): SChapter = throw Exception("Stub!")
    }
}
