@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
interface SChapter {

    var url: String

    var name: String

    @Suppress("PropertyName")
    @Deprecated("Provide SChapter.uploadedAt instead")
    var date_upload: Long

    @Suppress("PropertyName")
    @Deprecated("Provide SChapter.number instead")
    var chapter_number: Float

    /**
     * Chapter number in string format.
     *
     * Mihon, for example, validates it with the regex `^-?\d+(?:\.\d+)?[a-z]?$`.
     * Example values: `"12"`, `"5.5"`, `"0a"`, `"-1"`.
     */
    var number: String?

    /**
     * Volume number in string format.
     *
     * Mihon, for example, validates it with the regex `^-?\d+(?:\.\d+)?[a-z]?$`, similar to [number].
     * Example values: `"1"`, `"2.5"`, `"3b"`.
     */
    var volume: String?

    var scanlator: String?

    /**
     * UTC timestamp when the chapter was uploaded.
     *
     * If `null`, consumers should fall back to [kotlin.time.Clock.System.now].
     */
    var uploadedAt: Instant?

    /**
     * Optional note associated with the chapter.
     *
     * This can include author comments, annotations, warnings, or other context
     * shown to the user alongside the chapter. Content is free-form and source-defined.
     */
    var note: String?

    /**
     * Arbitrary metadata attached to this chapter.
     *
     * Sources may use key prefixes (e.g., `"mhx.*"`) to indicate custom fields relevant to specific consumers.
     */
    var memo: Map<String, String>

    companion object {
        fun create(): SChapter {
            throw Exception("Stub!")
        }
    }
}
