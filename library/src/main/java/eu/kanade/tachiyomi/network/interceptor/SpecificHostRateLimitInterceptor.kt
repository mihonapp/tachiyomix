@file:Suppress("UnusedReceiverParameter")

package eu.kanade.tachiyomi.network.interceptor

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * An OkHttp interceptor that handles given url host's rate limiting.
 *
 * This uses Java Time APIs and is the legacy method, kept
 * for compatibility reasons with existing extensions.
 *
 * Examples:
 *
 * httpUrl = "https://api.manga.example".toHttpUrlOrNull(), permits = 5, period = 1, unit = seconds  =>  5 requests per second to api.manga.example
 * httpUrl = "https://cdn.manga.example/images".toHttpUrlOrNull(), permits = 10, period = 2, unit = minutes  =>  10 requests per 2 minutes to cdn.manga.example
 *
 * @since extension-lib 1.3
 *
 * @param httpUrl [HttpUrl] The url host that this interceptor should handle. Will get url's host by using HttpUrl.host()
 * @param permits [Int]     Number of requests allowed within a period of units.
 * @param period [Long]     The limiting duration. Defaults to 1.
 * @param unit [TimeUnit]   The unit of time for the period. Defaults to seconds.
 */
@Deprecated(
    message = "Use the version with kotlin.time APIs instead.",
    replaceWith = ReplaceWith(
        expression = "rateLimit(permits, period.toDuration(unit.toDurationUnit())) { it.host == httpUrl.host }",
        imports = [
            "mihonx.network.rateLimit",
            "kotlin.time.toDuration",
            "kotlin.time.toDurationUnit",
        ]
    )
)
fun OkHttpClient.Builder.rateLimitHost(
    httpUrl: HttpUrl,
    permits: Int,
    period: Long = 1,
    unit: TimeUnit = TimeUnit.SECONDS,
): OkHttpClient.Builder = throw RuntimeException("Stub!")
