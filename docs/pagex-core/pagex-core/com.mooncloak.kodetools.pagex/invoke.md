//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[invoke](invoke.md)

# invoke

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline operator fun &lt;[Item](invoke.md)&gt; [ResolvedPage.Companion](-resolved-page/-companion/index.md).[invoke](invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pageCursor: [Cursor](-cursor/index.md)? = null, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](invoke.md)&gt; = emptyList(), info: [PageInfo](-page-info/index.md) = PageInfo()): [DefaultResolvedPage](-default-resolved-page/index.md)&lt;[Item](invoke.md)&gt;

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline operator fun &lt;[Request](invoke.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filter](invoke.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Item](invoke.md)&gt; [ResolvedPage.Companion](-resolved-page/-companion/index.md).[invoke](invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pageCursor: [Cursor](-cursor/index.md)? = null, items: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Item](invoke.md)&gt; = emptyList(), info: [PageInfo](-page-info/index.md) = PageInfo(), original: [PageRequest](-page-request/index.md)&lt;[Request](invoke.md), [Filter](invoke.md)&gt;? = null, actual: [PageRequest](-page-request/index.md)&lt;[Request](invoke.md), [Filter](invoke.md)&gt;? = original): [DefaultResolvedPageWithRequestData](-default-resolved-page-with-request-data/index.md)&lt;[Request](invoke.md), [Filter](invoke.md), [Item](invoke.md)&gt;

Creates a default [ResolvedPage](-resolved-page/index.md) instance wrapping the provided values.

#### See also

| |
|---|
| [ResolvedPage](-resolved-page/index.md) |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline operator fun &lt;[Item](invoke.md)&gt; [PageCollection.Companion](-page-collection/-companion/index.md).[invoke](invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](-cursor/index.md), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](-resolved-page/index.md)&lt;[Item](invoke.md)&gt;&gt; = emptyList()): [DefaultPageCollection](-default-page-collection/index.md)&lt;[Item](invoke.md)&gt;

Creates a default [PageCollection](-page-collection/index.md) instance wrapping the provided [pages](invoke.md).

#### See also

| |
|---|
| [PageCollection](-page-collection/index.md) |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline operator fun &lt;[Item](invoke.md)&gt; [PagePlaceholder.Companion](-page-placeholder/-companion/index.md).[invoke](invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](-cursor/index.md)? = null, noinline getter: suspend () -&gt; [ResolvedPage](-resolved-page/index.md)&lt;[Item](invoke.md)&gt;): [DefaultPagePlaceholder](-default-page-placeholder/index.md)&lt;[Item](invoke.md)&gt;

Creates a default [PagePlaceholder](-page-placeholder/index.md) instance wrapping the provided [getter](invoke.md) value.

#### See also

| |
|---|
| [PagePlaceholder](-page-placeholder/index.md) |
