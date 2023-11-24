package com.example.loginui.app.screens.homepage.view.imagedetailScreen

import CardItemData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ImageDetailScreen(cardItemData: CardItemData, navController: NavHostController) {
    Box(
      modifier = Modifier
          .fillMaxSize().
              fillMaxWidth()
          .background(Color.Black)

    ) {
        (if (cardItemData.imageRes != null) painterResource(id = cardItemData.imageRes) else null)?.let {
            Image(
                painter = it,
                contentDescription = "",
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp))
            )
        }

    }
}