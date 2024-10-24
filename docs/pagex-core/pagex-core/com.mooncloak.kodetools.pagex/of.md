//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[of](of.md)

# of

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

fun &lt;[Data](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](of.md)&gt; [PagedDataSource.Companion](-paged-data-source/-companion/index.md).[of](of.md)(sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), load: suspend (request: [PageRequest](-page-request/index.md)&lt;[Data](of.md), [Filters](of.md)&gt;) -&gt; [PageLoadResult](-page-load-result/index.md)&lt;[Item](of.md)&gt;): [PagedDataSource](-paged-data-source/index.md)&lt;[Data](of.md), [Filters](of.md), [Item](of.md)&gt;

Retrieves a [PagedDataSource](-paged-data-source/index.md) whose [PagedDataSource.load](-paged-data-source/load.md) function delegates to the provided [load](of.md) function. This is a convenience function for simply creating a [PagedDataSource](-paged-data-source/index.md).

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

fun &lt;[Data](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](of.md)&gt; [PagedDataSource.Companion](-paged-data-source/-companion/index.md).[of](of.md)(sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), result: [PageLoadResult](-page-load-result/index.md)&lt;[Item](of.md)&gt;): [PagedDataSource](-paged-data-source/index.md)&lt;[Data](of.md), [Filters](of.md), [Item](of.md)&gt;

Retrieves a [PagedDataSource](-paged-data-source/index.md) whose [PagedDataSource.load](-paged-data-source/load.md) always returns the provided [result](of.md). This is a convenience function for simply creating a [PagedDataSource](-paged-data-source/index.md) that always returns a single value. This could be useful for testing purposes.

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Data](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](of.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](of.md)&gt; [PagedDataSource.Companion](-paged-data-source/-companion/index.md).[of](of.md)(values: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Item](of.md)&gt;, sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), format: StringFormat = Json.Default, noinline filter: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](of.md)&gt;.(request: [PageRequest](-page-request/index.md)&lt;[Data](of.md), [Filters](of.md)&gt;) -&gt; [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](of.md)&gt; = { _ -&gt; this }): [InMemoryIndexBasedPagedDataSource](-in-memory-index-based-paged-data-source/index.md)&lt;[Data](of.md), [Filters](of.md), [Item](of.md)&gt;

Creates an [InMemoryIndexBasedPagedDataSource](-in-memory-index-based-paged-data-source/index.md) with the provided [values](of.md).

#### Return

[InMemoryIndexBasedPagedDataSource](-in-memory-index-based-paged-data-source/index.md)

## Example Usage:

```kotlin
val source = PagedDataSource.of<Query, Filters, Item>(values = myValuesList)
```

#### Parameters

common

| | |
|---|---|
| values | The [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) of values. |
| sourceId | The identifier of the returned [InMemoryIndexBasedPagedDataSource](-in-memory-index-based-paged-data-source/index.md). |
| format | The StringFormat used for decoding and encoding the [Cursor](-cursor/index.md) values. |
| filter | An optional filter function that is invoked while loading each page. |
