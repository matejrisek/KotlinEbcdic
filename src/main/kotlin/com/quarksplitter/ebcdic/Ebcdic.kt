package com.quarksplitter.ebcdic

import java.lang.StringBuilder

fun String.toEbcdic(): ByteArray {
    val resultByteArray = ByteArray(this.length)
    var index = 0
    this.chars().forEach {
        resultByteArray[index++] = mapAsciiToEbcdic[it.toChar()]
            ?: error("Cannot find EBCDIC mapping for ASCII code (dec) $it")
    }
    return resultByteArray
}

fun ByteArray.ebcdicToAcii(): String {
    val resultStringBuilder = StringBuilder(this.size)
    this.forEach {
        resultStringBuilder.append(mapEbcdicToAscii[it])
    }
    return resultStringBuilder.toString()
}