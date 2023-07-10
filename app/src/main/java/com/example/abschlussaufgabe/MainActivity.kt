package com.example.abschlussaufgabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import androidx.navigation.findNavController
import com.example.abschlussaufgabe.ui.HomeFragment
import com.example.abschlussaufgabe.ui.PlanenFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {

    //lateinit var bottomNav:BottomNavigationItemView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



}



/* val navController = findNavController(R.id.navHost)
        findViewById<BottomNavigationItemView>(R.id.bottomNav)
            .setupWithNavController(navController)*/




/*private fun loadFragment(fragment:Fragment){
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(com.google.android.material.R.id.container,fragment)
    transaction.commit()

}*/