package mihonx

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf
import mihonx.js.JSEngine
import mihonx.platform.PlatformContext

public interface Context {

    public val json: Json

    @ExperimentalSerializationApi
    public val protobuf: ProtoBuf

    public val platformContext: PlatformContext

    public fun jsEngine(): JSEngine
}
