package com.sanket.twitters

data class Twitter(
    val search_metadata: SearchMetadata,
    val statuses: List<Statuse>
)