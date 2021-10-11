package com.br.usemobile.feed.presentation.feed

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.br.usemobile.feed.common.*
import com.br.usemobile.feed.domain.Post
import com.br.usemobile.feed.databinding.FragmentFeedBinding
import com.br.usemobile.feed.presentation.MainViewModel
import com.br.usemobile.feed.presentation.post.PostActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.HashMap

class FeedFragment : Fragment() {

    private lateinit var binding: FragmentFeedBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private lateinit var feedViewModel: FeedViewModel
    private val feelAdapter: FeedAdapter by lazy {
        FeedAdapter()
    }
    private var totalPost = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentFeedBinding.inflate(inflater, container, false).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel.setToolbarTitle("Feed")

        binding.imgUser.loadImage(binding.root)
        binding.feed.adapter = feelAdapter


        binding.edtCreatePost.setOnClickListener {
            val intent = Intent(requireActivity(), PostActivity::class.java)
            startActivity(intent)
        }

        firebase()
    }

    private fun firebase() {
        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("posts")

        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.value as List<HashMap<String, Post>>
                val listPost = value.toListPost()

                feelAdapter.setList(listPost)

                sharedPref(listPost.size.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d("FeedFragment", "Failed to read value.", error.toException())
            }

        })
    }

    fun sharedPref(value: String) {
        val shared = activity?.getSharedPreferences(Const.SHARED_PREFERENCE, Context.MODE_PRIVATE)
        with(shared?.edit()) {
            this?.putString(Const.TOTAL_POSTS, value)
            this?.commit()
        }
    }

}