package com.example.countrypicker.data

import com.example.countrypicker.domain.entity.Country
import com.example.countrypicker.domain.CountryRepository
import com.example.countrypicker.R

class CountryRepositoryImpl : CountryRepository {
    override fun getCountries(): List<Country> {
        return listOf(
            Country("United Kingdom", "+44", R.drawable.uk, "7xxxxxxxxx"),
            Country("United States", "+1", R.drawable.us, "201xxxxxxx"),
            Country("Canada", "+1", R.drawable.ca, "204xxxxxxx"),
            Country("Germany", "+49", R.drawable.de, "15xxxxxxxx"),
            Country("France", "+33", R.drawable.fr, "6xxxxxxxx"),
            Country("Netherlands", "+31", R.drawable.nl, "6xxxxxxxx"),
            Country("Australia", "+61", R.drawable.au, "4xxxxxxxx"),
            Country("United Arab Emirates", "+971", R.drawable.ae, "5xxxxxxxx"),
            Country("Egypt", "+20", R.drawable.eg, "1xxxxxxxxx"),
            Country("Iraq", "+964", R.drawable.iq, "7xxxxxxxxx"),
            Country("Turkey", "+90", R.drawable.tr, "5xxxxxxxxx"),
            Country("Nigeria", "+234", R.drawable.ng, "8xxxxxxxxx"),
            Country("China", "+86", R.drawable.cn, "1xxxxxxxxxx"),
            Country("Japan", "+81", R.drawable.jp, "70xxxxxxxx"),
        )
    }
}
