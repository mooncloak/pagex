//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[LoadState](../index.md)/[Incomplete](index.md)

# Incomplete

[common]\
data object [Incomplete](index.md) : [LoadState.NotLoading](../-not-loading/index.md)

Incomplete version of [NotLoading](../-not-loading/index.md).

## Properties

| Name | Summary |
|---|---|
| [endOfPaginationReached](end-of-pagination-reached.md) | [common]<br>open override val [endOfPaginationReached](end-of-pagination-reached.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>`false` if there is more data to load, `true` otherwise. This parameter informs [Pager](../../-pager/index.md) if it should continue to make requests for additional data in this direction or if it should halt as the end of the dataset has been reached. |
