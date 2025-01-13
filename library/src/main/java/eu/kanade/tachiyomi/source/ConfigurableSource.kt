package eu.kanade.tachiyomi.source

import android.content.SharedPreferences
import androidx.preference.PreferenceScreen

@Suppress("unused")
interface ConfigurableSource {

    /**
     * Gets instance of [SharedPreferences] scoped to the specific source.
     *
     * @since extensions-lib 1.6
     */
    fun getSourcePreferences(): SharedPreferences = throw Exception("Stub!")

    /**
     * Gets instance of [SharedPreferences] corrisponding to the source id
     *
     * @parm id the source id
     * @since extensions-lib 1.6
     */
    fun getSourcePreferences(id: Long): SharedPreferences = throw Exception("Stub!")

    fun setupPreferenceScreen(screen: PreferenceScreen)

}
