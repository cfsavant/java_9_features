# Heap Pollution
As a result of mixing raw and parameterized type, unwise casting, and separate compilation.
Note, that heap pollution does not necessarily occur, even if the compiler issues an unchecked warning

## heap pollution occurs in three situations
    mixing raw types and parameterized types
    performing unchecked casts
    separate compilation of translation units
    With the exception of separate compilation, the compiler will always issue an unchecked warning to draw your attention to the potential heap pollution. If you co-compile your code without warnings then no heap pollution can ever occur.

## References
http://www.angelikalanger.com/GenericsFAQ/FAQSections/TechnicalDetails.html#Topic2
