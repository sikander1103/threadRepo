package com.example.loginui.app.screens.auth.forgotscreen.viewmodel





import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class ResetViewModel(): ViewModel() {


    private val _password = mutableStateOf("")
    val password: State<String> = _password
    private val _confrimpassword = mutableStateOf("")
    val confrimpassword: State<String> = _confrimpassword
    fun passwordstate(newpassword: String) {
        _password.value = newpassword
    }
    fun  confrimpasswordstate(newconfrimpassword: String) {
        _confrimpassword.value = newconfrimpassword
    }
    val _passwordError = mutableStateOf("")
    val _confrimpasswordError = mutableStateOf("")
    fun validatorreset(){
        val password = _password.value
        val confirmpassword = _confrimpassword.value
        if (password.isEmpty()) {
            _passwordError.value = "Password cannot be empty"
        }else if (password.length<8){
            _passwordError.value = "Password must have at least 8 characters"
        }else{
            _passwordError.value = ""
        }
        if (confirmpassword.isEmpty()) {
            _confrimpasswordError.value = "Confirm password cannot be empty"
        }
        if (password.isNotEmpty() && confirmpassword.isNotEmpty()) {
            if (password != confirmpassword) {
//                _passwordError.value = "Passwords do not match"
                _confrimpasswordError.value = "Passwords do not match"
            }
            else{
                _confrimpasswordError.value = ""
            }
        }

    }
}
