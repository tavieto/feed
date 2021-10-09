package com.br.usemobile.feed.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.findNavController
import com.br.usemobile.feed.R
import com.br.usemobile.feed.databinding.ActivityMainBinding
import com.br.usemobile.feed.presentation.post.PostActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
        configureStatusBar()
        setObserves()
    }

    private fun setObserves() {
        mainViewModel.toolbarTitle.observe(this, { title ->
            binding.titleToolbar.text = title
        })
    }

    private fun configureStatusBar() {
        val winController = WindowInsetsControllerCompat(window, binding.root)
        winController.isAppearanceLightStatusBars = true
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.feedFragment -> {
                    bottomNavigationNavigate(R.id.feedFragment)
                    true
                }
                R.id.postFragment -> {
                    val intent = Intent(this, PostActivity::class.java)
                    startActivity(intent)
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