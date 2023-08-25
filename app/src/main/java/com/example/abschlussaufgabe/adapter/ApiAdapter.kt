package com.example.abschlussaufgabe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.abschlussaufgabe.data.model.Pictures
import com.example.abschlussaufgabe.databinding.ItemAufzeichnenBinding

class ApiAdapter(
    private val dataset: List<Pictures>
): RecyclerView.Adapter<ApiAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ItemAufzeichnenBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiAdapter.ItemViewHolder {
        val binding = ItemAufzeichnenBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ApiAdapter.ItemViewHolder, position: Int) {

        val item = dataset[position]

        val imageUri = item.defaultImage!!.mediumURL.toUri().buildUpon().scheme("https").build()
        holder.binding.ivNatur.load(imageUri)

        holder.binding.tvName.text = item.scientificName.firstOrNull().toString()

        if (item.otherName.size != 0 ){
            holder.binding.tvTittel.text = item.otherName.firstOrNull().toString()
        }
        holder.binding.ivNatur.load(imageUri)


    }
    override fun getItemCount(): Int {
        return dataset.size
    }


}