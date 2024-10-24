//[pagex-core](../../../index.md)/[com.mooncloak.kodetools.pagex](../index.md)/[Page](index.md)/[pageCursor](page-cursor.md)

# pageCursor

[common]\
abstract val [pageCursor](page-cursor.md): [Cursor](../-cursor/index.md)?

A [Cursor](../-cursor/index.md) which is an opaque [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value from the caller's perspective. From the implementor's perspective, this is a serialized object value containing data necessary for the (re-)loading of the page data. This value could be a serialized form of a [Cursor](../-cursor/index.md) and [Direction](../-direction/index.md), or contain more complex data, it is up to the implementation to decide what data to store.
