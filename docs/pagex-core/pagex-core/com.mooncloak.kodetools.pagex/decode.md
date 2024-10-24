//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[decode](decode.md)

# decode

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[DecodedCursor](decode.md)&gt; [Cursor](-cursor/index.md).[decode](decode.md)(format: StringFormat = Json.Default, deserializer: DeserializationStrategy&lt;[DecodedCursor](decode.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](decode.md)

Decodes this [Cursor](-cursor/index.md) into the [DecodedCursor](decode.md) type using the provided String [format](decode.md) and Base64 URL decoding, or throws an exception if this [Cursor](-cursor/index.md) does not represent the [DecodedCursor](decode.md) value.

#### Return

The [DecodedCursor](decode.md) value.

#### Parameters

common

| | |
|---|---|
| format | The StringFormat used to convert this [Cursor](-cursor/index.md) to a [DecodedCursor](decode.md). |

#### See also

| |
|---|
| [Cursor](-cursor/index.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[DecodedCursor](decode.md)&gt; [Cursor](-cursor/index.md).[decode](decode.md)(format: BinaryFormat, deserializer: DeserializationStrategy&lt;[DecodedCursor](decode.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](decode.md)

Decodes this [Cursor](-cursor/index.md) into the [DecodedCursor](decode.md) type using the provided Binary [format](decode.md) and Base64 URL decoding, or throws an exception if this [Cursor](-cursor/index.md) does not represent the [DecodedCursor](decode.md) value.

#### Return

The [DecodedCursor](decode.md) value.

#### Parameters

common

| | |
|---|---|
| format | The BinaryFormat used to convert this [Cursor](-cursor/index.md) to a [DecodedCursor](decode.md). |

#### See also

| |
|---|
| [Cursor](-cursor/index.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |
