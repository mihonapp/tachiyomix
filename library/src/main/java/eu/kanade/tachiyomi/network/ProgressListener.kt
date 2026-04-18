@file:Suppress("Unused", "UnusedReceiverParameter")

package eu.kanade.tachiyomi.network

fun interface ProgressListener {
    fun onProgress(percentage: Float)
}

fun ProgressListener.onProgress(bytesRead: Long, contentLength: Long): Unit = throw Exception("Stub!")
