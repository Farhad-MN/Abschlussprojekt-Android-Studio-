package com.example.abschlussaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.adapter.CategoryAdapter
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.databinding.FragmentCategoriesBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel


class CategoriesFragment : Fragment() {

    private lateinit var binding: FragmentCategoriesBinding

    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mainViewModel.categories.observe(viewLifecycleOwner) {
            binding.rvSport.adapter = CategoryAdapter(requireContext(),it)
        }


    }
}