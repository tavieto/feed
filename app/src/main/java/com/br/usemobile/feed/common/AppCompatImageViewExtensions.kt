package com.br.usemobile.feed.common

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.br.usemobile.feed.R
import com.bumptech.glide.Glide

fun AppCompatImageView.loadImage(container: View, uri: String = "https://media-exp1.licdn.com/dms/image/C5603AQG6Wp_dttcFSg/profile-displayphoto-shrink_800_800/0/1580260962373?e=1639612800&v=beta&t=FJyUvZ6ddBB4EGLGSNS6pgk-rob1YCixFy2aRNi6liA") {
    Glide
        .with(container)
        .load(uri)
        .centerCrop()
        .circleCrop()
        .placeholder(R.drawable.user_image)
        .into(this)
}