package com.example.projetoitau.services.repository

import androidx.lifecycle.MutableLiveData
import com.example.projetoitau.services.model.PokemonPageResult
import com.example.projetoitau.services.webservices.Requisition
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepository : KoinComponent{

    val requisition: Requisition by inject()

    fun getPokemonPageResult() : MutableLiveData<PokemonPageResult>{

        var results = MutableLiveData<PokemonPageResult>()

        requisition.getResults().enqueue(object: Callback<PokemonPageResult>{
            override fun onResponse(
                call: Call<PokemonPageResult>,
                response: Response<PokemonPageResult>
            ) {
                results.value = response.body()
            }

            override fun onFailure(call: Call<PokemonPageResult>, t: Throwable) {

            }

        })

        return results
    }

}