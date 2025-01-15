package mihonx.utils

import kotlinx.serialization.json.Json
import okhttp3.Response

inline fun <reified T> Response.parseAs(json: Json = throw RuntimeException("Stub!")): T {
    throw RuntimeException("Stub!")
}

inline fun <reified T> String.parseAs(json: Json = throw RuntimeException("Stub!")): T {
    throw RuntimeException("Stub!")
}
