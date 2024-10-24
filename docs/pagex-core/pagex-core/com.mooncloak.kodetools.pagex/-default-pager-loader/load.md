//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[DefaultPagerLoader](index.md)/[load](load.md)

# load

[common]\
open override fun [load](load.md)(request: [PageRequest](../-page-request/index.md)&lt;[Data](index.md), [Filters](index.md)&gt;, coroutineScope: CoroutineScope): [Pager](../-pager/index.md)&lt;[Item](index.md)&gt;

Creates and returns a new [Pager](../-pager/index.md) instance that performs the provided initial [request](load.md).

#### Parameters

common

| | |
|---|---|
| request | The initial request that the [Pager](../-pager/index.md) loads. |
| coroutineScope | The CoroutineScope that the initial [request](load.md) is launched in. |
