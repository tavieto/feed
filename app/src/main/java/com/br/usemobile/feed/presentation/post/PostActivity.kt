package com.br.usemobile.feed.presentation.post

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsControllerCompat
import com.br.usemobile.feed.common.loadImage
import com.br.usemobile.feed.databinding.ActivityPostBinding
import com.br.usemobile.feed.presentation.MainActivity

class PostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupStatusBar()
        binding.imgUser.loadImage(binding.root)
    }

    private fun setupStatusBar() {
        val winController = WindowInsetsControllerCompat(window, binding.root)
        winController.isAppearanceLightStatusBars = true
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = ""
        }

        binding.toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}