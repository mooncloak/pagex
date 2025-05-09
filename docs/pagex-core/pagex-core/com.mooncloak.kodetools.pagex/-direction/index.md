//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[Direction](index.md)

# Direction

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

@Serializable

enum [Direction](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Direction](index.md)&gt; 

Represents the direction to paginate information relative to a [Cursor](../-cursor/index.md) from a data source.

## Entries

| | |
|---|---|
| [Before](-before/index.md) | [common]<br>@SerialName(value = &quot;before&quot;)<br>[Before](-before/index.md)<br>Paginate before a provided [Cursor](../-cursor/index.md). |
| [After](-after/index.md) | [common]<br>@SerialName(value = &quot;after&quot;)<br>[After](-after/index.md)<br>Paginate after a provided [Cursor](../-cursor/index.md). |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [common]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[Direction](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](../-load-type/-append/index.md#-372974862%2FProperties%2F-172958691) | [common]<br>val [name](../-load-type/-append/index.md#-372974862%2FProperties%2F-172958691): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-load-type/-append/index.md#-739389684%2FProperties%2F-172958691) | [common]<br>val [ordinal](../-load-type/-append/index.md#-739389684%2FProperties%2F-172958691): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [serialName](serial-name.md) | [common]<br>val [serialName](serial-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [common]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Direction](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [common]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Direction](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
