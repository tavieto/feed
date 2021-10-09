package com.br.usemobile.feed.domain

data class Post(
    val userId: String,
    val userName: String,
    val userImagePath: String,
    val dateCreate: String,
    val body: String,
    val likes: List<Like>,
    val comments: List<Comment>
)