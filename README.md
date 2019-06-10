# KotlinEbcdic

Kotlin utility functions to convert ASCII to EBCDIC and vice versa

For the unfortunate ones who in the world of wonders still have to deal with EBCDIC. 

### The library exposes two extension functions:

`String.toEbcdic(): ByteArray` to convert String to EBCDIC representation as ByteArray.

`ByteArray.ebcdicToAcii(): String` to convert ByteArray EBCDIC to ASCII String representation.

### Disclaimer

The work is still not done, since the library focuses only on printable chars.

Will add special/non printable chars in the future if anybody needs them, I don't at the moment.

Cheers!
