package com.place.app.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroClient {
    /********
     * URLS
     */
    private const val ROOT_URL = "https://gist.githubusercontent.com/saravanabalagi/541a511eb71c366e0bf3eecbee2dab0a/raw/bb1529d2e5b71fd06760cb030d6e15d6d56c34b3/"

    /**
     * Get Retrofit Instance
     */
    private val retrofitInstance: Retrofit
        private get() = Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    /**
     * Get API Service
     *
     * @return API Service
     */
    val apiService: JSONPlaceholder
        get() = retrofitInstance.create(JSONPlaceholder::class.java)
}