package com.example.abschlussaufgabe.Adapter

import android.content.Context
import android.content.res.Resources
import android.icu.util.ULocale.Category
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.ItemCateoriesBinding


class SportAdapter(
    private val context: Context,
    private val dataset: List<Category>
) : RecyclerView.Adapter<SportAdapter.ItemViewHolder> (){

    inner class ItemViewHolder(val binding: ItemCateoriesBinding) : RecyclerView.ViewHolder(binding.root){
    val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val ivName: ImageView = itemView.findViewById(R.id.iv_Sport)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemCateoriesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val category = dataset[position]




    }


}


