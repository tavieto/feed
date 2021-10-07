package com.br.usemobile.feed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.br.usemobile.feed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.feedFragment -> {
                    bottomNavigationNavigate(R.id.feedFragment)
                    true
                }
                R.id.postFragment -> {
                    bottomNavigationNavigate(R.id.postFragment)
                    true
                }
                R.id.profileFragment -> {
                    bottomNavigationNavigate(R.id.profileFragment)
                    true
                }
                else -> { false }
            }
        }
    }

    private fun bottomNavigationNavigate(fragmentId: Int) {
        this.findNavController(R.id.fragment_container).navigate(fragmentId)
    }


}