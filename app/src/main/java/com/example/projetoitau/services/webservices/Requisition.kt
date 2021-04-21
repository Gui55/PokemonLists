package com.example.projetoitau.services.webservices

import com.example.projetoitau.services.model.PokemonPageResult
import retrofit2.Call
import retrofit2.http.GET

interface Requisition {

    @GET("pokemon")
    fun getResults() : Call<PokemonPageResult>

}