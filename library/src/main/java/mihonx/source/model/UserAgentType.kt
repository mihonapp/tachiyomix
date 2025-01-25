@file:Suppress("UNUSED")

package mihonx.source.model

/**
 * Type of UserAgent a source needs
 */
sealed interface UserAgentType {
    /**
     * Supports both Desktop or Mobile UserAgent
     */
    data object Universal : UserAgentType

    /**
     * Requires Desktop UserAgent
     */
    data object Desktop : UserAgentType

    /**
     * Requires Mobile UserAgent
     */
    data object Mobile : UserAgentType

    /**
     * Extension manages its own UserAgent
     */
    data object Managed : UserAgentType
}
