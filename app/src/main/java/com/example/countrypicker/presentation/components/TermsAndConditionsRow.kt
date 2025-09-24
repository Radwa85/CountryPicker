package com.example.countrypicker.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countrypicker.ui.theme.ButtonColor
import com.example.countrypicker.ui.theme.LightGray
import com.example.countrypicker.ui.theme.LinkText
import com.example.countrypicker.ui.theme.PrimaryText
import com.example.countrypicker.R

@Composable
fun TermsAndConditionsRow(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = CheckboxDefaults.colors(
                checkedColor = ButtonColor,
                uncheckedColor = LightGray
            )
        )
        Text(
            text = stringResource(id = R.string.agree_to_terms),
            fontSize = 12.sp,
            modifier = Modifier.padding(end = 4.dp),
            color = PrimaryText
        )
        Text(
            text = stringResource(id = R.string.community_guidelines),
            fontSize = 12.sp,
            color = LinkText
        )
    }
}
