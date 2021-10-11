package com.br.usemobile.feed.data_local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeedDao {

    @Insert
    fun insert(post: PostEntity)

    @Query("DELETE FROM feed")
    fun delete()

}