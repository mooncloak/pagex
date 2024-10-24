//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[LoadState](../index.md)/[Loading](index.md)/[endOfPaginationReached](end-of-pagination-reached.md)

# endOfPaginationReached

[common]\
open override val [endOfPaginationReached](end-of-pagination-reached.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false

`false` if there is more data to load, `true` otherwise. This parameter informs [Pager](../../-pager/index.md) if it should continue to make requests for additional data in this direction or if it should halt as the end of the dataset has been reached.
