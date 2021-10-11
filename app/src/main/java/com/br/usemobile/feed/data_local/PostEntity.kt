package com.br.usemobile.feed.data_local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "feed")
data class PostEntity (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "id_post") val idPost: String,
    @ColumnInfo(name = "user_name") val userName: String,
    @ColumnInfo(name = "user_image") val userImage: String,
    @ColumnInfo(name = "date_create") val dateCreate: String,
    @ColumnInfo(name = "body") val body: String,
    @ColumnInfo(name = "like_list") val likeList: String,
    @ColumnInfo(name = "comment_list") val commentList: String
)