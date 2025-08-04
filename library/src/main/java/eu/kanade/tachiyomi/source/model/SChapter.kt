@file:Suppress("UNUSED")

package eu.kanade.tachiyomi.source.model

import mihonx.models.Chapter
import mihonx.models.Staff
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
interface SChapter {

    var key: String

    @Deprecated("Provide SChapter.key instead which will be a unique identifier instead of relative url")
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

    @Deprecated("Provide SChapter.staff instead")
    var scanlator: String?

    var staff: List<Staff.Chapter>

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

fun SChapter.setStaff(
    translator: String? = null,
    uploader: String? = null,
): SChapter {
    return also {
        it.staff = buildList(2) {
            if (translator != null) add(Staff.Translator(translator, translator))
            if (uploader != null) add(Staff.Uploader(uploader, uploader))
        }
    }
}
