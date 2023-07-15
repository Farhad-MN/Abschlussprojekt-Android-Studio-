package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.FragmentLoginBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class LoginFragment:Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnAnmelden.setOnClickListener {
            val navController = binding.frameLayout.findNavController()
            navController.navigate(LoginFragmentDirections.actionLoginFragment2ToHomeFragment())
        }

        binding.btnRegister.setOnClickListener {
            val navController = binding.frameLayout.findNavController()
            navController.navigate(LoginFragmentDirections.actionLoginFragment2ToRegistrierungFragment2())
        }

        binding.tvMedienAccount.setOnClickListener {
            val navController = binding.frameLayout.findNavController()
            navController.navigate(LoginFragmentDirections.actionLoginFragment2ToRegisMediFragment())
        }
    }

}