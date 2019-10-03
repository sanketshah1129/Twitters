package com.sanket.twitters

import android.app.Application
import android.content.res.Resources
import com.twitter.sdk.android.core.Twitter
import com.twitter.sdk.android.core.TwitterCore
import com.twitter.sdk.android.core.TwitterApiClient
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import com.twitter.sdk.android.core.TwitterAuthConfig
import com.twitter.sdk.android.core.DefaultLogger
import com.twitter.sdk.android.core.TwitterConfig
import android.util.Log


class MyApplication : Application()
{
    override fun onCreate() {
        super.onCreate()

       /* val config = TwitterConfig.Builder(this)
            .logger(DefaultLogger(Log.DEBUG))
            .twitterAuthConfig(TwitterAuthConfig(resources.getString(R.string.CONSUMER_KEY), resources.getString(R.string.CONSUMER_SECRET)))
            .debug(true)
            .build()
        Twitter.initialize(config)


        val activeSession = TwitterCore.getInstance()
            .sessionManager.activeSession

        // example of custom OkHttpClient with logging HttpLoggingInterceptor
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)
        val customClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor).build()

        // pass custom OkHttpClient into TwitterApiClient and add to TwitterCore
        val customApiClient: TwitterApiClient
        if (activeSession != null) {
            customApiClient = TwitterApiClient(activeSession, customClient)
            TwitterCore.getInstance().addApiClient(activeSession, customApiClient)
        } else {
            customApiClient = TwitterApiClient(customClient)
            TwitterCore.getInstance().addGuestApiClient(customApiClient)
        }*/
    }
}