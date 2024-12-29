package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Flavor Grill",
        description = "Steakhouse with prime cuts and a varied buffet. A complete experience for meat lovers.",
        coupons = 10,
//        rules = listOf(
//            Rule(
//                id = "1",
//                description = "Available until december 25th",
//                marketId = "012576ea-4441-4b8a-89e5-d5f32104c7c4"
//            ),
//            Rule(
//                id = "2",
//                description = "Free delivery for orders over $50",
//                marketId = "D12k3j-4441-4b8a-89e5-d5f321043afd"
//            )
//        ),
        latitude = -23.55974230991911,
        longitude = -46.65814845249887,
        address = "Main Street",
        phone = "(1) 1231-1231",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "2bc11e34-5f30-4ba0-90fa-c1c98f649281",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Central Cafe",
        description = "Cozy café with a choice of snacks and artisanal drinks. Perfect for a break.",
        coupons = 10,
//        rules = emptyList(),
        latitude = -23.559457108504436,
        longitude = -46.66252581753144,
        address = "Malden Street",
        phone = "(1) 1231-1231",
        cover = "https://images.unsplash.com/photo-1551218808-94e220e084d2?w=400&h=300"
    )
)