package com.example.countrypicker.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countrypicker.R
import com.example.countrypicker.domain.entity.Country
import com.example.countrypicker.ui.theme.PrimaryText

@Composable
fun CountryPicker(
    selectedCountry: Country,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = selectedCountry.flagResId),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_drop_down),
            contentDescription = null,
            modifier = Modifier.size(10.dp),
            tint = PrimaryText
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = selectedCountry.code,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = PrimaryText
        )
    }
}