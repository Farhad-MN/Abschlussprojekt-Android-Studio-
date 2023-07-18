package com.example.abschlussaufgabe.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.databinding.ItemEinstellungBinding

class EinstellungAdapter (
    private val context: Context,
    private val dataset: MutableList<Int>
) : RecyclerView.Adapter<EinstellungAdapter.ItemviewHolder>(){

    class ItemviewHolder(val binding: ItemEinstellungBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
        val binding = ItemEinstellungBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemviewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {

        val setting = dataset[position]
        holder.binding.tvName.text = context.resources.getString(setting)
    }


}