package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.abschlussaufgabe.adapter.AppartmentAdapter
import com.example.abschlussaufgabe.databinding.FragmentAppartmentBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class AppartmentFragment : Fragment(

) {

    // Benutzen das passende binding zum Fragment.
    private lateinit var binding: FragmentAppartmentBinding

    private val viewModel: MainViewModel by activityViewModels()



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



        viewModel.appartmentsLiveData.observe(viewLifecycleOwner){
            binding.rvAppertment.adapter = AppartmentAdapter(it,viewModel)
        }



    }
    override fun onStart() {
        super.onStart()
        viewModel.loadFromDatabase()
    }
}