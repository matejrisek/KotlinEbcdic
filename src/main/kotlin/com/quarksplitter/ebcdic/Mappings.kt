package com.quarksplitter.ebcdic

internal val mapAsciiToEbcdic = mapOf (
    'a' to 0x81.toByte(),
    'b' to 0x82.toByte(),
    'c' to 0x83.toByte(),
    'd' to 0x84.toByte(),
    'e' to 0x85.toByte(),
    'f' to 0x86.toByte(),
    'g' to 0x87.toByte(),
    'h' to 0x88.toByte(),
    'i' to 0x89.toByte(),
    'j' to 0x91.toByte(),
    'k' to 0x92.toByte(),
    'l' to 0x93.toByte(),
    'm' to 0x94.toByte(),
    'n' to 0x95.toByte(),
    'o' to 0x96.toByte(),
    'p' to 0x97.toByte(),
    'q' to 0x98.toByte(),
    'r' to 0x99.toByte(),
    's' to 0xA2.toByte(),
    't' to 0xA3.toByte(),
    'u' to 0xA4.toByte(),
    'v' to 0xA5.toByte(),
    'w' to 0xA6.toByte(),
    'x' to 0xA7.toByte(),
    'y' to 0xA8.toByte(),
    'z' to 0xA9.toByte(),
    'A' to 0xC1.toByte(),
    'B' to 0xC2.toByte(),
    'C' to 0xC3.toByte(),
    'D' to 0xC4.toByte(),
    'E' to 0xC5.toByte(),
    'F' to 0xC6.toByte(),
    'G' to 0xC7.toByte(),
    'H' to 0xC8.toByte(),
    'I' to 0xC9.toByte(),
    'J' to 0xD1.toByte(),
    'K' to 0xD2.toByte(),
    'L' to 0xD3.toByte(),
    'M' to 0xD4.toByte(),
    'N' to 0xD5.toByte(),
    'O' to 0xD6.toByte(),
    'P' to 0xD7.toByte(),
    'Q' to 0xD8.toByte(),
    'R' to 0xD9.toByte(),
    'S' to 0xE2.toByte(),
    'T' to 0xE3.toByte(),
    'U' to 0xE4.toByte(),
    'V' to 0xE5.toByte(),
    'W' to 0xE6.toByte(),
    'X' to 0xE7.toByte(),
    'Y' to 0xE8.toByte(),
    'Z' to 0xE9.toByte(),
    '0' to 0xF0.toByte(),
    '1' to 0xF1.toByte(),
    '2' to 0xF2.toByte(),
    '3' to 0xF3.toByte(),
    '4' to 0xF4.toByte(),
    '5' to 0xF5.toByte(),
    '6' to 0xF6.toByte(),
    '7' to 0xF7.toByte(),
    '8' to 0xF8.toByte(),
    '9' to 0xF9.toByte(),
    ' ' to 0x40.toByte(),
    '.' to 0x4B.toByte(),
    '<' to 0x4C.toByte(),
    '(' to 0x4D.toByte(),
    '+' to 0x4E.toByte(),
    '&' to 0x50.toByte(),
    '!' to 0x5A.toByte(),
    '$' to 0x5B.toByte(),
    '*' to 0x5C.toByte(),
    ')' to 0x5D.toByte(),
    ';' to 0x5E.toByte(),
    '¬' to 0x5F.toByte(),
    '-' to 0x60.toByte(),
    '/' to 0x61.toByte(),
    '|' to 0x6A.toByte(),
    ',' to 0x6B.toByte(),
    '%' to 0x6C.toByte(),
    '_' to 0x6D.toByte(),
    '>' to 0x6E.toByte(),
    '?' to 0x6F.toByte(),
    ':' to 0x7A.toByte(),
    '#' to 0x7B.toByte(),
    '@' to 0x7C.toByte(),
    '\'' to 0x7D.toByte(),
    '=' to 0x7E.toByte(),
    '"' to 0x7F.toByte(),
    '~'	to 0xA1.toByte(),
    '`' to 0xB9.toByte(),
    '{' to 0xC0.toByte(),
    '}' to 0xD0.toByte(),
    '\\' to 0xE0.toByte()
)

internal val mapEbcdicToAscii = mapOf (
    0x81.toByte() to 'a',
    0x82.toByte() to 'b',
    0x83.toByte() to 'c',
    0x84.toByte() to 'd',
    0x85.toByte() to 'e',
    0x86.toByte() to 'f',
    0x87.toByte() to 'g',
    0x88.toByte() to 'h',
    0x89.toByte() to 'i',
    0x91.toByte() to 'j',
    0x92.toByte() to 'k',
    0x93.toByte() to 'l',
    0x94.toByte() to 'm',
    0x95.toByte() to 'n',
    0x96.toByte() to 'o',
    0x97.toByte() to 'p',
    0x98.toByte() to 'q',
    0x99.toByte() to 'r',
    0xA2.toByte() to 's',
    0xA3.toByte() to 't',
    0xA4.toByte() to 'u',
    0xA5.toByte() to 'v',
    0xA6.toByte() to 'w',
    0xA7.toByte() to 'x',
    0xA8.toByte() to 'y',
    0xA9.toByte() to 'z',
    0xC1.toByte() to 'A',
    0xC2.toByte() to 'B',
    0xC3.toByte() to 'C',
    0xC4.toByte() to 'D',
    0xC5.toByte() to 'E',
    0xC6.toByte() to 'F',
    0xC7.toByte() to 'G',
    0xC8.toByte() to 'H',
    0xC9.toByte() to 'I',
    0xD1.toByte() to 'J',
    0xD2.toByte() to 'K',
    0xD3.toByte() to 'L',
    0xD4.toByte() to 'M',
    0xD5.toByte() to 'N',
    0xD6.toByte() to 'O',
    0xD7.toByte() to 'P',
    0xD8.toByte() to 'Q',
    0xD9.toByte() to 'R',
    0xE2.toByte() to 'S',
    0xE3.toByte() to 'T',
    0xE4.toByte() to 'U',
    0xE5.toByte() to 'V',
    0xE6.toByte() to 'W',
    0xE7.toByte() to 'X',
    0xE8.toByte() to 'Y',
    0xE9.toByte() to 'Z',
    0xF0.toByte() to '0',
    0xF1.toByte() to '1',
    0xF2.toByte() to '2',
    0xF3.toByte() to '3',
    0xF4.toByte() to '4',
    0xF5.toByte() to '5',
    0xF6.toByte() to '6',
    0xF7.toByte() to '7',
    0xF8.toByte() to '8',
    0xF9.toByte() to '9',
    0x40.toByte() to ' ',
    0x4B.toByte() to '.',
    0x4C.toByte() to '<',
    0x4D.toByte() to '(',
    0x4E.toByte() to '+',
    0x50.toByte() to '&',
    0x5A.toByte() to '!',
    0x5B.toByte() to '$',
    0x5C.toByte() to '*',
    0x5D.toByte() to ')',
    0x5E.toByte() to ';',
    0x5F.toByte() to '¬',
    0x60.toByte() to '-',
    0x61.toByte() to '/',
    0x6A.toByte() to '|',
    0x6B.toByte() to ',',
    0x6C.toByte() to '%',
    0x6D.toByte() to '_',
    0x6E.toByte() to '>',
    0x6F.toByte() to '?',
    0x7A.toByte() to ':',
    0x7B.toByte() to '#',
    0x7C.toByte() to '@',
    0x7D.toByte() to '\'',
    0x7E.toByte() to '=',
    0x7F.toByte() to '"',
    0xA1.toByte() to '~',
    0xB9.toByte() to '`',
    0xC0.toByte() to '{',
    0xD0.toByte() to '}',
    0xE0.toByte() to '\\'
)
