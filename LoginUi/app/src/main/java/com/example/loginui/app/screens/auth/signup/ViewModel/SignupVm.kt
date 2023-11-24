import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignupViewModel : ViewModel() {

    private val _username = mutableStateOf("")
    val username: State<String> = _username
    private val _date = mutableStateOf("")
    private val _password = mutableStateOf("")
    val password: State<String> = _password

    private val _phonenumber = mutableStateOf("")
    val phonenumber: State<String> = _phonenumber
    private val _email = mutableStateOf("")
    val email: State<String> = _email
    private val _name = mutableStateOf("")
    val name: State<String> = _name
    fun namestate(newname: String) {
        _name.value = newname
    }
    fun emailstate(newemail: String) {
        _email.value = newemail
    }

    fun phonenumberstate(newphonenumber: String) {
        _phonenumber.value = newphonenumber
    }

    fun passwordstate(newpassword: String) {
        _password.value = newpassword
    }

    fun usernamestate(newusername: String) {
        _username.value = newusername
    }
    val _emailError = mutableStateOf("")
    val _usernameError = mutableStateOf("")
    val _passwordError = mutableStateOf("")
    val _nameError = mutableStateOf("")
    val _phonenumberError = mutableStateOf("")
    fun validateAndLogin() {
        val username = _username.value
        val password = _password.value
        val email = _email.value
        val name = _name.value
        val phonenumber = _phonenumber.value

        if (username.isEmpty()) {
            _usernameError.value = "Username cannot be empty"
        } else {
            _usernameError.value = ""
        }
        if (username.isEmpty()) {
            _usernameError.value = "Username cannot be empty"
        } else {
            _usernameError.value = ""
        }
        if (email.isEmpty()) {
            _emailError.value = "Email cannot be empty"
        } else if (!isValidEmail(email)) {
            _emailError.value = "Invalid email format"
        } else {
            _emailError.value = ""
        }
        if (name.isEmpty()) {
            _nameError.value = "Name cannot be empty"
        } else {
            _nameError.value = ""
        }
        if (phonenumber.isEmpty()) {
            _phonenumberError.value = "Phone number cannot be empty"
        } else {
            _phonenumberError.value = ""
        }

        if (password.isEmpty()) {
            _passwordError.value = "Password cannot be empty"
        }else if(password.length<8){
            _passwordError.value = "Password must have at least 8 characters"
        }
        else {
            _passwordError.value = ""
        }

        if (username.isNotEmpty() && password.isNotEmpty()) {
            //////////baad ma login ki logic k liye portion
        }

    }
    private fun isValidEmail(email: String): Boolean {
        val emailRegex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
        return email.matches(emailRegex)
    }
}
