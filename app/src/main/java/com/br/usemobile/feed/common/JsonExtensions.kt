package com.br.usemobile.feed.common

import com.br.usemobile.feed.domain.Post
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

fun Any.toJson(): String = Gson().toJson(this)

fun <T> String.fromJson(): List<Post> {
    val type: Type = object : TypeToken<List<Post>>() {}.type
    return Gson().fromJson(this, type)
}