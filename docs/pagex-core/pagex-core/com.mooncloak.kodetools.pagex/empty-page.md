//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[emptyPage](empty-page.md)

# emptyPage

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](empty-page.md)&gt; [PageLoadResult.Companion](-page-load-result/-companion/index.md).[emptyPage](empty-page.md)(dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pageCursor: [Cursor](-cursor/index.md)? = null, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;EmptyPage&quot;, info: [PageInfo](-page-info/index.md) = PageInfo()): [DefaultResolvedPage](-default-resolved-page/index.md)&lt;[Item](empty-page.md)&gt;

A convenience function for creating an empty [DefaultResolvedPage](-default-resolved-page/index.md) instance.
