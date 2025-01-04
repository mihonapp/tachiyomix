package eu.kanade.tachiyomi.network

import android.content.Context
import okhttp3.OkHttpClient

class NetworkHelper(context: Context) {

    val client: OkHttpClient = throw Exception("Stub!")

    @Deprecated("Use the regular client")
    val cloudflareClient: OkHttpClient = throw Exception("Stub!")

    /**
     * @since extensions-lib 1.6
     */
    fun defaultUserAgentProvider(): String = throw Exception("Stub!")
}