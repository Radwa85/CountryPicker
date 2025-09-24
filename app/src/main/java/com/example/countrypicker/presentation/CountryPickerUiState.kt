package com.example.countrypicker.presentation

import com.example.countrypicker.domain.entity.Country

data class CountryPickerUiState(
    val countries: List<Country> = emptyList(),
    val selectedCountry: Country,
    val phoneNumber: String = "",
    val agreedToTerms: Boolean = false,
    val showCountryDialog: Boolean = false,
)
