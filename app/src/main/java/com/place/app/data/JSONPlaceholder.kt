package com.place.app.data

import com.place.app.data.model.Location
import retrofit2.Call
import retrofit2.http.GET

interface JSONPlaceholder {
    /*
    Retrofit data annotation with our URL
    And our method that will return us the List of ContactList
    */
    @get:GET("places.json")
    val location: Call<List<Location?>?>?
}