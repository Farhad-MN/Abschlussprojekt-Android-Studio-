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
import com.example.abschlussaufgabe.databinding.FragmentRegistrierungBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

    var vorname =""
    var nachname = ""
    var adresse = ""
    var emailAdresse = ""
    var phonenummber = ""
    var passWord = ""

class RegistrierungFragment:Fragment() {

    private lateinit var binding: FragmentRegistrierungBinding

    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_registrierung,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnKonterstellen.setOnClickListener {
            vorname = binding.editTextVorname.text.toString()
            nachname = binding. editTextNachname.text.toString()
            adresse = binding.editTextTextPostalAddress2.text.toString()
            emailAdresse = binding.editTextTextEmailAddress.text.toString()
            phonenummber = binding.editTextPhone.text.toString()
            passWord = binding.editTextTextPassword.toString()

            val navController = binding.frameLayout2.findNavController()
            navController.navigate(RegistrierungFragmentDirections.actionRegistrierungFragment2ToHomeFragment())
        }
    }
}