package com.example.bnidirectmobile.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(){
    Scaffold (
        Modifier.padding(paddingValues = PaddingValues(horizontal = 16.dp, vertical = 16.dp))){
            paddingValues ->
        Text(text = "Home Screen",
            modifier = Modifier.padding(paddingValues))
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}