//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[PageCollection](../index.md)/[Companion](index.md)

# Companion

[common]\
object [Companion](index.md)

## Functions

| Name | Summary |
|---|---|
| [invoke](../../invoke.md) | [common]<br>@[ExperimentalPaginationAPI](../../-experimental-pagination-a-p-i/index.md)<br>inline operator fun &lt;[Item](../../invoke.md)&gt; [PageCollection.Companion](index.md).[invoke](../../invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](../../-cursor/index.md), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](../../-resolved-page/index.md)&lt;[Item](../../invoke.md)&gt;&gt; = emptyList()): [DefaultPageCollection](../../-default-page-collection/index.md)&lt;[Item](../../invoke.md)&gt;<br>Creates a default [PageCollection](../index.md) instance wrapping the provided [pages](../../invoke.md). |
