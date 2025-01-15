package eu.kanade.tachiyomi.network

import okhttp3.Call
import okhttp3.Response
import rx.Observable

fun Call.asObservable(): Observable<Response> = throw RuntimeException("Stub!")

fun Call.asObservableSuccess(): Observable<Response> = throw RuntimeException("Stub!")

suspend fun Call.await(): Response = throw RuntimeException("Stub!")

/**
 * @since extensions-lib 1.6
 */
suspend fun Call.awaitSuccess(): Response = throw RuntimeException("Stub!")

/**
 * Exception that handles HTTP codes considered not successful by OkHttp.
 * Use it to have a standardized error message in the app across the extensions.
 *
 * @since extensions-lib 1.6
 * @param code [Int] the HTTP status code
 */
class HttpException(val code: Int) : IllegalStateException("HTTP error $code")
