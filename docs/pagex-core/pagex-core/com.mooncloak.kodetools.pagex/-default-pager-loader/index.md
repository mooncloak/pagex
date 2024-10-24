//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[DefaultPagerLoader](index.md)

# DefaultPagerLoader

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

class [DefaultPagerLoader](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](index.md)&gt; : [Pager.Loader](../-pager/-loader/index.md)&lt;[Data](index.md), [Filters](index.md), [Item](index.md)&gt;

## Functions

| Name | Summary |
|---|---|
| [awaitLoad](../await-load.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>suspend fun &lt;[Data](../await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../await-load.md)&gt; [Pager.Loader](../-pager/-loader/index.md)&lt;[Data](../await-load.md), [Filters](../await-load.md), [Item](../await-load.md)&gt;.[awaitLoad](../await-load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](../await-load.md), [Filters](../await-load.md)&gt;): [Pager](../-pager/index.md)&lt;[Item](../await-load.md)&gt;<br>Invokes the [Pager.Loader.load](../-pager/-loader/load.md) function and waits for the request to finish loading before returning the resulting [Pager](../-pager/index.md) instance. |
| [load](load.md) | [common]<br>open override fun [load](load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;, coroutineScope: CoroutineScope): [Pager](../-pager/index.md)&lt;[Item](index.md)&gt;<br>Creates and returns a new [Pager](../-pager/index.md) instance that performs the provided initial [request](load.md). |
