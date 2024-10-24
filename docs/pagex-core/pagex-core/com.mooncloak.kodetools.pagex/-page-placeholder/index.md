//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PagePlaceholder](index.md)

# PagePlaceholder

@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

interface [PagePlaceholder](index.md)&lt;[Item](index.md)&gt; : [Page](../-page/index.md)&lt;[Item](index.md)&gt; 

Represents a placeholder for a [Page](../-page/index.md). For instance, when loading from a very large data set, it may be desirable to only store a certain amount of pages in memory at a time to prevent out-of-memory exceptions and slow applications. One way to continue to paginate from a large data set and support only the most recent pages in memory at a time, is to use a [PagePlaceholder](index.md), where the corresponding [Page](../-page/index.md) can be loaded when it needs to be displayed. The data associated with the [PagePlaceholder](index.md) may be persisted to disk, in-memory, or require an HTTP request to reload. How the data is stored and reloaded is an implementation specific detail.

!Note For supporting a very, very large data set, consider using out-of-order loading of pages instead of an in-order [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [Page](../-page/index.md)s. That will allow completely removing older pages from memory when they are no longer needed.

#### Inheritors

| |
|---|
| [DefaultPagePlaceholder](../-default-page-placeholder/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [dataSourceId](data-source-id.md) | [common]<br>abstract override val [dataSourceId](data-source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A unique identifier value for the data source. This value is especially important when you have numerous data sources that are being merged into a single source (ex: using [PageCollection](../-page-collection/index.md)), as it provides a way to load the next page of data from the appropriate data source. |
| [id](id.md) | [common]<br>abstract override val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A unique identifier value for this [ResolvedPage](../-resolved-page/index.md) instance. |
| [pageCursor](page-cursor.md) | [common]<br>abstract override val [pageCursor](page-cursor.md): [Cursor](../-cursor/index.md)?<br>A [Cursor](../-cursor/index.md) which is an opaque [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value from the caller's perspective. From the implementor's perspective, this is a serialized object value containing data necessary for the (re-)loading of the page data. This value could be a serialized form of a [Cursor](../-cursor/index.md) and [Direction](../-direction/index.md), or contain more complex data, it is up to the implementation to decide what data to store. |

## Functions

| Name | Summary |
|---|---|
| [exceptionOrNull](../exception-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun [PageLoadResult](../-page-load-result/index.md)&lt;*&gt;.[exceptionOrNull](../exception-or-null.md)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?<br>Returns the [ErrorResult.cause](../-error-result/cause.md) if this [PageLoadResult](../-page-load-result/index.md) is an [ErrorResult](../-error-result/index.md), otherwise `null`. |
| [get](get.md) | [common]<br>open suspend override fun [get](get.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;<br>Retrieves the underlying [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of data items for this page. |
| [getOrNull](../get-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-null.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-null.md)&gt;.[getOrNull](../get-or-null.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-null.md)&gt;?<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise `null`. |
| [getOrThrow](../get-or-throw.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-throw.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-throw.md)&gt;.[getOrThrow](../get-or-throw.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-throw.md)&gt;<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise throws an exception. |
| [isSuccess](../is-success.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>fun &lt;[Item](../is-success.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../is-success.md)&gt;.[isSuccess](../is-success.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance represents a successful outcome, otherwise `false`. |
| [resolve](resolve.md) | [common]<br>abstract suspend fun [resolve](resolve.md)(): [ResolvedPage](../-resolved-page/index.md)&lt;[Item](index.md)&gt; |
| [toResolvedPage](../to-resolved-page.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../to-resolved-page.md)&gt; [Page](../-page/index.md)&lt;[Item](../to-resolved-page.md)&gt;.[toResolvedPage](../to-resolved-page.md)(): [ResolvedPage](../-resolved-page/index.md)&lt;[Item](../to-resolved-page.md)&gt; |
