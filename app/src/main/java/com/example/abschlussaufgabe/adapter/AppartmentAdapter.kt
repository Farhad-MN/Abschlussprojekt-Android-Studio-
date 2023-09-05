package com.example.abschlussaufgabe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.data.db.AppartmentData
import com.example.abschlussaufgabe.databinding.ListItemAppartmentBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class AppartmentAdapter(
    private val items: List<AppartmentData>,
    private val viewModel: MainViewModel
): RecyclerView.Adapter<AppartmentAdapter.ItemViewHolder>() {


    // Den ViewHolder der den RecyclerView und die Anzeige verbindet
    class ItemViewHolder(val binding: ListItemAppartmentBinding) : RecyclerView.ViewHolder(binding.root)


    //Lifecycle Methode, wird aufgerufen, wenn der ViewHolder erstellt wird
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding=
            ListItemAppartmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    //Lifecycle Methode, wird aufgerufen, wenn der ViewHolder mit der Anzeige verbunden wird
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = items[position]
        val binding = holder.binding

        holder.binding.txtTitle.text = data.title
        holder.binding.txtAddress.text = data.addresse
        holder.binding.txtSleepRooms.text = data.sleeproom.toString()
        holder.binding.txtSize.text = data.size.toString()
        holder.binding.txtPersons.text = data.personas.toString()
        holder.binding.txtPricePerNight.text = data.pricePenNight.toString()
        holder.binding.imgAppartmentView.setImageResource(data.image)


        holder.binding.btnSave1.setOnClickListener {
            viewModel.insertItem(data)
        }

        holder.binding.btnDelet1.setOnClickListener {
            viewModel.deleteItem(data)
        }



    }


    //Lifecycle Methode zum Abfragen der Anzahl der Elemente
    //@return Anzahl der Elemente
    override fun getItemCount(): Int {
        return items.size
    }


}