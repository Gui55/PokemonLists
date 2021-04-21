package com.example.projetoitau.services.repository

import org.koin.dsl.module

val repoModules = module {
    single { PokemonRepository() }
}