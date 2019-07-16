package com.example.retrofitusingadapter

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface apiterface {
    @GET("posts")
    fun getPosts(): Call<List<User>>
}