package eu.kanade.tachiyomi.network

import android.content.Context
import okhttp3.OkHttpClient

class NetworkHelper(context: Context) {

    val client: OkHttpClient = throw Exception("Stub!")

    @Deprecated(
        message = "The provided regular client should have cloudflare handling capability",
        replaceWith = ReplaceWith("client"),
    )
    val cloudflareClient: OkHttpClient = throw Exception("Stub!")
}
