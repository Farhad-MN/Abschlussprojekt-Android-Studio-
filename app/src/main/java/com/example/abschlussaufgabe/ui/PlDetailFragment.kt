package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.FragmentPlDetailBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class PlDetailFragment : Fragment() {

    private lateinit var binding: FragmentPlDetailBinding

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pl_detail, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val spinner1: Spinner = binding.spinnerActivity
        ArrayAdapter.createFromResource(
            this.requireContext(),
            R.array.sport_catecory,
            android.R.layout.simple_spinner_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            spinner1.adapter = arrayAdapter
        }

        val spinner2: Spinner = binding.spinnerFitness
        ArrayAdapter.createFromResource(
            this.requireContext(),
            R.array.fitness_level,
            android.R.layout.simple_spinner_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            spinner2.adapter = arrayAdapter
        }


        binding.btnSpeicher.setOnClickListener {
            val navController: NavController = binding.planenlayout.findNavController()
            navController.navigate(PlDetailFragmentDirections.actionPlDetailFragmentToPlanenFragment())
        }

    }
}