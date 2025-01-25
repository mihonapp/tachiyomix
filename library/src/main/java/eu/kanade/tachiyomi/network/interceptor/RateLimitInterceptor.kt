@file:Suppress("UnusedReceiverParameter")

package eu.kanade.tachiyomi.network.interceptor

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * An OkHttp interceptor that handles rate limiting.
 *
 * This uses `java.time` APIs and is the legacy method, kept
 * for compatibility reasons with existing extensions.
 *
 * Examples:
 *
 * permits = 5,  period = 1, unit = seconds  =>  5 requests per second
 * permits = 10, period = 2, unit = minutes  =>  10 requests per 2 minutes
 *
 * @since extension-lib 1.3
 *
 * @param permits [Int]   Number of requests allowed within a period of units.
 * @param period [Long]   The limiting duration. Defaults to 1.
 * @param unit [TimeUnit] The unit of time for the period. Defaults to seconds.
 */
@Deprecated(
    message = "Use the version with kotlin.time APIs instead.",
    replaceWith = ReplaceWith(
        expression = "rateLimit(permits, period.toDuration(unit.toDurationUnit()))",
        imports = [
            "mihonx.network.rateLimit",
            "kotlin.time.toDuration",
            "kotlin.time.toDurationUnit",
        ]
    )
)
fun OkHttpClient.Builder.rateLimit(
    permits: Int,
    period: Long = 1,
    unit: TimeUnit = TimeUnit.SECONDS,
): OkHttpClient.Builder = throw RuntimeException("Stub!")
