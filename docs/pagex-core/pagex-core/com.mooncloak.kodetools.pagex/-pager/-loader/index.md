//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[Pager](../index.md)/[Loader](index.md)

# Loader

fun interface [Loader](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](index.md)&gt;

A component that can create a [Pager](../index.md) instance with an initial load request.

#### Inheritors

| |
|---|
| [DefaultPagerLoader](../../-default-pager-loader/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [awaitLoad](../../await-load.md) | [common]<br>@[ExperimentalPaginationAPI](../../-experimental-pagination-a-p-i/index.md)<br>suspend fun &lt;[Data](../../await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](../../await-load.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](../../await-load.md)&gt; [Pager.Loader](index.md)&lt;[Data](../../await-load.md), [Filters](../../await-load.md), [Item](../../await-load.md)&gt;.[awaitLoad](../../await-load.md)(request: [PageRequest](../../-page-request/index.md)&lt;[Data](../../await-load.md), [Filters](../../await-load.md)&gt;): [Pager](../index.md)&lt;[Item](../../await-load.md)&gt;<br>Invokes the [Pager.Loader.load](load.md) function and waits for the request to finish loading before returning the resulting [Pager](../index.md) instance. |
| [load](load.md) | [common]<br>abstract fun [load](load.md)(request: [PageRequest](../../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;, coroutineScope: CoroutineScope): [Pager](../index.md)&lt;[Item](index.md)&gt;<br>Creates and returns a new [Pager](../index.md) instance that performs the provided initial [request](load.md). |
