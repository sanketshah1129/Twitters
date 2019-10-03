package com.sanket.twitters;

import com.twitter.sdk.android.core.models.Tweet;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface TwitterAPI {
    @GET("/1.1/search/tweets.json")
    Call<List<Tweet>> getTweets (@Query("q") String query, @Query("geocode") String geocode);
}
