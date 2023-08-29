package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.abschlussaufgabe.adapter.AppartmentAdapter
import com.example.abschlussaufgabe.databinding.FragmentAppartmentBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class AppartmentFragment : Fragment() {

    private lateinit var binding: FragmentAppartmentBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentAppartmentBinding.inflate(layoutInflater)
        binding.root

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.appertment.observe(this){
            binding.rvAppertment.adapter = AppartmentAdapter(it)
        }

        // Lade die Appartments aus der Datenbank
        viewModel.loadFromDatabase()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAppartmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.appertment.observe(viewLifecycleOwner){
            binding.rvAppertment.adapter = AppartmentAdapter(it)
        }





    }
}