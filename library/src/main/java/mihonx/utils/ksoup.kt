@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package mihonx.utils

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import okhttp3.Response

inline fun Response.parseAsDocument(): Document {
    return body.string().parseAsDocument(request.url.toString())
}

inline fun String.parseAsDocument(baseUri: String): Document {
    return Ksoup.parse(this, baseUri)
}
