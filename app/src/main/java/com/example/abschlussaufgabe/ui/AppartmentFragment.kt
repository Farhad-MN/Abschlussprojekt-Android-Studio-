package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.abschlussaufgabe.adapter.AppartmentAdapter
import com.example.abschlussaufgabe.databinding.FragmentAppartmentBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class AppartmentFragment : Fragment(

) {

    // Benutzen das passende binding zum Fragment.
    private lateinit var binding: FragmentAppartmentBinding

    private val viewModel: MainViewModel by activityViewModels()

    private var id: Long = 0
    private var name: Int = 0
    private var imageId:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            id = it.getLong("id")
        }
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



        viewModel.appartmentsLiveData.observe(viewLifecycleOwner){
            binding.rvAppertment.adapter = AppartmentAdapter(it,viewModel)
        }

        binding.btnBack.setOnClickListener {
            binding.btnBack.findNavController()
                .navigate(AppartmentFragmentDirections.actionAppartmentFragmentToDetailFragment(id,name, imageId))
        }



    }
    override fun onStart() {
        super.onStart()
        viewModel.loadFromDatabase()
    }
}