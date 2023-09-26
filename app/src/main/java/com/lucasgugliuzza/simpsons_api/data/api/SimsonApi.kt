package com.lucasgugliuzza.simpsons_api.data.api

import com.lucasgugliuzza.simpsons_api.data.dto.CharactersResponse
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface SimsonApi {

    companion object{
        val instance = Retrofit.Builder().baseUrl("https://apisimpsons.fly.dev/api/")
            .addConverterFactory(MoshiConverterFactory.create()).client(
                OkHttpClient.Builder().build()).build().create(SimsonApi::class.java)

    }

    @GET("personajes")
    suspend fun getCharacters() : CharactersResponse



    @GET("personajes/")
    suspend fun getAllCharacters(@Query("limit") limit:Int ) : CharactersResponse

}