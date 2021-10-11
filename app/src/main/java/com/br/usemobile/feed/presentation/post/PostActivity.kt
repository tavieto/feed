package com.br.usemobile.feed.presentation.post

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsControllerCompat
import com.br.usemobile.feed.common.Const
import com.br.usemobile.feed.common.loadImage
import com.br.usemobile.feed.databinding.ActivityPostBinding
import com.br.usemobile.feed.domain.Comment
import com.br.usemobile.feed.domain.Like
import com.br.usemobile.feed.domain.Post
import com.br.usemobile.feed.presentation.MainActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.*

class PostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupStatusBar()
        binding.imgUser.loadImage(binding.root)
        binding.btnPost.setOnClickListener {
            Toast.makeText(this, binding.edtPost.text.toString(), Toast.LENGTH_SHORT).show()
        }
        database()
    }

    private fun database() {
        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("posts")
        val totalPost = sharedPref()

        binding.btnPost.setOnClickListener {
            binding.edtPost.text?.let { textPost ->
                myRef
                    .child(totalPost)
                    .setValue(
                        Post(
                            "1",
                            "Matheus Bissoli",
                            "https://media-exp1.licdn.com/dms/image/C5603AQG6Wp_dttcFSg/profile-displayphoto-shrink_800_800/0/1580260962373?e=1639612800&v=beta&t=FJyUvZ6ddBB4EGLGSNS6pgk-rob1YCixFy2aRNi6liA",
                            Date().time.toString(),
                            textPost.toString(),
                            listOf<Like>(),
                            listOf<Comment>()
                        )
                    )
            }

            navigateToFeed()
        }

    }

    private fun navigateToFeed() {
        Toast.makeText(this, "Publicado!", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun sharedPref(): String {
        val shared = getSharedPreferences(Const.SHARED_PREFERENCE, Context.MODE_PRIVATE)
        return shared?.getString(Const.TOTAL_POSTS, "") ?: ""
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