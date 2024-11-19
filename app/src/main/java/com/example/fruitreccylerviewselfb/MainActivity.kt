package com.example.fruitreccylerviewselfb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Sample data: List of fruits with their names and drawable resource IDs

        val fruitList = listOf(
            Fruit("Apple", R.drawable.apple),
            Fruit("Banana", R.drawable.banana),
            Fruit("Cherry", R.drawable.cherry),
            Fruit("Date", R.drawable.date),
            Fruit("Grapes", R.drawable.grapes),
            Fruit("Apple", R.drawable.apple),
            Fruit("Banana", R.drawable.banana),
            Fruit("Cherry", R.drawable.cherry),
            Fruit("Date", R.drawable.date),
            Fruit("Grapes", R.drawable.grapes),
            Fruit("Apple", R.drawable.apple),
            Fruit("Banana", R.drawable.banana),
            Fruit("Cherry", R.drawable.cherry),
            Fruit("Date", R.drawable.date),
            Fruit("Grapes", R.drawable.grapes),
            Fruit("Apple", R.drawable.apple),
            Fruit("Banana", R.drawable.banana),
            Fruit("Cherry", R.drawable.cherry),
            Fruit("Date", R.drawable.date),
            Fruit("Grapes", R.drawable.grapes)

        )

        //Get RecyclerView from the layout
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        //set up the recyclerView layout manager (vertical list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Set up the adapter with the fruit list
        val adapter = FruitAdapter(fruitList)

        recyclerView.adapter = adapter
    }
}