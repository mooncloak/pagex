//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[getOrNull](get-or-null.md)

# getOrNull

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline suspend fun &lt;[Item](get-or-null.md)&gt; [PageLoadResult](-page-load-result/index.md)&lt;[Item](get-or-null.md)&gt;.[getOrNull](get-or-null.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](get-or-null.md)&gt;?

Returns [Page.get](-page/get.md) if this [PageLoadResult](-page-load-result/index.md) is a [Page](-page/index.md), otherwise `null`.
