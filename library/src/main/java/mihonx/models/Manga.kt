/*
 * Copyright (C) 2025 AntsyLich and Mihon Open Source Project
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("UNUSED")

package mihonx.models

class Manga {
    enum class ContentRating {
        Safe,
        Suggestive,
        Adult,
    }

    enum class ReadingMode {
        RightToLeft,
        LeftToRight,
        LongStrip,
    }

    enum class UpdateStrategy {
        AlwaysUpdate,
        OnlyFetchOnce,
    }
}
