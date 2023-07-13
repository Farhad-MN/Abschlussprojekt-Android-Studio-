package com.example.abschlussaufgabe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.databinding.ItemCateoriesBinding

class CategoryAdapter (
    private val context: Context,
    private val dataset: List<Category>
) : RecyclerView.Adapter<CategoryAdapter.ItemViewHolder> (){

    class ItemViewHolder(val binding: ItemCateoriesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ItemViewHolder {
        val binding = ItemCateoriesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder:ItemViewHolder, position: Int) {

        val category = dataset[position]

        holder.binding.tvName.text=context.resources.getString(category.name)
        holder.binding.ivSport.setImageResource(category.imageId)
    }
}