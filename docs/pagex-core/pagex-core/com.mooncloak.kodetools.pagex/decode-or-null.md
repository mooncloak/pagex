//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[decodeOrNull](decode-or-null.md)

# decodeOrNull

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[DecodedCursor](decode-or-null.md)&gt; [Cursor](-cursor/index.md).[decodeOrNull](decode-or-null.md)(format: StringFormat = Json.Default, deserializer: DeserializationStrategy&lt;[DecodedCursor](decode-or-null.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](decode-or-null.md)?

Decodes this [Cursor](-cursor/index.md) into the [DecodedCursor](decode-or-null.md) type using the provided String [format](decode-or-null.md) and Base64 URL decoding, or returns `null` if this [Cursor](-cursor/index.md) does not represent the [DecodedCursor](decode-or-null.md) value.

#### Return

The [DecodedCursor](decode-or-null.md) value.

#### Parameters

common

| | |
|---|---|
| format | The StringFormat used to convert this [Cursor](-cursor/index.md) to a [DecodedCursor](decode-or-null.md). |

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

inline fun &lt;[DecodedCursor](decode-or-null.md)&gt; [Cursor](-cursor/index.md).[decodeOrNull](decode-or-null.md)(format: BinaryFormat, deserializer: DeserializationStrategy&lt;[DecodedCursor](decode-or-null.md)&gt; = format.serializersModule.serializer()): [DecodedCursor](decode-or-null.md)?

Decodes this [Cursor](-cursor/index.md) into the [DecodedCursor](decode-or-null.md) type using the provided Binary [format](decode-or-null.md) and Base64 URL decoding, or returns `null` if this [Cursor](-cursor/index.md) does not represent the [DecodedCursor](decode-or-null.md) value.

#### Return

The [DecodedCursor](decode-or-null.md) value.

#### Parameters

common

| | |
|---|---|
| format | The BinaryFormat used to convert this [Cursor](-cursor/index.md) to a [DecodedCursor](decode-or-null.md). |

#### See also

| |
|---|
| [Cursor](-cursor/index.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |
