package tech.hamid.day6_recipe_app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import tech.hamid.day6_recipe_app.dao.RecipeDao
import tech.hamid.day6_recipe_app.entities.Category
import tech.hamid.day6_recipe_app.entities.CategoryItems
import tech.hamid.day6_recipe_app.entities.Recipes

@Database(entities = [Recipes::class, CategoryItems::class, Category::class], version = 1, exportSchema = false)
abstract class RecipeDatabase: RoomDatabase(){
    companion object {
        var recipeDatabase: RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if(recipeDatabase != null) {
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }
    abstract fun recipedao(): RecipeDao
}