//[pagex-core](../../index.md)/[com.mooncloak.kodetools.pagex](index.md)/[encode](encode.md)

# encode

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](encode.md)&gt; [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](-resolved-page/index.md)&lt;[Item](encode.md)&gt;&gt;, format: StringFormat = Json.Default, serializer: SerializationStrategy&lt;[CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md)&gt; = format.serializersModule.serializer()): [Cursor](-cursor/index.md)

Encodes the provided values as a [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) model in its encoded form, using the provided [format](encode.md).

#### Return

A [Cursor](-cursor/index.md) with the provided values encoded.

#### Parameters

common

| | |
|---|---|
| pages | The [ResolvedPage](-resolved-page/index.md)s returned by the [PagedDataSource](-paged-data-source/index.md)s. |
| format | The StringFormat used to encode the constructed [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) model into a [Cursor](-cursor/index.md) instance. |

#### See also

| |
|---|
| [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) |
| [encode](encode.md) |
| [CombinedPagedDataSource](-combined-paged-data-source/index.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[Item](encode.md)&gt; [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(pages: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ResolvedPage](-resolved-page/index.md)&lt;[Item](encode.md)&gt;&gt;, format: BinaryFormat, serializer: SerializationStrategy&lt;[CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md)&gt; = format.serializersModule.serializer()): [Cursor](-cursor/index.md)

Encodes the provided values as a [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) model in its encoded form, using the provided [format](encode.md).

#### Return

A [Cursor](-cursor/index.md) with the provided values encoded.

#### Parameters

common

| | |
|---|---|
| pages | The [ResolvedPage](-resolved-page/index.md)s returned by the [PagedDataSource](-paged-data-source/index.md)s. |
| format | The BinaryFormat used to encode the constructed [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) model into a [Cursor](-cursor/index.md) instance. |

#### See also

| |
|---|
| [CombinedDecodedPageCursor](-combined-decoded-page-cursor/index.md) |
| [encode](encode.md) |
| [CombinedPagedDataSource](-combined-paged-data-source/index.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun &lt;[DecodedCursor](encode.md)&gt; [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(value: [DecodedCursor](encode.md), format: StringFormat = Json.Default, serializer: SerializationStrategy&lt;[DecodedCursor](encode.md)&gt; = format.serializersModule.serializer()): [Cursor](-cursor/index.md)

Encodes the provided [value](encode.md) into a [Cursor](-cursor/index.md) using the provided String [format](encode.md) and Base64 URL encoding, or throws an exception if the encoding failed.

#### Return

A [Cursor](-cursor/index.md) containing an encoded form of the [value](encode.md).

#### Parameters

common

| | |
|---|---|
| value | The value to encode to a [Cursor](-cursor/index.md). |
| format | The StringFormat used to convert the provided [value](encode.md) to a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html). |

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

inline fun &lt;[DecodedCursor](encode.md)&gt; [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(value: [DecodedCursor](encode.md), format: BinaryFormat, serializer: SerializationStrategy&lt;[DecodedCursor](encode.md)&gt; = format.serializersModule.serializer()): [Cursor](-cursor/index.md)

Encodes the provided [value](encode.md) into a [Cursor](-cursor/index.md) using the provided Binary [format](encode.md) and Base64 URL encoding, or throws an exception if the encoding failed.

#### Return

A [Cursor](-cursor/index.md) containing an encoded form of the [value](encode.md).

#### Parameters

common

| | |
|---|---|
| value | The value to encode to a [Cursor](-cursor/index.md). |
| format | The BinaryFormat used to convert the provided [value](encode.md) to a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html). |

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

inline fun [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(offset: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), count: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html) = PageRequest.DEFAULT_COUNT, format: StringFormat = Json.Default): [Cursor](-cursor/index.md)

Encodes the provided values as an [OffsetDecodedCursor](-offset-decoded-cursor/index.md) model in its encoded form, using the provided [format](encode.md).

#### Return

A [Cursor](-cursor/index.md) with the provided values encoded.

#### Parameters

common

| | |
|---|---|
| offset | The amount of items to offset when retrieving the page. |
| count | The amount of items to retrieve. |
| format | The StringFormat used to encode the constructed [OffsetDecodedCursor](-offset-decoded-cursor/index.md) model into a [Cursor](-cursor/index.md) instance. |

#### See also

| |
|---|
| [OffsetDecodedCursor](-offset-decoded-cursor/index.md) |
| [encode](encode.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |

[common]\

@[ExperimentalPaginationAPI](-experimental-pagination-a-p-i/index.md)

inline fun [Cursor.Companion](-cursor/-companion/index.md).[encode](encode.md)(offset: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html), count: [UInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html) = PageRequest.DEFAULT_COUNT, format: BinaryFormat): [Cursor](-cursor/index.md)

Encodes the provided values as an [OffsetDecodedCursor](-offset-decoded-cursor/index.md) model in its encoded form, using the provided [format](encode.md).

#### Return

A [Cursor](-cursor/index.md) with the provided values encoded.

#### Parameters

common

| | |
|---|---|
| offset | The amount of items to offset when retrieving the page. |
| count | The amount of items to retrieve. |
| format | The BinaryFormat used to encode the constructed [OffsetDecodedCursor](-offset-decoded-cursor/index.md) model into a [Cursor](-cursor/index.md) instance. |

#### See also

| |
|---|
| [OffsetDecodedCursor](-offset-decoded-cursor/index.md) |
| [encode](encode.md) |

#### Throws

| | |
|---|---|
| SerializationException | in case of any encoding-specific error. |
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the encoded input does not comply format's specification. |
