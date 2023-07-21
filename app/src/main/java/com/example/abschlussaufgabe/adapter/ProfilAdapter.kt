package com.example.abschlussaufgabe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.databinding.ItemHomeBinding

class ProfilAdapter (
    private val dataset: MutableList<Int>
) : RecyclerView.Adapter<ProfilAdapter.ItemViewHolder> (){



    class ItemViewHolder(val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val profilImage = dataset[position]
        holder.binding
    }
}