package mihonx.source.model

/**
 * Type of UserAgent a source needs
 */
sealed interface UserAgentType {
    /**
     * Supports both Desktop or Mobile UserAgent
     */
    data object Any : UserAgentType

    /**
     * Requires Desktop UserAgent
     */
    data object Desktop : UserAgentType

    /**
     * Requires Mobile UserAgent
     */
    data object Mobile : UserAgentType

    /**
     * Extension sets it's own UserAgent
     * so it is not managed by the app
     */
    data object Unmanaged : UserAgentType
}
