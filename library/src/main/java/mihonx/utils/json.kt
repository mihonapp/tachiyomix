@file:Suppress("UNUSED")

package mihonx.utils

import kotlinx.serialization.json.Json
import okhttp3.Response

val defaultJson: Json = throw RuntimeException("Stub!")

inline fun <reified T> Response.parseAs(json: Json = defaultJson): T {
    return body.string().parseAs(json)
}

inline fun <reified T> String.parseAs(json: Json = defaultJson): T {
    return json.decodeFromString(this)
}
