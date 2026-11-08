package eu.kanade.tachiyomi.util

import android.graphics.Bitmap
import java.io.InputStream

/**
 * Decodes images with the app's own image decoder, for formats Android can't decode on every
 * version (AVIF, JPEG XL, HEIF).
 */
@Suppress("Unused")
object ImageDecoder {

    /**
     * Decode an image, or the first frame of an animated one. Blocking; safe to call from
     * several threads.
     *
     * @since tachiyomix 1.7
     * @param stream the encoded image, read to the end. The caller closes it.
     * @return a new sRGB [Bitmap.Config.ARGB_8888] bitmap, recycled by the caller.
     * @throws java.io.IOException if the image can't be decoded.
     */
    fun decode(stream: InputStream): Bitmap = throw Exception("Stub!")
}
