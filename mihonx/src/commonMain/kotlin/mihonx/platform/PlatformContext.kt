package mihonx.platform

/**
 * Platform specific context of the host application.
 *
 * On Android this is a typealias for `android.content.Context`; on the other
 * platforms it's an empty type kept for source compatibility.
 *
 * @since mihonx 0.1.0
 */
public expect abstract class PlatformContext
