package com.example.abschlussaufgabe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.databinding.ItemDetailBinding

class DetailAdapter(
    private val dataset: MutableList<Int>
) : RecyclerView.Adapter<DetailAdapter.ItemviewHolder>() {


    class ItemviewHolder(val binding: ItemDetailBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
        val binding = ItemDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemviewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {


        val detailsImage = dataset[position]
        //holder.binding.tvDetail01.text = context.getString(detailsImage.name)
        //holder.binding.tvDetail02.text = context.getString(detailsImage.name)
        //holder.binding.tvDetail03.text = context.getString(detailsImage.name)
        holder.binding.ivRouter.setImageResource(detailsImage)



    }


}