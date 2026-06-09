package com.example.brewmix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.brewmix.R
import com.example.brewmix.model.Recipe

class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    private val recipeList = mutableListOf<Recipe>()

    fun setData(newList: List<Recipe>) {
        recipeList.clear()
        recipeList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipeList[position]
        holder.tvTitle.text = recipe.title
        holder.tvDose.text = recipe.dose
        holder.tvIngredients.text = "Bahan: ${recipe.ingredients}"
        holder.tvMethod.text = "Cara: ${recipe.method}"
    }

    override fun getItemCount(): Int = recipeList.size

    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDose: TextView = itemView.findViewById(R.id.tvDose)
        val tvIngredients: TextView = itemView.findViewById(R.id.tvIngredients)
        val tvMethod: TextView = itemView.findViewById(R.id.tvMethod)
    }
}
