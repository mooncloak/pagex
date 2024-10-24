//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[pagePlaceholder](page-placeholder.md)

# pagePlaceholder

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](page-placeholder.md)&gt; [PageLoadResult.Companion](-page-load-result/-companion/index.md).[pagePlaceholder](page-placeholder.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](-cursor/index.md)? = null, noinline getter: suspend () -&gt; [ResolvedPage](-resolved-page/index.md)&lt;[Item](page-placeholder.md)&gt;): [DefaultPagePlaceholder](-default-page-placeholder/index.md)&lt;[Item](page-placeholder.md)&gt;

A convenience function for creating a [DefaultPagePlaceholder](-default-page-placeholder/index.md) instance.
