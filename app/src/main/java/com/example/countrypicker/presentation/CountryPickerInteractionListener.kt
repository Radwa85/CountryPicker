package com.example.countrypicker.presentation

import com.example.countrypicker.domain.entity.Country

interface CountryPickerInteractionListener {
    fun onDialogStateChanged(show: Boolean)
    fun onPhoneNumberChanged(phoneNumber: String)
    fun onAgreedToTermsChanged(agreed: Boolean)
    fun onContinueClicked()
    fun onCountrySelected(country: Country)
}