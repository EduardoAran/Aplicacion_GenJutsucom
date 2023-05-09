package com.example.genjutsucom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.genjutsucom.databinding.ActivityLobbyBinding

class LobbyActivity : AppCompatActivity() {

    lateinit var binding: ActivityLobbyBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLobbyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var packagename = applicationContext.packageName

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.menu_catalogue -> {
                    navController.navigate(R.id.AFragment)
                    true
                }
                //R.id.menu_quizzes -> {
                //    navController.navigate(R.id.quizFragment)
                //    true
                //}
            else -> {false}
            }
        }
    }
}