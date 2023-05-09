package com.example.genjutsucom

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiInterface {
    //@Headers("Content-Type: application/json")
    @POST("usuario")
    fun addUser(@Body usuario: Usuario): Call<Usuario>

    @POST("login")
    fun login(@Body usuario: Usuario): Call<Usuario>

    @POST("score")
    fun addScore(@Body actividad: LeaderBoard): Call<LeaderBoard>
}