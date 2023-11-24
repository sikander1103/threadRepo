package com.example.loginui.app.screens.homepage.viewmodel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class SearchBoxViewModel()  {
    private val _searchfield = mutableStateOf("")
    val searchfield: State<String> = _searchfield
    fun searchfieldstate(newtextfield: String) {
        _searchfield.value = newtextfield
    }

}
