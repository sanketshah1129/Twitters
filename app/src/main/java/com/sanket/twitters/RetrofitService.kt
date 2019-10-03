package com.sanket.wallpaper

import com.sanket.twitters.Common.API_KEY
import com.sanket.twitters.Common.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


class RetrofitService
{
    companion object
    {
        var okHttpClient = OkHttpClient().newBuilder().addInterceptor(object : Interceptor {
            @Throws(IOException::class)
            override
            fun intercept(chain: Interceptor.Chain): okhttp3.Response
            {
                val originalRequest = chain.request()

                val builder = originalRequest.newBuilder()
                    .header("authorization","OAuth")
                    .header("oauth_consumer_key", API_KEY)
                    .header("oauth_nonce=", "application/json")
                    .header("oauth_signature", "")
                    .header("oauth_signature_method", "HMAC-SHA1")
                    .header("oauth_timestamp", "")
                    .header("oauth_token", "")
                    .header("oauth_version", "1.0")

                val newRequest = builder.build()
                return chain.proceed(newRequest)
            }
        }).build()

       // var httpClient : OkHttpClient = OkHttpClient.Builder().addInterceptor(()).build()

        val retrofit : Retrofit = Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()

        fun <S> createService(serviceClass :Class<S>): S
        {
            return retrofit.create(serviceClass)
        }
    }

}
