package com.example.countrypicker.presentation

import androidx.lifecycle.ViewModel
import com.example.countrypicker.domain.entity.Country
import com.example.countrypicker.domain.GetCountriesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CountryPickerViewModel(
    getCountriesUseCase: GetCountriesUseCase
) : ViewModel(), CountryPickerInteractionListener {

    private val countriesList: List<Country> = getCountriesUseCase()

    private val _countries = MutableStateFlow(countriesList)
    val countries: StateFlow<List<Country>> = _countries.asStateFlow()

    private val _uiState = MutableStateFlow(
        CountryPickerUiState(
            selectedCountry = countriesList.first(),
            countries = countriesList
        )
    )
    val uiState: StateFlow<CountryPickerUiState> = _uiState.asStateFlow()

    override fun onCountrySelected(country: Country) {
        _uiState.update { it.copy(selectedCountry = country) }
        onDialogStateChanged(false)
    }

    override fun onPhoneNumberChanged(phoneNumber: String) {
        _uiState.update { it.copy(phoneNumber = phoneNumber) }
    }

    override fun onAgreedToTermsChanged(agreed: Boolean) {
        _uiState.update { it.copy(agreedToTerms = agreed) }
    }

    override fun onDialogStateChanged(show: Boolean) {
        _uiState.update { it.copy(showCountryDialog = show) }
    }

    override fun onContinueClicked() {
        // TODO: Handle continue action
    }
}
