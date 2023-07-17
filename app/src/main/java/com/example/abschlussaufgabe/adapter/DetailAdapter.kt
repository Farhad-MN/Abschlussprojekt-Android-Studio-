package com.example.abschlussaufgabe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.databinding.ItemCateoriesBinding

class DetailAdapter(
    private val context: Context,
    private val dataset: List<Category>
) : RecyclerView.Adapter<DetailAdapter.ItemviewHolder>() {


    class ItemviewHolder(val binding: ItemCateoriesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
        val binding = ItemCateoriesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemviewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {

        val router = dataset[position]




    }


}