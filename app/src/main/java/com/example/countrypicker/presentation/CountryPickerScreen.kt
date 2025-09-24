package com.example.countrypicker.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countrypicker.R
import com.example.countrypicker.domain.entity.Country
import com.example.countrypicker.presentation.components.ContinueButton
import com.example.countrypicker.presentation.components.CountryPickerDialog
import com.example.countrypicker.presentation.components.HeaderSection
import com.example.countrypicker.presentation.components.PhoneInputSection
import com.example.countrypicker.presentation.components.TermsAndConditionsRow
import com.example.countrypicker.ui.theme.SecondaryText

@Composable
fun CountryPickerScreen(
    modifier: Modifier = Modifier,
    viewModel: CountryPickerViewModel
) {
    val uiState by viewModel.uiState.collectAsState()
    val countries by viewModel.countries.collectAsState()

    CountryPickerContent(
        modifier = modifier,
        uiState = uiState,
        countries = countries,
        interactionListener = viewModel
    )
}

@Composable
fun CountryPickerContent(
    modifier: Modifier = Modifier,
    uiState: CountryPickerUiState,
    countries: List<Country>,
    interactionListener: CountryPickerInteractionListener
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        HeaderSection()

        PhoneInputSection(
            selectedCountry = uiState.selectedCountry,
            phoneNumber = uiState.phoneNumber,
            onCountryClick = { interactionListener.onDialogStateChanged(true) },
            onPhoneChanged = interactionListener::onPhoneNumberChanged
        )

        Text(
            text = stringResource(id = R.string.verify_account),
            textAlign = TextAlign.Start,
            fontSize = 10.sp,
            color = SecondaryText,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TermsAndConditionsRow(
            checked = uiState.agreedToTerms,
            onCheckedChange = interactionListener::onAgreedToTermsChanged
        )

        ContinueButton(onClick = interactionListener::onContinueClicked)

        if (uiState.showCountryDialog) {
            CountryPickerDialog(
                countries = countries,
                onCountrySelected = {
                    interactionListener.onCountrySelected(it)
                    interactionListener.onDialogStateChanged(false)
                },
                onDismiss = { interactionListener.onDialogStateChanged(false) }
            )
        }
    }
}
