package com.example.countrypicker.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countrypicker.ui.theme.PrimaryText
import com.example.countrypicker.R

@Composable
fun HeaderSection() {
    Text(
        text = stringResource(id = R.string.one_last_step),
        fontSize = 24.sp,
        modifier = Modifier.padding(bottom = 12.dp),
        fontWeight = FontWeight.Bold,
        color = PrimaryText
    )
    Text(
        text = stringResource(id = R.string.login_or_signup),
        fontSize = 14.sp,
        color = PrimaryText
    )
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.free),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = PrimaryText,
            modifier = Modifier.padding(end = 4.dp)
        )
        Text(
            text = stringResource(id = R.string.account_to_continue),
            fontSize = 14.sp,
            color = PrimaryText
        )
    }
}
