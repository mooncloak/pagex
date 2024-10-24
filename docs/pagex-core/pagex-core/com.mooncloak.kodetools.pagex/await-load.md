//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[awaitLoad](await-load.md)

# awaitLoad

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

suspend fun &lt;[Data](await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](await-load.md)&gt; [Pager.Loader](-pager/-loader/index.md)&lt;[Data](await-load.md), [Filters](await-load.md), [Item](await-load.md)&gt;.[awaitLoad](await-load.md)(request: [PageRequest](-page-request/index.md)&lt;[Data](await-load.md), [Filters](await-load.md)&gt;): [Pager](-pager/index.md)&lt;[Item](await-load.md)&gt;

Invokes the [Pager.Loader.load](-pager/-loader/load.md) function and waits for the request to finish loading before returning the resulting [Pager](-pager/index.md) instance.
