package com.br.usemobile.feed.data_local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PostEntity::class], version = 1)
abstract class FeedDatabase: RoomDatabase() {
    abstract fun feedDao(): FeedDao
}