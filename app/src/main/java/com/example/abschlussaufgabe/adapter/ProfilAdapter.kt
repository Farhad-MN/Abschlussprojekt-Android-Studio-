package com.example.abschlussaufgabe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.abschlussaufgabe.data.model.Picture
import com.example.abschlussaufgabe.databinding.ListItemPictureBinding

class ProfilAdapter(


    private val dataset: List<Picture>,



    ) : RecyclerView.Adapter<ProfilAdapter.ItemViewHolder> (){


    class ItemViewHolder(val binding: ListItemPictureBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ListItemPictureBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val data = dataset[position]
        val imageUri = data.defaultImage!!.smallURL.toUri().buildUpon().scheme("https").build()
        holder.binding.ivProfil.load(imageUri)
        holder.binding.tvTitel.text = data.otherName.firstOrNull().toString()
        holder.binding.tvOrder.text = data.scientificName.firstOrNull().toString()


    }
}