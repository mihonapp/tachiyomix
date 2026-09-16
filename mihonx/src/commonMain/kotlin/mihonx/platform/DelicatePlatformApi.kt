package mihonx.platform

/**
 * Marks a declaration that exposes the underlying platform of the host application.
 *
 * Such declarations are an escape hatch for functionality that mihonx doesn't
 * cover yet. Using them ties the source to a specific platform and to host
 * implementation details that may change without notice, so prefer the
 * platform-agnostic APIs whenever one exists.
 *
 * If no platform-agnostic alternative exists, please open an issue at
 * [mihonapp/tachiyomix](https://github.com/mihonapp/tachiyomix/issues)
 * so one can be provided.
 *
 * Opt in explicitly with `@OptIn(DelicatePlatformApi::class)` to acknowledge
 * these caveats and silence the warning.
 *
 * @since mihonx 0.1.0
 */
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
)
@RequiresOptIn(
    message = "Accessing the platform context ties the source to a specific platform. " +
        "Prefer a platform-agnostic API if one exists, otherwise please request one at " +
        "https://github.com/mihonapp/tachiyomix/issues.",
    level = RequiresOptIn.Level.WARNING,
)
public annotation class DelicatePlatformApi
