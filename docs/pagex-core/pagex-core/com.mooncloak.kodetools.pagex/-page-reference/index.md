//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PageReference](index.md)

# PageReference

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

@Serializable

data class [PageReference](index.md)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val info: [PageInfo](../-page-info/index.md))

## Constructors

| | |
|---|---|
| [PageReference](-page-reference.md) | [common]<br>constructor(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), dataSourceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, info: [PageInfo](../-page-info/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [dataSourceId](data-source-id.md) | [common]<br>@SerialName(value = &quot;source_id&quot;)<br>val [dataSourceId](data-source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.md) | [common]<br>@SerialName(value = &quot;id&quot;)<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [info](info.md) | [common]<br>@SerialName(value = &quot;info&quot;)<br>val [info](info.md): [PageInfo](../-page-info/index.md) |
