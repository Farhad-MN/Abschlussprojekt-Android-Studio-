package com.example.abschlussaufgabe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.databinding.ItemCateoriesBinding
import com.example.abschlussaufgabe.ui.CategoriesFragmentDirections

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

        val item = dataset[position]

        holder.binding.tvName.text= item.name
        //holder.binding.ivSport.load(item.image)


        holder.binding.categoryCard.setOnClickListener {
            holder.binding.categoryCard.findNavController().navigate(R.id.action_categoriesFragment_to_detailFragment)

        }





    }
}