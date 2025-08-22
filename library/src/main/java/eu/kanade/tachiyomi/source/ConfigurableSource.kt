package eu.kanade.tachiyomi.source

import android.content.SharedPreferences
import androidx.preference.PreferenceScreen

@Suppress("unused")
interface ConfigurableSource {

    fun setupPreferenceScreen(screen: PreferenceScreen)

    /**
     * Gets instance of [SharedPreferences] scoped to the specific source.
     * This is used to access source-specific preferences, including full chapter download settings.
     *
     * @since extensions-lib 1.5
     * @return SharedPreferences instance for this source
     */
    fun sourcePreferences(): SharedPreferences = throw Exception("Stub!")

}
