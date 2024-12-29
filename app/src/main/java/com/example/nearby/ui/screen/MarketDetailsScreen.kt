package com.example.nearby.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.data.model.Market
import com.example.nearby.R
import com.example.nearby.data.model.mock.mockMarkets
import com.example.nearby.ui.components.button.NearbyButton
import com.example.nearby.ui.components.market_details.NearbyMarketDetailsCoupon
import com.example.nearby.ui.components.market_details.NearbyMarketDetailsInfos
import com.example.nearby.ui.theme.Typography

@Composable
fun MarketDetailsScreen(
    market: Market,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
            contentDescription = "Local image",
            contentScale = ContentScale.Crop,
//            model = market.cover,
            painter = painterResource(id = R.drawable.img_burger),
        )

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                .fillMaxWidth()
                .fillMaxHeight(0.75f)
                .align(Alignment.BottomCenter)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(36.dp)
            ) {
                Column {
                    Text(text = market.name, style = Typography.headlineLarge)
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text = market.description, style = Typography.bodyLarge)
                    Spacer(modifier = Modifier.height(48.dp))
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ) {
                    NearbyMarketDetailsInfos(market = market)

                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    )

//                    if (market.rules.isNotEmpty()) {
//                        NearbyMarketDetailsRule(rules = market.rules)
//                        HorizontalDivider(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 24.dp)
//                        )
//                    }

                    NearbyMarketDetailsCoupon(coupons = listOf("ABC1235"))

                }

                NearbyButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    text = "Read QR code",
                    onClick = { /*TODO*/ }
                )
            }
        }

        NearbyButton(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(24.dp),
            iconRes =   R.drawable.ic_arrow_left,
            onClick = onNavigateBack
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MarketScreenPreview(modifier: Modifier = Modifier) {
    MarketDetailsScreen(
        market = mockMarkets.first(),
        onNavigateBack = { }
    )
}