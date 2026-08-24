package mihonx

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

public interface Context {

    public val json: Json

    @ExperimentalSerializationApi
    public val protobuf: ProtoBuf
}
