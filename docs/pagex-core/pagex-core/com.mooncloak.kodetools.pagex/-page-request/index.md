//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PageRequest](index.md)

# PageRequest

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

@Serializable

data class [PageRequest](index.md)&lt;[Data](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [Filter](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Represents a request to a paginated data source.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [count](count.md) | [common]<br>@SerialName(value = &quot;count&quot;)<br>val [count](count.md): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)<br>The amount of items requested to be loaded. |
| [cursor](cursor.md) | [common]<br>@SerialName(value = &quot;cursor&quot;)<br>val [cursor](cursor.md): [Cursor](../-cursor/index.md)? = null<br>The [Cursor](../-cursor/index.md) provided to the request. |
| [data](data.md) | [common]<br>@SerialName(value = &quot;data&quot;)<br>val [data](data.md): [Data](index.md)? = null<br>The [Data](index.md) value provided to the page request. This may not be relevant to the request and therefore may be `null`. |
| [direction](direction.md) | [common]<br>@SerialName(value = &quot;direction&quot;)<br>val [direction](direction.md): [Direction](../-direction/index.md)<br>The [Direction](../-direction/index.md) requested relative to the [cursor](cursor.md). |
| [filters](filters.md) | [common]<br>@SerialName(value = &quot;filters&quot;)<br>val [filters](filters.md): [Filter](index.md)? = null<br>A model that filters the results of the pagination request. |
| [sort](sort.md) | [common]<br>@SerialName(value = &quot;sort&quot;)<br>val [sort](sort.md): [SortOptions](../-sort-options/index.md)? = null<br>The [SortOptions](../-sort-options/index.md) defining the order of the results of the pagination request. |
