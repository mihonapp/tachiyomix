package tachiyomix.source

import eu.kanade.tachiyomi.source.model.SManga

/**
 * A single step in a source's self-migration history.
 *
 * The host app keeps track of the highest migration [version] it has already applied
 * for a given library entry, and applies any migrations with a higher version, in order,
 * the next time it checks that entry.
 */
interface Migration {

    /**
     * The version this migration bumps the source to. Starts from 1 and increases by at
     * least 1 with every migration a source adds, regardless of the source's own versioning.
     */
    val version: Int

    /**
     * Resolves old library entries to their new equivalent.
     *
     * For each entry, return its old [SManga.url] paired with the [SManga] it should be
     * replaced with, or `null` if it doesn't resolve to anything new. Unresolved entries
     * are left untouched by the host app and may be offered again on a future migration
     * version.
     *
     * @param mangas the old entries to migrate.
     * @return a pair of the old entry's url to its replacement, in the same order as [mangas].
     */
    suspend fun migrate(mangas: List<SManga>): List<Pair<String, SManga?>>
}
