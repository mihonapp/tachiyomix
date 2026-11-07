package eu.kanade.tachiyomi.source.model

/**
 * Class that holds information for a chapter thumbnail.
 *
 * @param url the url to the thumbnail.
 * @param aspectRatio the aspect ratio of the image. Defaults to 1.0. The app clamps it between
 * 0.5 and 2.0.
 */
@Suppress("UNUSED")
class ThumbnailInfo(
    val url: String?,
    val aspectRatio: Double = 1.0,
)
