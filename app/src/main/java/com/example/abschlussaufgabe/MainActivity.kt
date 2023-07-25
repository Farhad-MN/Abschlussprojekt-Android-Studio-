package com.example.abschlussaufgabe


import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.abschlussaufgabe.databinding.ActivityMainBinding
import com.example.abschlussaufgabe.viewmodel.MainViewModel
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)







        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id)as NavHostFragment
        navController = navHostFragment.navController

        val bottomNav = binding.bottomNavigationBar
        setupWithNavController(bottomNav,navController)




        viewModel.loading.observe(this) {
            if (it) {
                binding.spinner.visibility = View.VISIBLE
            } else {
                binding.spinner.visibility = View.GONE
            }
        }


    }





}








/*private fun loadFragment(fragment:Fragment){
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(com.google.android.material.R.id.container,fragment)
    transaction.commit()

}*/