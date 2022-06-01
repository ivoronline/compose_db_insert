package com.ivoronline.compose_db_insert

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Person::class)], version = 1)
abstract class MyDatabase: RoomDatabase() {

  //DAO INTERFACES
  abstract fun personDao(): PersonDao

  //COMPANION OBJECT
  companion object {

    //PROPERTY
    private var INSTANCE: MyDatabase? = null

    //GET INSTANCE
    fun getInstance(context: Context): MyDatabase {
      synchronized(this) {

        var instance = INSTANCE

        if (instance == null) {
          instance = Room
            .databaseBuilder(context.applicationContext,MyDatabase::class.java,"product_database")
            .fallbackToDestructiveMigration()
            .build()
          INSTANCE = instance
        }

        return instance

      }
    }

  }

}
