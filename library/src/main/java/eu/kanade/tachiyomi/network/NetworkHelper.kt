@file:Suppress("UNUSED_PARAMETER", "UNUSED")

package eu.kanade.tachiyomi.network

import android.content.Context
import okhttp3.OkHttpClient

class NetworkHelper(context: Context) {

    val client: OkHttpClient = throw RuntimeException("Stub!")

    @Deprecated("Use the regular client", ReplaceWith("client"))
    val cloudflareClient: OkHttpClient = throw RuntimeException("Stub!")
}
