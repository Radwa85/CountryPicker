package com.example.countrypicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.countrypicker.presentation.CountryPickerScreen
import com.example.countrypicker.presentation.CountryPickerViewModel
import com.example.countrypicker.presentation.CountryPickerViewModelFactory
import com.example.countrypicker.ui.theme.CountryPickerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = CountryPickerViewModelFactory().create(CountryPickerViewModel::class.java)
        setContent {
            CountryPickerTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.White,
                ) { innerPadding ->
                    CountryPickerScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

