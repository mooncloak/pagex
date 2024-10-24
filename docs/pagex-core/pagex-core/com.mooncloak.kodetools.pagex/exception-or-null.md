//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[exceptionOrNull](exception-or-null.md)

# exceptionOrNull

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun [PageLoadResult](-page-load-result/index.md)&lt;*&gt;.[exceptionOrNull](exception-or-null.md)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?

Returns the [ErrorResult.cause](-error-result/cause.md) if this [PageLoadResult](-page-load-result/index.md) is an [ErrorResult](-error-result/index.md), otherwise `null`.
