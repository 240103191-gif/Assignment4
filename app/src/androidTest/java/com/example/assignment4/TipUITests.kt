package com.example.assignment4

import androidx.compose.ui.test.junit4.createComposeRule
import com.example.assignment4.ui.theme.Assignment4Theme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            Assignment4Theme {
                TipTimeLayout()
            }
        }
    }
}
