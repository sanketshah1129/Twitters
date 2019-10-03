package com.sanket.twitters

data class Url(
    val display_url: String,
    val expanded_url: String,
    val indices: List<Int>,
    val url: String
)