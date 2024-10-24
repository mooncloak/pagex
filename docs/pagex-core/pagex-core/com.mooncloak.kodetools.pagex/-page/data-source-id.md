//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[Page](index.md)/[dataSourceId](data-source-id.md)

# dataSourceId

[common]\
abstract val [dataSourceId](data-source-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

A unique identifier value for the data source. This value is especially important when you have numerous data sources that are being merged into a single source (ex: using [PageCollection](../-page-collection/index.md)), as it provides a way to load the next page of data from the appropriate data source.
