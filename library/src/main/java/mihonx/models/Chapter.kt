/*
 * Copyright (C) 2025 AntsyLich and Mihon Open Source Project
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("UNUSED")

package mihonx.models

class Chapter {
    enum class LockStatus {
        None,
        Locked,
        Unlocked,
        External,
        Unknown,
    }
}
