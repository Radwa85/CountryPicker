package com.example.countrypicker.domain

import com.example.countrypicker.domain.entity.Country

class GetCountriesUseCase(private val repository: CountryRepository) {
    operator fun invoke(): List<Country> {
        return repository.getCountries()
    }
}
