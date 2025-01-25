@file:Suppress("UNUSED")

package mihonx.utils

inline fun <reified T> Iterable<*>.firstInstance(): T = first { it is T } as T

inline fun <reified T> Iterable<*>.firstInstanceOrNull(): T? = firstOrNull { it is T } as? T
