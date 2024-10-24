//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[CombinedPagedDataSource](index.md)/[CombinedPagedDataSource](-combined-paged-data-source.md)

# CombinedPagedDataSource

[common]\
constructor(sources: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[PagedDataSource](../-paged-data-source/index.md)&lt;[Data](index.md), [Filters](index.md), [Item](index.md)&gt;&gt;, sourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;Combined:&quot; + sources.joinToString(separator = &quot;:&quot;) { it.sourceId }, format: StringFormat = Json.Default)
