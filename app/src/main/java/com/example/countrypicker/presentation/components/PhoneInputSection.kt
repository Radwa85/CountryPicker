package com.example.countrypicker.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.countrypicker.domain.entity.Country
import com.example.countrypicker.ui.theme.PrimaryText
import com.example.countrypicker.ui.theme.SecondaryText
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.countrypicker.ui.theme.LightGray

@Composable
fun PhoneInputSection(
    selectedCountry: Country,
    phoneNumber: String,
    onCountryClick: () -> Unit,
    onPhoneChanged: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.5.dp, LightGray, RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CountryPicker(selectedCountry = selectedCountry, onClick = onCountryClick)

        TextField(
            value = phoneNumber,
            onValueChange = onPhoneChanged,
            modifier = Modifier
                .weight(1f)
                .background(Color.Transparent),
            placeholder = {
                Text(
                    text = selectedCountry.placeholder,
                    fontSize = 12.sp,
                    color = SecondaryText
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedTextColor = PrimaryText,
                unfocusedTextColor = PrimaryText,
                cursorColor = PrimaryText,
                unfocusedPlaceholderColor = SecondaryText,
                focusedPlaceholderColor = SecondaryText
            )
        )
    }
}