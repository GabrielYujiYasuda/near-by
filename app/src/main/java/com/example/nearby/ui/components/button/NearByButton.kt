package com.example.nearby.ui.components.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.GreenBase
import com.example.nearby.ui.theme.Typography

@Composable
fun NearByButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
) {
    val buttonPadding =
        if (text == null && iconRes != null) PaddingValues(16.dp)
        else ButtonDefaults.ContentPadding

    Button(
        modifier = modifier.heightIn(min = 56.dp),
        shape = RoundedCornerShape(16.dp),
        contentPadding = buttonPadding,
        colors = ButtonDefaults.buttonColors(
            containerColor = GreenBase
        ),
        onClick = onClick,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            iconRes?.let {
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = "Button icon",
                )
            }
            text?.let {
                Text(text = text.uppercase(), style = Typography.labelLarge)
            }
        }
    }
}

@Preview
@Composable
private fun NearByButtonPreview() {
    NearByButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Confirm",
        iconRes = R.drawable.ic_scan,
        onClick = { },
    )
}

@Preview
@Composable
private fun NearByButtonNoTextPreview() {
    NearByButton(
        modifier = Modifier,
        iconRes = R.drawable.ic_arrow_left,
        onClick = { },
    )
}

@Preview
@Composable
private fun NearByButtonNoIconPreview() {
    NearByButton(
        modifier = Modifier,
        text = "Confirm",
        onClick = { },
    )
}
