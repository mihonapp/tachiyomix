@file:Suppress("Unused", "UnusedReceiverParameter", "RedundantSuspendModifier")

package eu.kanade.tachiyomi.network

import okhttp3.Call
import okhttp3.Response
import rx.Observable

@Deprecated("Use suspend APIs instead")
fun Call.asObservable(): Observable<Response> = throw Exception("Stub!")

@Deprecated("Use suspend APIs instead")
fun Call.asObservableSuccess(): Observable<Response> = throw Exception("Stub!")

suspend fun Call.await(): Response = throw Exception("Stub!")

/**
 * Similar to [await] but throws [HttpException] if [Response.isSuccessful] returns false
 */
suspend fun Call.awaitSuccess(): Response = throw Exception("Stub!")
