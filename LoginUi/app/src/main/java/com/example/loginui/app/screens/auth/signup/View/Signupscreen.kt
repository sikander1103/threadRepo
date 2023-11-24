package com.example.loginui.app.screens.auth.login.view




import DatePickerBox
import SignupViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

import com.example.loginui.app.components.auth.commoncomponent.Authscreenheader

import com.example.loginui.app.components.auth.commoncomponent.bodytext

import com.example.loginui.app.components.auth.commoncomponent.CustomButton
import com.example.loginui.app.components.auth.commoncomponent.textfieldheader
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomTextFieldpassword
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomtextFieldnew
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens


@Composable
fun Signupscreen(navController: NavHostController,viewModel: SignupViewModel) {

    Surface(
        color = backgroundcolorofscreens

    ){
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp),
        ) {
            Spacer(modifier = Modifier.height(62.dp))
            Authscreenheader(value = stringResource(id =R.string.CreateYourAccount))
            Spacer(modifier = Modifier.height(10.dp))
            bodytext(value = stringResource(id = R.string.Createanaccounttoget))
            Spacer(modifier = Modifier.height(24.dp))
            textfieldheader(value = stringResource(id = R.string.Name))
            Spacer(modifier = Modifier.height(12.dp))

            CustomtextFieldnew(label = stringResource(id = R.string.enterName), value = viewModel.name.value,
                onValueChange ={ newname -> viewModel.namestate(newname) } )
            Text(text = viewModel._nameError.value, color = Color.Red,modifier = Modifier.align(alignment = Alignment.End))
            Spacer(modifier = Modifier.height(19.dp))
            textfieldheader(value = stringResource(id = R.string.Phone))
            Spacer(modifier = Modifier.height(12.dp))
          CustomtextFieldnew(label = stringResource(id = R.string.EnterphoneNumber),
              value =viewModel.phonenumber.value ,
              keyboardOptions = KeyboardOptions(
                  keyboardType = KeyboardType.Number
              ),
              onValueChange ={ newphonenumber -> viewModel.phonenumberstate(newphonenumber) } )
            Text(text = viewModel._phonenumberError.value, color = Color.Red,modifier = Modifier.align(alignment = Alignment.End))
            Spacer(modifier = Modifier.height(19.dp))
            textfieldheader(value = stringResource(id = R.string.Email))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label = stringResource(id = R.string.Enteremail), value =viewModel.email.value ,
                onValueChange ={ newemail -> viewModel.emailstate(newemail) } )
            Text(text = viewModel._emailError.value, color = Color.Red,modifier = Modifier.align(alignment = Alignment.End))

            Spacer(modifier = Modifier.height(19.dp))
            textfieldheader(value = stringResource(id = R.string.Password))
            Spacer(modifier = Modifier.height(19.dp))
            CustomTextFieldpassword(onValueChange ={ newpassword -> viewModel.passwordstate(newpassword) } ,
                label = stringResource(id = R.string.Enterpassword) , value =viewModel.password.value )
            Text(text = viewModel._passwordError.value, color = Color.Red,modifier = Modifier.align(alignment = Alignment.End))

            Spacer(modifier = Modifier.height(19.dp))
            textfieldheader(value = stringResource(id = R.string.username))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(onValueChange = { newusername -> viewModel.usernamestate(newusername) },
                label = stringResource(id = R.string.enterusername) ,
                value =viewModel.username.value )
            Text(text = viewModel._usernameError.value, color = Color.Red, modifier = Modifier.align(alignment = Alignment.End))
            Spacer(modifier = Modifier.height(19.dp))
            textfieldheader(value = stringResource(id = R.string.Dateofbirth))
            Spacer(modifier = Modifier.height(12.dp))
            DatePickerBox()
            Spacer(modifier = Modifier.height(24.dp))
            CustomButton(text = stringResource(id = R.string.createaccounttext)) {
                viewModel.validateAndLogin()
            }
           Spacer(modifier = Modifier.height(10.dp))



        }



    }
}
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun defaultviewofsignup(){
//    Signupscreen(navController)
//}