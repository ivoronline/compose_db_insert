package com.ivoronline.compose_db_insert

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface PersonDao {

  //INSERT PERSON
  @Insert
  fun insertPerson(product: Person)

}


