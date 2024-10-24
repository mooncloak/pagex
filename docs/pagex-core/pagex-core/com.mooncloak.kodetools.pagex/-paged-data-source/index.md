//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PagedDataSource](index.md)

# PagedDataSource

@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

interface [PagedDataSource](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](index.md)&gt;

A stateless repository abstraction over a data source whose underlying data can be paginated through.

#### Inheritors

| |
|---|
| [CombinedPagedDataSource](../-combined-paged-data-source/index.md) |
| [EmptyPagedDataSource](../-empty-paged-data-source/index.md) |
| [InMemoryIndexBasedPagedDataSource](../-in-memory-index-based-paged-data-source/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [sourceId](source-id.md) | [common]<br>abstract val [sourceId](source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [after](../after.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../after.md)&gt; [PagedDataSource](index.md)&lt;[Data](../after.md), [Filters](../after.md), [Item](../after.md)&gt;.[after](../after.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../after.md)&gt; |
| [before](../before.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../before.md)&gt; [PagedDataSource](index.md)&lt;[Data](../before.md), [Filters](../before.md), [Item](../before.md)&gt;.[before](../before.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../before.md)&gt; |
| [load](load.md) | [common]<br>abstract suspend fun [load](load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](index.md)&gt; |
