package com.example.projetoitau.services.retrofitmodules

import com.example.projetoitau.services.webservices.Requisition
import com.example.projetoitau.services.webservices.TheHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

val retrofitModules = module{
    single{
        Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(TheHttpClient.theHttpClient())
            .build()
            .create(Requisition::class.java)
    }
}