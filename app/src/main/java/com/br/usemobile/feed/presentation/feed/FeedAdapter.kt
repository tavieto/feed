package com.br.usemobile.feed.presentation.feed

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.usemobile.feed.R
import com.br.usemobile.feed.domain.Post
import com.br.usemobile.feed.common.loadImage
import com.br.usemobile.feed.databinding.ItemFeedBinding

class FeedAdapter : RecyclerView.Adapter<FeedAdapter.PostViewHolder>() {

    private var postList: List<Post> = emptyList()

    inner class PostViewHolder(private val binding: ItemFeedBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Post) {
            binding.run {
                txtUserName.text = item.userName
                txtDate.text = item.dateCreate
                imgUser.loadImage(binding.root, item.userImagePath)
                if (item.likes.size > 0) {
                    imgLike.setBackgroundResource(R.drawable.ic_like_red)
                }
                txtPost.text = item.body
                txtLikesNumber.text = item.likes.size.toString()
                txtCommentsNumber.text = item.comments.size.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = ItemFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val element = postList[position]
        holder.bind(element)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Post>) {
        postList = list
        notifyDataSetChanged()
    }

}