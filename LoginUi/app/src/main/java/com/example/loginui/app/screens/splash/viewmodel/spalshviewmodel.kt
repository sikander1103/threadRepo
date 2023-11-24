package com.example.loginui.app.screens.splash.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class Splashviewmodel:ViewModel() {
    suspend fun  prefomSplashScreenLogic(){
        delay(3000)
    }
}