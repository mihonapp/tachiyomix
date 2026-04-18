@file:Suppress("UnusedReceiverParameter", "RedundantSuspendModifier")

package eu.kanade.tachiyomi.network

import okhttp3.Call
import okhttp3.Response
import rx.Observable

@Deprecated("Use suspend APIs instead")
fun Call.asObservable(): Observable<Response> = throw Exception("Stub!")

@Deprecated("Use suspend APIs instead")
fun Call.asObservableSuccess(): Observable<Response> = throw Exception("Stub!")

@Deprecated("Relocated to a different package. Use `eu.kanade.tachiyomi.util.await` instead", ReplaceWith("await()", "eu.kanade.tachiyomi.util.await"))
suspend fun Call.await(): Response = throw Exception("Stub!")
