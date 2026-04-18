@file:Suppress("Unused", "UnusedReceiverParameter", "RedundantSuspendModifier")

package eu.kanade.tachiyomi.util

import eu.kanade.tachiyomi.network.HttpException
import okhttp3.Call
import okhttp3.Response

suspend fun Call.await(): Response = throw Exception("Stub!")

/**
 * Similar to [await] but throws [HttpException] if [Response.isSuccessful] returns false
 */
suspend fun Call.awaitSuccess(): Response = throw Exception("Stub!")
