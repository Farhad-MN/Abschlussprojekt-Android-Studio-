package com.example.abschlussaufgabe

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //lateinit var bottomNav:BottomNavigationItemView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

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