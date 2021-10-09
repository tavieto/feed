package com.br.usemobile.feed.presentation.feed

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.br.usemobile.feed.common.PostList
import com.br.usemobile.feed.common.fromJson
import com.br.usemobile.feed.domain.Post
import com.br.usemobile.feed.common.loadImage
import com.br.usemobile.feed.common.toJson
import com.br.usemobile.feed.databinding.FragmentFeedBinding
import com.br.usemobile.feed.domain.Comment
import com.br.usemobile.feed.domain.Like
import com.br.usemobile.feed.presentation.MainViewModel
import com.br.usemobile.feed.presentation.post.PostActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class FeedFragment : Fragment() {

    private lateinit var binding: FragmentFeedBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private lateinit var viewModel: FeedViewModel
    private val feelAdapter: FeedAdapter by lazy {
        FeedAdapter()
    }

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
        feelAdapter.setList(PostList.list)

        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("posts")

        myRef.setValue(PostList.list.toJson())

        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.getValue<String>()
                value?.let {

                        feelAdapter.setList(it.fromJson<List<Post>>())

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d("FeedFragment", "Failed to read value.", error.toException())
            }

        })

        binding.edtCreatePost.setOnClickListener {
            val intent = Intent(requireActivity(), PostActivity::class.java)
            startActivity(intent)
        }

    }

}