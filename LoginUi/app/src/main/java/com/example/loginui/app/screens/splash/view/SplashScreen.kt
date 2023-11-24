package com.example.loginui.app.screens.splash.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.splash.viewmodel.Splashviewmodel
import com.example.loginui.R
import com.example.loginui.ui.theme.darkbrown

@Composable
fun splashscreen(viewModel: Splashviewmodel, navController: NavHostController) {
    LaunchedEffect(key1 = true) {
        viewModel.prefomSplashScreenLogic()
        navController.popBackStack()
        navController.navigate("Signinscreen")
    }

    Box(
        modifier = Modifier

            .background(darkbrown)
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center

    ) {
        Image(painter = painterResource(id = R.drawable.vector), contentDescription ="", contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
            )
        Image(painter = painterResource(id = R.drawable.tlogo), contentDescription ="" )
    }
}
