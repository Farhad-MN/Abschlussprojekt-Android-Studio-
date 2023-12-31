package com.example.abschlussaufgabe.adapter


import android.content.Context
import android.content.Intent
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

        val settinges = dataset[position]
        holder.binding.tvName.text = context.resources.getString(settinges)

        holder.binding.btnIndex.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Momentan ist in bearbeitung!!!")
            intent.type = "text/plain"
            val shareIntent = Intent.createChooser(intent, null)

            context.startActivity(shareIntent)
        }
    }


}