package com.example.fruitreccylerviewselfb

import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitList: List<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    //ViewHolder to hold refernces to each item view

    class FruitViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val fruitImageView: ImageView = view.findViewById(R.id.fruitImageView)
        val fruitNameTextView: TextView = view.findViewById(R.id.fruitNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fruit, parent, false)
        return FruitViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitNameTextView.text = fruit.fruitName
        //Set the image resource from drawable using imageResId
        holder.fruitImageView.setImageResource(fruit.imageResourceID)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

}
