package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.FragmentRegisMediBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class RegisMediFragment:Fragment() {

    private lateinit var binding: FragmentRegisMediBinding

    private val mainViewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_regis_medi,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.mediaCardGoogle.setOnClickListener {
            val navController = binding.mediaLayout.findNavController()
            navController.navigate(RegisMediFragmentDirections.actionRegisMediFragmentToHomeFragment())
        }

        binding.mediaCardFacebook.setOnClickListener {
            val navController = binding.mediaLayout.findNavController()
            navController.navigate(RegisMediFragmentDirections.actionRegisMediFragmentToHomeFragment())
        }

        binding.mediaCardInstagram.setOnClickListener {
            val navController = binding.mediaLayout.findNavController()
            navController.navigate(RegisMediFragmentDirections.actionRegisMediFragmentToHomeFragment())
        }
    }
}