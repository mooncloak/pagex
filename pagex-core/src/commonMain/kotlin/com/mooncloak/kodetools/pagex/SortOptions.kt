package com.mooncloak.kodetools.pagex

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExperimentalPaginationAPI
@Serializable
public data class SortOptions public constructor(
    @SerialName(value = "type") public val type: SortType,
    @SerialName(value = "order") public val order: SortOrder? = null
) {

    public companion object
}
