package com.example.projetoitau.services.model

data class Pokemon(var name: String, var id: Int, var shots: ArrayList<String>, var hp: Int,
                    var attack: Int, var defense: Int, var specialAttack: Int, var specialDefense: Int,
                    var speed: Int, var habilities: ArrayList<String>, var type: String)