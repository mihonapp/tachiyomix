package eu.kanade.tachiyomi.network

import okhttp3.CacheControl
import okhttp3.Headers
import okhttp3.HttpUrl
import okhttp3.Request
import okhttp3.RequestBody

internal val DEFAULT_CACHE_CONTROL: CacheControl = throw RuntimeException("Stub!")
internal val DEFAULT_HEADERS: Headers = throw RuntimeException("Stub!")
internal val DEFAULT_BODY: RequestBody = throw RuntimeException("Stub!")

fun GET(url: String,
        headers: Headers = DEFAULT_HEADERS,
        cache: CacheControl = DEFAULT_CACHE_CONTROL): Request {

    throw RuntimeException("Stub!")
}

/**
 * @since extensions-lib 1.4
 */
fun GET(url: HttpUrl,
        headers: Headers = DEFAULT_HEADERS,
        cache: CacheControl = DEFAULT_CACHE_CONTROL): Request {

    throw RuntimeException("Stub!")
}

fun POST(url: String,
         headers: Headers = DEFAULT_HEADERS,
         body: RequestBody = DEFAULT_BODY,
         cache: CacheControl = DEFAULT_CACHE_CONTROL): Request {

    throw RuntimeException("Stub!")
}
