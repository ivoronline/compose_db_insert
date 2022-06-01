package com.ivoronline.compose_db_insert

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.ivoronline.compose_db_insert.ui.theme.Compose_db_insertTheme

//===============================================================================
// MAIN ACTIVITY
//===============================================================================
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ScreenSetup()
    }
  }
}

//===============================================================================
// SCREEN SETUP
//===============================================================================
@Composable
fun ScreenSetup(viewModel: MyViewModel = MyViewModel(LocalContext.current.applicationContext as Application) ) {
  Button({viewModel.insertPerson(Person("John", 20))}) {Text("Insert Person")}
}
