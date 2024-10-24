//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[PageCollectionSerializer](index.md)

# PageCollectionSerializer

[common]\
@[ExperimentalPaginationAPI](../-experimental-pagination-a-p-i/index.md)

class [PageCollectionSerializer](index.md)&lt;[Item](index.md)&gt;(itemSerializer: KSerializer&lt;[Item](index.md)&gt;) : KSerializer&lt;[PageCollection](../-page-collection/index.md)&lt;[Item](index.md)&gt;&gt;

## Constructors

| | |
|---|---|
| [PageCollectionSerializer](-page-collection-serializer.md) | [common]<br>constructor(itemSerializer: KSerializer&lt;[Item](index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [PageCollection](../-page-collection/index.md)&lt;[Item](index.md)&gt; |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [PageCollection](../-page-collection/index.md)&lt;[Item](index.md)&gt;) |
