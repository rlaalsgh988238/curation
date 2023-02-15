package com.example.curation

fun main() {
    println('가'.toInt())

}

private fun isEnglish(ch: Char) : Boolean = ch in 'A'..'Z'
private fun isKorean(ch: Char) : Boolean = ch in 'ㄱ'..'ㅣ' || ch in '가'..'힣'
private fun isNumber(ch: Char) : Boolean = ch in '0'..'9'
private fun isSpecial(ch: Char) : Boolean = ch in '!'..'/' || ch in ':'..'@' || ch in '['..'`' || ch in '{'..'~'
