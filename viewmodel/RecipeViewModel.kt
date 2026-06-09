package com.example.brewmix.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.brewmix.model.Recipe
import com.example.brewmix.repository.RecipeRepository

class RecipeViewModel : ViewModel() {
    private val repository = RecipeRepository()

    private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes: LiveData<List<Recipe>> get() = _recipes

    init {
        loadRecipes()
    }

    private fun loadRecipes() {
        _recipes.value = repository.getRecipes()
    }
}