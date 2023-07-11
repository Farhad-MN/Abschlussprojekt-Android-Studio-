package com.example.abschlussaufgabe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.databinding.FragmentProfilBinding

class ProfilFragment: Fragment() {

    private lateinit var binding: FragmentProfilBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profil,container,false)
        return binding.root
    }
}