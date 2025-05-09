package com.mooncloak.kodetools.pagex

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@ExperimentalPaginationAPI
@Serializable
@JvmInline
public value class SortType public constructor(
    public val value: String
) {

    public companion object {

        public val Chronological: SortType = SortType(value = "chronological")
        public val Relevance: SortType = SortType(value = "relevance")
        public val Distance: SortType = SortType(value = "distance")
        public val Alphabetical: SortType = SortType(value = "alphabetical")
    }
}
