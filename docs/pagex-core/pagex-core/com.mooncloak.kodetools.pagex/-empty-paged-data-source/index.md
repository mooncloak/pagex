//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[EmptyPagedDataSource](index.md)

# EmptyPagedDataSource

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

class [EmptyPagedDataSource](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](index.md)&gt;(val sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;EmptyPagedDataSource&quot;) : [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](index.md), [Filters](index.md), [Item](index.md)&gt; 

A [PagedDataSource](../-paged-data-source/index.md) whose [PagedDataSource.load](../-paged-data-source/load.md) function always returns an empty [Page](../-page/index.md).

## Constructors

| | |
|---|---|
| [EmptyPagedDataSource](-empty-paged-data-source.md) | [common]<br>constructor(sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;EmptyPagedDataSource&quot;) |

## Properties

| Name | Summary |
|---|---|
| [sourceId](source-id.md) | [common]<br>open override val [sourceId](source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [after](../after.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../after.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../after.md)&gt; [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](../after.md), [Filters](../after.md), [Item](../after.md)&gt;.[after](../after.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../after.md)&gt; |
| [before](../before.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Data](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../before.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../before.md)&gt; [PagedDataSource](../-paged-data-source/index.md)&lt;[Data](../before.md), [Filters](../before.md), [Item](../before.md)&gt;.[before](../before.md)(cursor: [Cursor](../-cursor/index.md)): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../before.md)&gt; |
| [load](load.md) | [common]<br>open suspend override fun [load](load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;): [PageLoadResult](../-page-load-result/index.md)&lt;[Item](index.md)&gt; |
