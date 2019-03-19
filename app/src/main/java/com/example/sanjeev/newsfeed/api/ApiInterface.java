package com.example.sanjeev.newsfeed.api;

import com.example.sanjeev.newsfeed.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(
         @Query("q") String keyWord,
         @Query("language") String language,
        @Query("sortBy") String sortBy,
         @Query("apiKey") String apiKey
    );
}
