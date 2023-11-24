package com.example.loginui.app.screens.auth.login.viewmodel



import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel():ViewModel() {



    private val _username = mutableStateOf("")
    val username: State<String> = _username
    private val _password = mutableStateOf("")
    val password: State<String> = _password



    fun passwordstate(newpassword: String) {
        _password.value = newpassword
    }


    fun usernamestate(newusername: String) {
        _username.value = newusername
    }
    val _usernameError = mutableStateOf("")
    val _passwordError = mutableStateOf("")
    fun validateAndLogin() {
        val username = _username.value
        val password = _password.value


        if (username.isEmpty()) {
            _usernameError.value = "Username cannot be empty"
        } else {
            _usernameError.value = ""
        }

        if (password.isEmpty()) {
            _passwordError.value = "Password cannot be empty"
        }else if (password.length<8){
            _passwordError.value = "Password must have at least 8 characters"
        }
        else {
            _passwordError.value = ""
        }

        if (username.isNotEmpty() && password.isNotEmpty()) {
                                           //////////baad ma login ki logic k liye portion
        }
    }
}
