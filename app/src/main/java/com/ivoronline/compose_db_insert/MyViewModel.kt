package com.ivoronline.compose_db_insert

import android.app.Application

class MyViewModel(application: Application) {

  //REPOSITORIES
  private val personRepository: PersonRepository

  //INITIALIZE REPOSITORIES
  init {
    val myDatabase       = MyDatabase.getInstance(application)
    val personDao        = myDatabase.personDao()
        personRepository = PersonRepository(personDao)
  }

  //METHODS
  fun insertPerson(person: Person) {
    personRepository.insertPerson(person)
  }

}
