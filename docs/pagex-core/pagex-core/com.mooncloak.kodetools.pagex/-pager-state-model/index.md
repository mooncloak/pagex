//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PagerStateModel](index.md)

# PagerStateModel

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

data class [PagerStateModel](index.md)&lt;[Item](index.md)&gt;(val pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Page](../-page/index.md)&lt;[Item](index.md)&gt;&gt; = emptyList(), val prepend: [LoadState](../-load-state/index.md) = LoadState.Incomplete, val append: [LoadState](../-load-state/index.md) = LoadState.Incomplete, val refresh: [LoadState](../-load-state/index.md) = LoadState.Incomplete)

## Constructors

| | |
|---|---|
| [PagerStateModel](-pager-state-model.md) | [common]<br>constructor(pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Page](../-page/index.md)&lt;[Item](index.md)&gt;&gt; = emptyList(), prepend: [LoadState](../-load-state/index.md) = LoadState.Incomplete, append: [LoadState](../-load-state/index.md) = LoadState.Incomplete, refresh: [LoadState](../-load-state/index.md) = LoadState.Incomplete) |

## Properties

| Name | Summary |
|---|---|
| [append](append.md) | [common]<br>val [append](append.md): [LoadState](../-load-state/index.md) |
| [pages](pages.md) | [common]<br>val [pages](pages.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Page](../-page/index.md)&lt;[Item](index.md)&gt;&gt; |
| [prepend](prepend.md) | [common]<br>val [prepend](prepend.md): [LoadState](../-load-state/index.md) |
| [refresh](refresh.md) | [common]<br>val [refresh](refresh.md): [LoadState](../-load-state/index.md) |
