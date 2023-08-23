package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.FragmentPlanenBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel


class PlanenFragment: Fragment() {

    private lateinit var binding: FragmentPlanenBinding

    private val viewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_planen,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTourPlanen.setOnClickListener {
            val navController: NavController = binding.frameLayout.findNavController()
            navController.navigate(PlanenFragmentDirections.actionPlanenFragmentToPlDetailFragment())
        }
    }

}