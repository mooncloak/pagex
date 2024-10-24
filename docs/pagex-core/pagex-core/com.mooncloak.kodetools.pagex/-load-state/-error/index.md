//[pagex-core](../../../../index.md)/[com.mooncloak.kodetools.pagex](../../index.md)/[LoadState](../index.md)/[Error](index.md)

# Error

data class [Error](index.md)(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [LoadState](../index.md)

Loading hit an error.

#### Parameters

common

| | |
|---|---|
| cause | [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) that caused the load operation to generate this error state. |

## Constructors

| | |
|---|---|
| [Error](-error.md) | [common]<br>constructor(cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [cause](cause.md) | [common]<br>val [cause](cause.md): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [endOfPaginationReached](end-of-pagination-reached.md) | [common]<br>open override val [endOfPaginationReached](end-of-pagination-reached.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>`false` if there is more data to load, `true` otherwise. This parameter informs [Pager](../../-pager/index.md) if it should continue to make requests for additional data in this direction or if it should halt as the end of the dataset has been reached. |
