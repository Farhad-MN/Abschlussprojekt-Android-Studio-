package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.adapter.ProfilAdapter
import com.example.abschlussaufgabe.databinding.FragmentProfilBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class ProfilFragment: Fragment() {

    private lateinit var binding: FragmentProfilBinding

    private val viewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profil,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.savedPictures.observe(viewLifecycleOwner){
            binding.rvPictures.adapter = ProfilAdapter(it)
        }
        binding.fabMenu.setOnClickListener {

            val navController = binding.navigationView.findNavController()
            binding.navigationView.setupWithNavController(navController)

            binding.drawer.open()


        }



    }



}