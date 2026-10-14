package com.example.assignment4

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val artworks = listOf(
    Artwork(
        id = 1,
        imageRes = R.drawable.artwork_starry_night,
        titleRes = R.string.artwork_1_title,
        artistRes = R.string.artwork_1_artist,
        yearRes = R.string.artwork_1_year
    ),
    Artwork(
        id = 2,
        imageRes = R.drawable.artwork_mona_lisa,
        titleRes = R.string.artwork_2_title,
        artistRes = R.string.artwork_2_artist,
        yearRes = R.string.artwork_2_year
    ),
    Artwork(
        id = 3,
        imageRes = R.drawable.artwork_great_wave,
        titleRes = R.string.artwork_3_title,
        artistRes = R.string.artwork_3_artist,
        yearRes = R.string.artwork_3_year
    ),
    Artwork(
        id = 4,
        imageRes = R.drawable.artwork_pearl_earring,
        titleRes = R.string.artwork_4_title,
        artistRes = R.string.artwork_4_artist,
        yearRes = R.string.artwork_4_year
    )
)

@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {
    val currentArtwork = artworks[0]

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.art_space_title),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        ArtworkWall(
            artwork = currentArtwork,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun ArtworkWall(
    artwork: Artwork,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        shadowElevation = 12.dp,
        color = Color.White
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .background(Color.White)
                .border(BorderStroke(1.dp, Color(0xFFE0E0E0))),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = artwork.imageRes),
                contentDescription = stringResource(id = artwork.titleRes),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}
