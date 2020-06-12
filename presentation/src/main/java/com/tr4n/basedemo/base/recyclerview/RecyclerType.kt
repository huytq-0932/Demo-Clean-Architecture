/* gkc_hash_code : 01DN6FJSFFGTXH1JEW3NGB0MX5 */
package com.tr4n.basedemo.base.recyclerview

import androidx.annotation.IntDef

@IntDef(
    TYPE_UNKNOWN,
    TYPE_HEADER,
    TYPE_ITEM,
    TYPE_FOOTER
)
@Retention(AnnotationRetention.SOURCE)
annotation class RecyclerType

const val TYPE_UNKNOWN = -1
const val TYPE_HEADER = 0
const val TYPE_ITEM = 1
const val TYPE_FOOTER = 2
