package tech.hamid.day6_recipe_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import tech.hamid.day6_recipe_app.adapter.MainCategoryAdapter
import tech.hamid.day6_recipe_app.adapter.SubCategoryAdapter
import tech.hamid.day6_recipe_app.entities.Recipes

class HomeActivity : AppCompatActivity() {

    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        arrMainCategory.add(Recipes(1, "Beef"))
        arrMainCategory.add(Recipes(2, "Chicken"))
        arrMainCategory.add(Recipes(3, "Fish"))
        arrMainCategory.add(Recipes(4, "Lamb"))
        arrMainCategory.add(Recipes(5, "Egg"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Dry Beef Fry"))
        arrSubCategory.add(Recipes(2, "Chicken curry"))
        arrSubCategory.add(Recipes(3, "Fish fry"))
        arrSubCategory.add(Recipes(4, "Lamb stew"))
        arrSubCategory.add(Recipes(5, "Boiled egg with sprinkled spices"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter = subCategoryAdapter




    }
}