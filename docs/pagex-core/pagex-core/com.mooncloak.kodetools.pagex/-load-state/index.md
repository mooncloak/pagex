//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[LoadState](index.md)

# LoadState

sealed interface [LoadState](index.md)

LoadState of a Paged List load.

#### Inheritors

| |
|---|
| [NotLoading](-not-loading/index.md) |
| [Loading](-loading/index.md) |
| [Error](-error/index.md) |

## Types

| Name | Summary |
|---|---|
| [Complete](-complete/index.md) | [common]<br>data object [Complete](-complete/index.md) : [LoadState.NotLoading](-not-loading/index.md)<br>Completed version of [NotLoading](-not-loading/index.md). |
| [Error](-error/index.md) | [common]<br>data class [Error](-error/index.md)(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [LoadState](index.md)<br>Loading hit an error. |
| [Incomplete](-incomplete/index.md) | [common]<br>data object [Incomplete](-incomplete/index.md) : [LoadState.NotLoading](-not-loading/index.md)<br>Incomplete version of [NotLoading](-not-loading/index.md). |
| [Loading](-loading/index.md) | [common]<br>data object [Loading](-loading/index.md) : [LoadState](index.md)<br>Loading is in progress. |
| [NotLoading](-not-loading/index.md) | [common]<br>sealed interface [NotLoading](-not-loading/index.md) : [LoadState](index.md)<br>Indicates the [Pager](../-pager/index.md) is not currently loading, and no error currently observed. |

## Properties

| Name | Summary |
|---|---|
| [endOfPaginationReached](end-of-pagination-reached.md) | [common]<br>abstract val [endOfPaginationReached](end-of-pagination-reached.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`false` if there is more data to load, `true` otherwise. This parameter informs [Pager](../-pager/index.md) if it should continue to make requests for additional data in this direction or if it should halt as the end of the dataset has been reached. |
