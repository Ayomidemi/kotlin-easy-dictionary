package com.example.easydictionary

data class WordResult(
    val word: String,
    val phonetic: String?,
    val meanings: List<Meaning>,
    val license: License2,
    val sourceUrls: List<String>,
)

data class Phonetic(
    val audio: String,
    val sourceUrl: String?,
    val license: License?,
    val text: String?,
)

data class License(
    val name: String,
    val url: String,
)

data class Meaning(
    val partOfSpeech: String,
    val definitions: List<Definition>,
    val synonyms: List<String>,
    val antonyms: List<String>,
)

data class Definition(
    val definition: String,
    val synonyms: List<Any?>,
    val antonyms: List<Any?>,
    val example: String?,
)

data class License2(
    val name: String,
    val url: String,
)
