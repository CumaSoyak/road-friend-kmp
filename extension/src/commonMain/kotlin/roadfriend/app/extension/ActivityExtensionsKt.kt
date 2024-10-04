package roadfriend.app.extension

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract



fun Any.hashCodeAsString(): String {
    return hashCode().toString()
}

inline fun <reified T : Any> Any?.castOrNull(): T? = this as? T

inline fun <reified T : Any> Any.cast(): T = this as T

/**
 * get tag for all class
 */

inline fun <T> T.applyIf(predicate: T.() -> Boolean, block: T.() -> Unit): T = apply {
    if (predicate(this)) block(this)
}

@OptIn(ExperimentalContracts::class)
fun Any?.isNull(): Boolean {
    contract {
        returns(true) implies (this@isNull != null)
    }
    return this == null
}

@OptIn(ExperimentalContracts::class)
fun Any?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this != null
}
