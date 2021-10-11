package com.br.usemobile.feed.common

import com.br.usemobile.feed.domain.Comment
import com.br.usemobile.feed.domain.Like
import com.br.usemobile.feed.domain.Post

fun List<HashMap<String, Post>>.toListPost(): List<Post> {
    val currentList = this
    val newList: MutableList<Post> = mutableListOf()

    if (currentList.isNotEmpty()) {
        currentList.forEach { item ->

            newList.add(
                Post(
                    item["userId"].toString(),
                    item["userName"].toString(),
                    item["userImagePath"].toString(),
                    item["dateCreate"].toString(),
                    item["body"].toString(),
                    if (item["likes"] != null) {
                        (item["likes"] as List<HashMap<String, Like>>).toListLike()
                    } else {
                        listOf()
                    },
                    if (item["comments"] != null) {
                        (item["comments"] as List<HashMap<String, Comment>>).toListComment()
                    } else {
                        listOf()
                    }

                )
            )
        }
    }

    return newList
}

fun List<HashMap<String, Like>>.toListLike(): List<Like> {
    val currentList = this
    val newList: MutableList<Like> = mutableListOf()

    if (currentList != null) {
        currentList.forEach { item ->
            newList.add(
                Like(
                    item["idUser"].toString()
                )
            )
        }
    }
    return newList
}

fun List<HashMap<String, Comment>>.toListComment(): List<Comment> {
    val currentList = this
    val newList: MutableList<Comment> = mutableListOf()

    if (currentList != null) {
        currentList.forEach { item ->
            newList.add(
                Comment(
                    item["userName"].toString(),
                    item["userImagePath"].toString(),
                    item["dateCreate"].toString(),
                    item["body"].toString()
                )
            )
        }
    }

    return newList
}