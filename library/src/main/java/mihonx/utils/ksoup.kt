@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package mihonx.utils

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.nodes.Document
import okhttp3.Response

/**
 * Returns a Ksoup document for this response.
 *
 * @since extensions-lib 1.6
 */
inline fun Response.parseAsDocument(): Document {
    return body.string().parseAsDocument(request.url.toString())
}

/**
 * Returns a Ksoup document for this HTML string.
 *
 * @since extensions-lib 1.6
 *
 * @param baseUri the URL where the HTML was retrieved from. Used to resolve relative URLs to absolute URLs.
 */
inline fun String.parseAsDocument(baseUri: String): Document {
    return Ksoup.parse(this, baseUri)
}
