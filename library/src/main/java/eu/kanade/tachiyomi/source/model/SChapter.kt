@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import mihonx.models.Chapter
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

    var number: String?

    var volume: String?

    var scanlator: String?

    var language: String?

    var uploadedAt: Instant?

    var lockStatus: Chapter.LockStatus

    var extras: Map<String, String>

    companion object {
        fun create(): SChapter {
            throw Exception("Stub!")
        }
    }
}
