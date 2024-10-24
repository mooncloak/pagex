//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[DefaultPageCollection](index.md)

# DefaultPageCollection

@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

@Serializable

data class [DefaultPageCollection](index.md)&lt;[Item](index.md)&gt; : [PageCollection](../-page-collection/index.md)&lt;[Item](index.md)&gt; 

Represents a default [PageCollection](../-page-collection/index.md) instance.

#### See also

| |
|---|
| [PageCollection](../-page-collection/index.md) |

## Properties

| Name | Summary |
|---|---|
| [dataSourceId](data-source-id.md) | [common]<br>@SerialName(value = &quot;source_id&quot;)<br>open override val [dataSourceId](data-source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>A unique identifier value for the data source. This value is especially important when you have numerous data sources that are being merged into a single source (ex: using [PageCollection](../-page-collection/index.md)), as it provides a way to load the next page of data from the appropriate data source. |
| [id](id.md) | [common]<br>@SerialName(value = &quot;id&quot;)<br>open override val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A unique identifier value for this [ResolvedPage](../-resolved-page/index.md) instance. |
| [pageCursor](page-cursor.md) | [common]<br>@SerialName(value = &quot;page_cursor&quot;)<br>open override val [pageCursor](page-cursor.md): [Cursor](../-cursor/index.md)<br>A [Cursor](../-cursor/index.md) which is an opaque [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value from the caller's perspective. From the implementor's perspective, this is a serialized object value containing data necessary for the (re-)loading of the page data. This value could be a serialized form of a [Cursor](../-cursor/index.md) and [Direction](../-direction/index.md), or contain more complex data, it is up to the implementation to decide what data to store. |
| [pages](pages.md) | [common]<br>@SerialName(value = &quot;pages&quot;)<br>open override val [pages](pages.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](../-resolved-page/index.md)&lt;[Item](index.md)&gt;&gt;<br>The [ResolvedPage](../-resolved-page/index.md)s in this [PageCollection](../-page-collection/index.md). |

## Functions

| Name | Summary |
|---|---|
| [exceptionOrNull](../exception-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun [PageLoadResult](../-page-load-result/index.md)&lt;*&gt;.[exceptionOrNull](../exception-or-null.md)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?<br>Returns the [ErrorResult.cause](../-error-result/cause.md) if this [PageLoadResult](../-page-load-result/index.md) is an [ErrorResult](../-error-result/index.md), otherwise `null`. |
| [get](../-page-collection/get.md) | [common]<br>open suspend override fun [get](../-page-collection/get.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](index.md)&gt;<br>Retrieves the underlying [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of data items for this page. |
| [getOrNull](../get-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-null.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-null.md)&gt;.[getOrNull](../get-or-null.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-null.md)&gt;?<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise `null`. |
| [getOrThrow](../get-or-throw.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-throw.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-throw.md)&gt;.[getOrThrow](../get-or-throw.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-throw.md)&gt;<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise throws an exception. |
| [isSuccess](../is-success.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>fun &lt;[Item](../is-success.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../is-success.md)&gt;.[isSuccess](../is-success.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance represents a successful outcome, otherwise `false`. |
| [toResolvedPage](../to-resolved-page.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../to-resolved-page.md)&gt; [Page](../-page/index.md)&lt;[Item](../to-resolved-page.md)&gt;.[toResolvedPage](../to-resolved-page.md)(): [ResolvedPage](../-resolved-page/index.md)&lt;[Item](../to-resolved-page.md)&gt; |
