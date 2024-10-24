//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[InMemoryIndexBasedPagedDataSource](index.md)

# InMemoryIndexBasedPagedDataSource

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

class [InMemoryIndexBasedPagedDataSource](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](index.md)&gt;(val sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val values: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;, format: StringFormat, filter: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;.(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;) -&gt; [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;) : [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](index.md), [Filters](index.md), [Item](index.md)&gt; 

A [PagedDataSource](../-paged-data-source/index.md) that keeps the provided [values](values.md) in-memory (not stored to disk). Invoking the [InMemoryIndexBasedPagedDataSource.load](load.md) function, loads the pages from the [values](values.md) in-memory.

## Constructors

| | |
|---|---|
| [InMemoryIndexBasedPagedDataSource](-in-memory-index-based-paged-data-source.md) | [common]<br>constructor(sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), values: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;, format: StringFormat, filter: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;.(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;) -&gt; [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [sourceId](source-id.md) | [common]<br>open override val [sourceId](source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [values](values.md) | [common]<br>val [values](values.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [after](../after.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../after.md)&gt; [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](../after.md), [Filters](../after.md), [Item](../after.md)&gt;.[after](../after.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../after.md)&gt; |
| [before](../before.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../before.md)&gt; [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](../before.md), [Filters](../before.md), [Item](../before.md)&gt;.[before](../before.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../before.md)&gt; |
| [load](load.md) | [common]<br>open suspend override fun [load](load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](index.md)&gt; |
