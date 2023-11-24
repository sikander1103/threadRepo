package com.example.loginui.app.screens.homepage.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class PostdetailVm(){
    private val _addthread = mutableStateOf("")
    val addthread: State<String> = _addthread
    fun addthreadstate(addthread: String) {
        _addthread.value = addthread
    }

}