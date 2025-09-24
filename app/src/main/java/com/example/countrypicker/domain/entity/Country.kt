package com.example.countrypicker.domain.entity

data class Country(
    val name: String,
    val code: String,
    val flagResId: Int,
    val placeholder: String
)