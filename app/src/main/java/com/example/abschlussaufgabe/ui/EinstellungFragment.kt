package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.adapter.EinstellungAdapter
import com.example.abschlussaufgabe.databinding.FragmentEinstellugBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel


class EinstellungFragment: Fragment() {

    private lateinit var binding: FragmentEinstellugBinding

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_einstellug,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


            binding.rvEinstellung.adapter = EinstellungAdapter(requireContext(),viewModel.settingsListes)


    }
}