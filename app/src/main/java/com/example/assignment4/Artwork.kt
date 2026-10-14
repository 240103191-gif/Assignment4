package com.example.assignment4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Artwork(
    val id: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val artistRes: Int,
    @StringRes val yearRes: Int
)
