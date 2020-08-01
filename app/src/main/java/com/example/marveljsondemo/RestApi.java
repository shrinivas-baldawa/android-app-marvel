package com.example.marveljsondemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi
{
    String BASE_URL = "https://gateway.marvel.com";
    @GET("/v1/public/characters")
    Call<List<Users>> getUsers(@Query(value="ts",encoded = false) Long timeStamp,
                               @Query(value="apikey",encoded = false) String publicKey,
                               @Query(value="hash",encoded = false) String hash);
}
