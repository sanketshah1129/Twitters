package com.sanket.twitters

data class Entities(
    val hashtags: List<Hashtag>,
    val symbols: List<Any>,
    val urls: List<Url>,
    val user_mentions: List<Any>
)