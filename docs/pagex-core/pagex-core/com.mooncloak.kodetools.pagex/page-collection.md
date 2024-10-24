//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[pageCollection](page-collection.md)

# pageCollection

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](page-collection.md)&gt; [PageLoadResult.Companion](-page-load-result/-companion/index.md).[pageCollection](page-collection.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](-cursor/index.md), pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](-resolved-page/index.md)&lt;[Item](page-collection.md)&gt;&gt; = emptyList(), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [DefaultPageCollection](-default-page-collection/index.md)&lt;[Item](page-collection.md)&gt;

A convenience function for creating a [DefaultPageCollection](-default-page-collection/index.md) instance.
