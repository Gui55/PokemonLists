package com.example.projetoitau.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projetoitau.services.model.PokemonPageResult
import com.example.projetoitau.services.repository.PokemonRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent{

    val repository : PokemonRepository by inject()

    var mutablePageResults = MutableLiveData<PokemonPageResult>()
    var pageResults : LiveData<PokemonPageResult> = mutablePageResults

    fun requestPageResult(){
        mutablePageResults = repository.getPokemonPageResult()
    }
}