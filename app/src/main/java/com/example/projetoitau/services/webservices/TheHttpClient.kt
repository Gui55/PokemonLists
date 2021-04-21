package com.example.projetoitau.services.webservices

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class TheHttpClient {

    companion object{
        fun theHttpClient(): OkHttpClient {

            var logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            return OkHttpClient.Builder().addInterceptor(logging).build()

        }
    }

}