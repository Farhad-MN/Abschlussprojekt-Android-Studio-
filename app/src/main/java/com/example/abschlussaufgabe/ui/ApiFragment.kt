package com.example.abschlussaufgabe.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.abschlussaufgabe.adapter.ApiAdapter
import com.example.abschlussaufgabe.databinding.FragmentAufzeichnenBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class ApiFragment: Fragment() {

    private lateinit var binding: FragmentAufzeichnenBinding

    private val viewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAufzeichnenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.pictures.observe(viewLifecycleOwner) {pictures ->
            binding.rvPictures.adapter = ApiAdapter(pictures,viewModel)


        }





    }
}