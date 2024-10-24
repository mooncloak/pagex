//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[page](page.md)

# page

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](page.md)&gt; [PageLoadResult.Companion](-page-load-result/-companion/index.md).[page](page.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pageCursor: [Cursor](-cursor/index.md)? = null, info: [PageInfo](-page-info/index.md) = PageInfo(), items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](page.md)&gt; = emptyList()): [DefaultResolvedPage](-default-resolved-page/index.md)&lt;[Item](page.md)&gt;

A convenience function for creating a [DefaultResolvedPage](-default-resolved-page/index.md) instance.

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Data](page.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filters](page.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](page.md)&gt; [PageLoadResult.Companion](-page-load-result/-companion/index.md).[page](page.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pageCursor: [Cursor](-cursor/index.md)? = null, info: [PageInfo](-page-info/index.md) = PageInfo(), items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](page.md)&gt; = emptyList(), original: [PageRequest](-page-request/index.md)&lt;[Data](page.md), [Filters](page.md)&gt;, actual: [PageRequest](-page-request/index.md)&lt;[Data](page.md), [Filters](page.md)&gt; = original): [DefaultResolvedPageWithRequestData](-default-resolved-page-with-request-data/index.md)&lt;[Data](page.md), [Filters](page.md), [Item](page.md)&gt;

A convenience function for creating a [DefaultResolvedPageWithRequestData](-default-resolved-page-with-request-data/index.md) instance.
