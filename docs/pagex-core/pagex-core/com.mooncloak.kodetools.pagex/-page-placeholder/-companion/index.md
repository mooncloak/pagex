//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[PagePlaceholder](../index.md)/[Companion](index.md)

# Companion

[common]\
object [Companion](index.md)

## Functions

| Name | Summary |
|---|---|
| [invoke](../../invoke.md) | [common]<br>@[ExperimentalPaginationAPI](../../-experimental-pagination-a-p-i/index.md)<br>inline operator fun &lt;[Item](../../invoke.md)&gt; [PagePlaceholder.Companion](index.md).[invoke](../../invoke.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = Uuid.random().toHexString(), pageCursor: [Cursor](../../-cursor/index.md)? = null, noinline getter: suspend () -&gt; [ResolvedPage](../../-resolved-page/index.md)&lt;[Item](../../invoke.md)&gt;): [DefaultPagePlaceholder](../../-default-page-placeholder/index.md)&lt;[Item](../../invoke.md)&gt;<br>Creates a default [PagePlaceholder](../index.md) instance wrapping the provided [getter](../../invoke.md) value. |
