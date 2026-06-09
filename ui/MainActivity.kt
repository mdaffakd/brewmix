package com.example.brewmix.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.brewmix.R
import com.example.brewmix.adapter.RecipeAdapter
import com.example.brewmix.viewmodel.RecipeViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: RecipeViewModel by viewModels()
    private lateinit var adapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
        observeViewModel()
    }

    private fun setupRecyclerView() {
        val rvRecipes = findViewById<RecyclerView>(R.id.rvRecipes)
        adapter = RecipeAdapter()
        rvRecipes.layoutManager = LinearLayoutManager(this)
        rvRecipes.adapter = adapter
    }

    private fun observeViewModel() {
        viewModel.recipes.observe(this) { recipes ->
            if (recipes != null) {
                adapter.setData(recipes)
            }
        }
    }
}