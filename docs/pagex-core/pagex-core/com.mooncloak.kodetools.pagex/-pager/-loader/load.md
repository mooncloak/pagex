//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[Pager](../index.md)/[Loader](index.md)/[load](load.md)

# load

[common]\
abstract fun [load](load.md)(request: [PageRequest](../../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;, coroutineScope: CoroutineScope): [Pager](../index.md)&lt;[Item](index.md)&gt;

Creates and returns a new [Pager](../index.md) instance that performs the provided initial [request](load.md).

#### Parameters

common

| | |
|---|---|
| request | The initial request that the [Pager](../index.md) loads. |
| coroutineScope | The CoroutineScope that the initial [request](load.md) is launched in. |
