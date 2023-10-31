package example.com.quotesapps.utils

import example.com.quotesapps.models.QuotesModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("quotes")
    // function that return a List of QuotesModel Object
    fun getRandomQuotes(): Call<List<QuotesModel>>
}