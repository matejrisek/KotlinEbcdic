package com.quarksplitter.ebcdic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class EbcdicTest {

    @Test
    fun `Convert ASCII string "test" to EBCDIC and back to string`() {
        assertThat("test".toEbcdic().ebcdicToAcii()).isEqualTo("test")
    }

    @Test
    fun `Convert all EBCDIC values`() {
        val givenValue = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.<(+&!\$*);¬-/|,%_>?:#@'=\"~`{}\\"
        Assertions.assertTrue(givenValue.toEbcdic().ebcdicToAcii() == givenValue)
    }

    @Test
    fun `Convert EBCDIC to ASCII`() {
        val givenByteArray = byteArrayOf(0xF7.toByte(), 0xF1.toByte(), 0xC5.toByte(), 0xF9.toByte()
            , 0xF9.toByte(), 0xF0.toByte(), 0xF0.toByte(), 0xF1.toByte())
        assertThat(givenByteArray.ebcdicToAcii()).isEqualTo("71E99001")
    }

}