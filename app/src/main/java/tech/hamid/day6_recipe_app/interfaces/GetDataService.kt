package tech.hamid.day6_recipe_app.interfaces

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import tech.hamid.day6_recipe_app.entities.Category
import tech.hamid.day6_recipe_app.entities.Meal
import tech.hamid.day6_recipe_app.entities.MealResponse

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}