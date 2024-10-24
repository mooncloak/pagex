//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[Pager](index.md)

# Pager

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

interface [Pager](index.md)&lt;[Item](index.md)&gt;

A stateful abstraction over one or more [PagedDataSource](../-paged-data-source/index.md) components that can be used for pagination.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |
| [Loader](-loader/index.md) | [common]<br>fun interface [Loader](-loader/index.md)&lt;[Data](-loader/index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](-loader/index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](-loader/index.md)&gt;<br>A component that can create a [Pager](index.md) instance with an initial load request. |

## Properties

| Name | Summary |
|---|---|
| [flow](flow.md) | [common]<br>abstract val [flow](flow.md): Flow&lt;[PagerStateModel](../-pager-state-model/index.md)&lt;[Item](index.md)&gt;&gt;<br>The Flow of [PagerStateModel](../-pager-state-model/index.md)s that get emitted when the data is updated by invoking the paging functions. |

## Functions

| Name | Summary |
|---|---|
| [append](append.md) | [common]<br>abstract suspend fun [append](append.md)()<br>Loads at the end of the paging data. |
| [prepend](prepend.md) | [common]<br>abstract suspend fun [prepend](prepend.md)()<br>Loads at the start of the paging data. |
| [refresh](refresh.md) | [common]<br>abstract suspend fun [refresh](refresh.md)()<br>Refreshes the data by loading the initial paging data. |
