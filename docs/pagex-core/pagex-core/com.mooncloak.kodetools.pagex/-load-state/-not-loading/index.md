//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[LoadState](../index.md)/[NotLoading](index.md)

# NotLoading

sealed interface [NotLoading](index.md) : [LoadState](../index.md)

Indicates the [Pager](../../-pager/index.md) is not currently loading, and no error currently observed.

#### Inheritors

| |
|---|
| [Complete](../-complete/index.md) |
| [Incomplete](../-incomplete/index.md) |

## Properties

| Name | Summary |
|---|---|
| [endOfPaginationReached](../end-of-pagination-reached.md) | [common]<br>abstract val [endOfPaginationReached](../end-of-pagination-reached.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`false` if there is more data to load, `true` otherwise. This parameter informs [Pager](../../-pager/index.md) if it should continue to make requests for additional data in this direction or if it should halt as the end of the dataset has been reached. |
