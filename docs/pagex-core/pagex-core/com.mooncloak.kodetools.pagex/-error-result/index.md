//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[ErrorResult](index.md)

# ErrorResult

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

data class [ErrorResult](index.md)&lt;[Item](index.md)&gt;(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [PageLoadResult](../-page-load-result/index.md)&lt;[Item](index.md)&gt; 

Represents an error result. This mimics the class from the androidx.paging library.

## Constructors

| | |
|---|---|
| [ErrorResult](-error-result.md) | [common]<br>constructor(cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [cause](cause.md) | [common]<br>val [cause](cause.md): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)<br>The exception that was encountered when attempting to load paged data. |

## Functions

| Name | Summary |
|---|---|
| [exceptionOrNull](../exception-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun [PageLoadResult](../-page-load-result/index.md)&lt;*&gt;.[exceptionOrNull](../exception-or-null.md)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?<br>Returns the [ErrorResult.cause](cause.md) if this [PageLoadResult](../-page-load-result/index.md) is an [ErrorResult](index.md), otherwise `null`. |
| [getOrNull](../get-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-null.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-null.md)&gt;.[getOrNull](../get-or-null.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-null.md)&gt;?<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise `null`. |
| [getOrThrow](../get-or-throw.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline suspend fun &lt;[Item](../get-or-throw.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../get-or-throw.md)&gt;.[getOrThrow](../get-or-throw.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](../get-or-throw.md)&gt;<br>Returns [Page.get](../-page/get.md) if this [PageLoadResult](../-page-load-result/index.md) is a [Page](../-page/index.md), otherwise throws an exception. |
| [isSuccess](../is-success.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>fun &lt;[Item](../is-success.md)&gt; [PageLoadResult](../-page-load-result/index.md)&lt;[Item](../is-success.md)&gt;.[isSuccess](../is-success.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this instance represents a successful outcome, otherwise `false`. |
