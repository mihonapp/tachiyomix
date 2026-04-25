package eu.kanade.tachiyomi.source

import androidx.preference.PreferenceScreen

@Suppress("Unused")
interface ConfigurableSource {

    fun setupPreferenceScreen(screen: PreferenceScreen)
}
