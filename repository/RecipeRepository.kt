package com.example.brewmix.repository

import com.example.brewmix.model.Recipe

class RecipeRepository {
    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                title = "Espresso Sunrise (Orange Juice)",
                dose = "Dosis: 18g kopi",
                ingredients = "Double shot espresso, 120ml jus jeruk segar, Es batu",
                method = "Tuang jus jeruk dan es batu ke dalam gelas. Ekstrak espresso langsung di atasnya agar membentuk layer yang cantik."
            ),
            Recipe(
                title = "Yakult Coffee Splash",
                dose = "Dosis: 18g kopi",
                ingredients = "Single shot espresso, 1 botol Yakult, Sedikit air dingin",
                method = "Campurkan Yakult dan air dingin dengan es batu. Tambahkan single shot espresso perlahan. Rasanya asam, manis, dan segar."
            ),
            Recipe(
                title = "Classic Hi-Intense Espresso",
                dose = "Dosis: 18g kopi",
                ingredients = "Biji kopi *medium-dark roast*",
                method = "Lakukan pre-brew selama 3 detik. Ekstrak selama 25-30 detik untuk mendapatkan crema yang tebal."
            )
        )
    }
}