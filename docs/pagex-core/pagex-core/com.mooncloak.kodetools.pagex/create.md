//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[create](create.md)

# create

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

fun &lt;[Data](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](create.md)&gt; [Pager.Loader.Companion](-pager/-loader/-companion/index.md).[create](create.md)(source: [PagedDataSource](-paged-data-source/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;): [Pager.Loader](-pager/-loader/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;

Creates a [Pager.Loader](-pager/-loader/index.md) instance with the underlying [source](create.md).

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Data](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](create.md)&gt; [Pager.Loader.Companion](-pager/-loader/-companion/index.md).[create](create.md)(vararg sources: [PagedDataSource](-paged-data-source/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;, format: StringFormat = Json.Default): [Pager.Loader](-pager/-loader/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Data](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](create.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](create.md)&gt; [Pager.Loader.Companion](-pager/-loader/-companion/index.md).[create](create.md)(sources: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[PagedDataSource](-paged-data-source/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;&gt;, format: StringFormat = Json.Default): [Pager.Loader](-pager/-loader/index.md)&lt;[Data](create.md), [Filters](create.md), [Item](create.md)&gt;

Creates a [Pager.Loader](-pager/-loader/index.md) instance using a [CombinedPagedDataSource](-combined-paged-data-source/index.md) wrapping the provided [sources](create.md).
