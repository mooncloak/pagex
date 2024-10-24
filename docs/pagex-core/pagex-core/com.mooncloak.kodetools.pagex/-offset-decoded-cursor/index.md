//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[OffsetDecodedCursor](index.md)

# OffsetDecodedCursor

[common]\
@Serializable

@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

data class [OffsetDecodedCursor](index.md)(val offset: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), val count: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html))

A model that can be encoded as a [Cursor](../-cursor/index.md) for offset pagination.

## Constructors

| | |
|---|---|
| [OffsetDecodedCursor](-offset-decoded-cursor.md) | [common]<br>constructor(offset: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), count: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [count](count.md) | [common]<br>@SerialName(value = &quot;count&quot;)<br>val [count](count.md): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)<br>The amount of items to retrieve. |
| [offset](offset.md) | [common]<br>@SerialName(value = &quot;offset&quot;)<br>val [offset](offset.md): [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)<br>The amount of items to offset when retrieving the page. |
