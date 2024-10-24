//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[getOrThrow](get-or-throw.md)

# getOrThrow

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline suspend fun &lt;[Item](get-or-throw.md)&gt; [PageLoadResult](-page-load-result/index.md)&lt;[Item](get-or-throw.md)&gt;.[getOrThrow](get-or-throw.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](get-or-throw.md)&gt;

Returns [Page.get](-page/get.md) if this [PageLoadResult](-page-load-result/index.md) is a [Page](-page/index.md), otherwise throws an exception.
