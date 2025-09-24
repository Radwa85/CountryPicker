package com.example.countrypicker.domain

import com.example.countrypicker.domain.entity.Country

interface CountryRepository {
    fun getCountries(): List<Country>
}
