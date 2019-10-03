package com.sanket.twitters

import com.sanket.wallpaper.RetrofitService
import com.twitter.sdk.android.core.TwitterApiClient
import com.twitter.sdk.android.core.TwitterSession

class MyTwitterAPIClient(session: TwitterSession) : TwitterApiClient()
{
    fun getService() : TwitterAPI
    {
        val twitterAPI : TwitterAPI = RetrofitService.createService(TwitterAPI::class.java)
        return twitterAPI
    }
}