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
import com.example.abschlussaufgabe.databinding.FragmentEditBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel

class EditFragment : Fragment() {

    private lateinit var binding: FragmentEditBinding

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvVorname.setText(vorname)
        binding.tvNachname.setText(nachname)
        binding.tvAdresse.setText(adresse)
        binding.tvEmail.setText(emailAdresse)
        binding.tvNumber.setText(phonenummber)
        binding.tvPassword.setText(passWord)


        binding.btnSpeichern.setOnClickListener {
            val navController = binding.profilBearbeiten.findNavController()
            navController.navigate(EditFragmentDirections.actionEditFragmentToProfilFragment())
        }




    }
}