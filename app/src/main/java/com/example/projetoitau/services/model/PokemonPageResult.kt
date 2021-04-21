package com.example.projetoitau.services.model

import com.google.gson.annotations.SerializedName

data class PokemonPageResult(
    @SerializedName("next")
    var next: String?,
    @SerializedName("previous")
    var previous: String?,
    @SerializedName("results")
    var results : ArrayList<SimplePokemonResult>
)