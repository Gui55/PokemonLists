package com.example.projetoitau.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.projetoitau.R
import com.example.projetoitau.services.repository.repoModules
import com.example.projetoitau.services.retrofitmodules.retrofitModules
import com.example.projetoitau.viewmodel.MainViewModel
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicialização do Koin
        startKoin{
            modules(listOf(retrofitModules, repoModules))
        }

        //Inicialização da ViewModel desta Activity
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //Requisitar os resultados da paginação
        viewModel.requestPageResult()

        //Iniciar as observações
        observations()
    }

    private fun observations() {

    }
}