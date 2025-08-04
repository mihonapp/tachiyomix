/*
 * Copyright (C) 2025 AntsyLich and Mihon Open Source Project
 * SPDX-License-Identifier: Apache-2.0
 */
package mihonx.models

sealed interface Staff {
    val key: String
    val name: String

    sealed interface Manga : Staff
    sealed interface Chapter : Staff

    class Author(
        override val key: String,
        override val name: String,
    ) : Manga

    class Artist(
        override val key: String,
        override val name: String,
    ) : Manga

    class Circle(
        override val key: String,
        override val name: String,
    ) : Manga

    class Translator(
        override val key: String,
        override val name: String,
    ) : Chapter

    class Uploader(
        override val key: String,
        override val name: String,
    ) : Chapter
}
