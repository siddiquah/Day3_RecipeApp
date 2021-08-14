package tech.hamid.day6_recipe_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_main_category.view.*
import tech.hamid.day6_recipe_app.R
import tech.hamid.day6_recipe_app.entities.Recipes

class SubCategoryAdapter : RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    var arrSubCatagory = ArrayList<Recipes>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    fun setData(arrData : List<Recipes>) {
        arrSubCatagory = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainCategoryAdapter.RecipeViewHolder {
        return MainCategoryAdapter.RecipeViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_rv_sub_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainCategoryAdapter.RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arrSubCatagory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrSubCatagory.size
    }


}