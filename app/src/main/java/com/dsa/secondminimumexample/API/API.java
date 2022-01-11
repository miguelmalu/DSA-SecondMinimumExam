package com.dsa.secondminimumexample.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {

    public static final String BASE_URL = "https://api.github.com/";

    @GET("users/{username}")
    Call<User> getInfoUser(@Path("username") String username);

    @GET("users/{username}/repos")
    Call<List<Repo>> getRepos(@Path("username") String username);
}
