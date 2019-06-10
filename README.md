# KotlinEbcdic
Kotlin utility functions to convert ASCII to EBCDIC and vice versa

For the unfortunate ones who in the world of wonders still have to deal with EBCDIC. 

The library exposes two extension functions.
`String.toEbcdic(): ByteArray` to convert String to EBCDIC representation as ByteArray.
`ByteArray.ebcdicToAcii(): String` to convert ByteArray EBCDIC to ASCII String representation.

The work is still not done, since the library focueses only on printable chars.
Will fix that in the future if anybody needs this, I don't at the moment.

Cheers!
