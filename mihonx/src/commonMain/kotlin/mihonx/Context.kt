package mihonx

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf
import mihonx.js.JSEngine
import mihonx.platform.DelicatePlatformApi
import mihonx.platform.PlatformContext

/**
 * Entry point to the utilities provided by the host application.
 *
 * An instance is supplied to the source by the host application and is
 * expected to be reused instead of creating equivalent instances manually.
 *
 * @since mihonx 0.1.0
 */
public interface Context {

    /**
     * Shared [Json] instance configured by the host application.
     *
     * @since mihonx 0.1.0
     */
    public val json: Json

    /**
     * Shared [ProtoBuf] instance configured by the host application.
     *
     * @since mihonx 0.1.0
     */
    @ExperimentalSerializationApi
    public val protobuf: ProtoBuf

    /**
     * Platform specific context of the host application.
     *
     * This is a last-resort escape hatch for functionality that mihonx doesn't
     * cover yet; reaching for it ties the source to a specific platform, so
     * prefer the platform-agnostic APIs whenever one exists. If none does,
     * please request one at
     * [mihonapp/tachiyomix](https://github.com/mihonapp/tachiyomix/issues).
     *
     * @see PlatformContext
     * @see DelicatePlatformApi
     * @since mihonx 0.1.0
     */
    @DelicatePlatformApi
    public val platformContext: PlatformContext

    /**
     * Creates a new [JSEngine] for evaluating JavaScript.
     *
     * Each call returns a new engine, and the caller is responsible for closing
     * it once it's no longer needed.
     *
     * @see JSEngine
     * @since mihonx 0.1.0
     * @return a new JavaScript engine instance.
     */
    public fun jsEngine(): JSEngine
}
