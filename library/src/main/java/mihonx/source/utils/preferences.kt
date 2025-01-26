@file:Suppress("UnusedReceiverParameter", "UNUSED", "UNUSED_PARAMETER")

package mihonx.source.utils

import android.content.SharedPreferences
import eu.kanade.tachiyomi.source.Source

/**
 * Gets instance of [SharedPreferences] scoped to the specific source.
 *
 * @since extensions-lib 1.6
 */
fun Source.sourcePreferences(): SharedPreferences = throw RuntimeException("Stub!")

/**
 * Gets instance of [SharedPreferences] scoped to the specific source id.
 *
 * @since extensions-lib 1.6
 *
 * @param id source id which the [SharedPreferences] is scoped to.
 */
fun sourcePreferences(id: Long): SharedPreferences = throw RuntimeException("Stub!")
