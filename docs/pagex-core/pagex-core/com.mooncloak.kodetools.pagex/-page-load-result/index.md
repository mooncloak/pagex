//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PageLoadResult](index.md)

# PageLoadResult

@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

sealed interface [PageLoadResult](index.md)&lt;[Item](index.md)&gt;

Represents a result that can be returned from the [PagedDataSource.load](../-paged-data-source/load.md) function.

#### Inheritors

| |
|---|
| [Page](../-page/index.md) |
| [InvalidResult](../-invalid-result/index.md) |
| [ErrorResult](../-error-result/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [exceptionOrNull](../exception-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun [PageLoadResult](index.md)&lt;*&gt;.[exceptionOrNull](../exception-or-null.md)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?<br>Returns the [ErrorResult.cause](../-error-result/cause.md) if this [PageLoadResult](index.md) is an [ErrorResult](../-error-result/index.md), otherwise `null`. |
| [getOrNull](../get-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-null.md)&gt; [PageLoadResult](index.md)&lt;[Item](../get-or-null.md)&gt;.[getOrNull](../get-or-null.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-null.md)&gt;?<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](index.md) is a [Page](../-page/index.md), otherwise `null`. |
| [getOrThrow](../get-or-throw.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-throw.md)&gt; [PageLoadResult](index.md)&lt;[Item](../get-or-throw.md)&gt;.[getOrThrow](../get-or-throw.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-throw.md)&gt;<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](index.md) is a [Page](../-page/index.md), otherwise throws an exception. |
| [isSuccess](../is-success.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>fun &lt;[Item](../is-success.md)&gt; [PageLoadResult](index.md)&lt;[Item](../is-success.md)&gt;.[isSuccess](../is-success.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance represents a successful outcome, otherwise `false`. |
