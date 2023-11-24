package com.example.loginui.app.screens.auth.forgotscreen.viewmodel





import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class ForgotViewModel(): ViewModel() {


    private val _Email1 = mutableStateOf("")
    val Email1: State<String> = _Email1
    fun Emailstate(newemail: String) {
        _Email1.value = newemail
    }
 val _emailError1 = mutableStateOf("")
    fun validater() {
        val email1=_Email1.value
        if (email1.isEmpty()) {
            _emailError1.value = "Email cannot be empty"
        } else if (!isValidEmail1(email1)) {
            _emailError1.value = "Invalid email format"
        } else {
            _emailError1.value = ""
        }

    }
     fun isValidEmail1(email: String): Boolean {
        val emailRegex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
        return email.matches(emailRegex)
    }
}
