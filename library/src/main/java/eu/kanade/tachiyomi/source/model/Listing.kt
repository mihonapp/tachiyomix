package eu.kanade.tachiyomi.source.model

import eu.kanade.tachiyomi.source.Source

/**
 * A named collection of manga offered by a [Source], such as "Popular", "Latest" or "Trending".
 *
 * @since tachiyomix 1.7
 * @param id identifies the listing within the source. Must be unique.
 * @param name the user facing name of the listing.
 */
@Suppress("Unused")
class Listing(val id: String, val name: String)
