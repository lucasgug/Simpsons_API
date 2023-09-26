package com.lucasgugliuzza.simpsons_api

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lucasgugliuzza.simpsons_api.presentation.HomeScreen
import com.lucasgugliuzza.simpsons_api.presentation.SimsonViewModel
import com.lucasgugliuzza.simpsons_api.ui.theme.Simpsons_APITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel by viewModels<SimsonViewModel>()
        setContent {
           HomeScreen(viewModel)
        }
    }
}

