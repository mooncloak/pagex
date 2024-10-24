//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[Cursor](index.md)

# Cursor

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)

@Serializable

value class [Cursor](index.md)(val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Represents a generic pointer to a page or an item in a paginated list. This serves as a reference to an item, so that subsequent requests can load items before or after that item.

## Constructors

| | |
|---|---|
| [Cursor](-cursor.md) | [common]<br>constructor(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The cursor [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value. This is an opaque [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value from the perspective of the client, as it doesn't have to construct an instance of one, only use it as a reference. |

## Functions

| Name | Summary |
|---|---|
| [decode](../decode.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun &lt;[DecodedCursor](../decode.md)&gt; [Cursor](index.md).[decode](../decode.md)(format: BinaryFormat, deserializer: DeserializationStrategy&lt;[DecodedCursor](../decode.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](../decode.md)<br>Decodes this [Cursor](index.md) into the [DecodedCursor](../decode.md) type using the provided Binary [format](../decode.md) and Base64 URL decoding, or throws an exception if this [Cursor](index.md) does not represent the [DecodedCursor](../decode.md) value.<br>[common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun &lt;[DecodedCursor](../decode.md)&gt; [Cursor](index.md).[decode](../decode.md)(format: StringFormat = Json.Default, deserializer: DeserializationStrategy&lt;[DecodedCursor](../decode.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](../decode.md)<br>Decodes this [Cursor](index.md) into the [DecodedCursor](../decode.md) type using the provided String [format](../decode.md) and Base64 URL decoding, or throws an exception if this [Cursor](index.md) does not represent the [DecodedCursor](../decode.md) value. |
| [decodeOrNull](../decode-or-null.md) | [common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun &lt;[DecodedCursor](../decode-or-null.md)&gt; [Cursor](index.md).[decodeOrNull](../decode-or-null.md)(format: BinaryFormat, deserializer: DeserializationStrategy&lt;[DecodedCursor](../decode-or-null.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](../decode-or-null.md)?<br>Decodes this [Cursor](index.md) into the [DecodedCursor](../decode-or-null.md) type using the provided Binary [format](../decode-or-null.md) and Base64 URL decoding, or returns `null` if this [Cursor](index.md) does not represent the [DecodedCursor](../decode-or-null.md) value.<br>[common]<br>@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)<br>inline fun &lt;[DecodedCursor](../decode-or-null.md)&gt; [Cursor](index.md).[decodeOrNull](../decode-or-null.md)(format: StringFormat = Json.Default, deserializer: DeserializationStrategy&lt;[DecodedCursor](../decode-or-null.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](../decode-or-null.md)?<br>Decodes this [Cursor](index.md) into the [DecodedCursor](../decode-or-null.md) type using the provided String [format](../decode-or-null.md) and Base64 URL decoding, or returns `null` if this [Cursor](index.md) does not represent the [DecodedCursor](../decode-or-null.md) value. |
