package com.example.countrypicker.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.countrypicker.data.CountryRepositoryImpl
import com.example.countrypicker.domain.GetCountriesUseCase

class CountryPickerViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CountryPickerViewModel::class.java)) {
            val repository = CountryRepositoryImpl()
            val getCountriesUseCase = GetCountriesUseCase(repository)
            @Suppress("UNCHECKED_CAST")
            return CountryPickerViewModel(getCountriesUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
