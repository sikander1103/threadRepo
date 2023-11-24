package com.example.loginui.app.screens.auth.login.view




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.auth.login.viewmodel.LoginViewModel
import com.example.loginui.app.components.auth.signin.ForgotPasswordText


import com.example.loginui.app.components.auth.signin.Ortext

import com.example.loginui.app.components.auth.commoncomponent.Authscreenheader

import com.example.loginui.app.components.auth.commoncomponent.bodytext

import com.example.loginui.app.components.auth.commoncomponent.ButtonwithIcon
import com.example.loginui.app.components.auth.commoncomponent.CustomButton

import com.example.loginui.app.components.auth.commoncomponent.textfieldheader
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomTextFieldpassword
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomtextFieldnew
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens


@Composable
fun SigninScecondScreen(viewModel: LoginViewModel, navController: NavHostController) {

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
            Authscreenheader(value = stringResource(id = R.string.LogintoyourAccount))
            Spacer(modifier = Modifier.height(10.dp))
            bodytext(value = stringResource(id = R.string.Pleaseenteryourusername))
            Spacer(modifier = Modifier.height(24.dp))
            textfieldheader(value = stringResource(id = R.string.Usernametext))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label = stringResource(id = R.string.Usernameandpasswordfieldtext),
                value = viewModel.username.value, 
                onValueChange = { newusername -> viewModel.usernamestate(newusername) })
            Text(text = viewModel._usernameError.value, color = Color.Red, modifier =Modifier.align(alignment = Alignment.End))

            Spacer(modifier = Modifier.height(10.dp))
            textfieldheader(value = stringResource(id = R.string.Password))
            Spacer(modifier = Modifier.height(12.dp))
            CustomTextFieldpassword(onValueChange ={ newpassword -> viewModel.passwordstate(newpassword) } , label = stringResource(
                id = R.string.Enterpassword
            ), value =viewModel.password.value )
            Text(text = viewModel._passwordError.value, color = Color.Red,modifier =Modifier.align(alignment = Alignment.End))
            
            Spacer(modifier = Modifier.height(10.dp))

            ForgotPasswordText {
                navController.navigate("forgotscreen")
            }
            Spacer(modifier = Modifier.height(24.dp))
            CustomButton(text = stringResource(id = R.string.Logintext)) {
//
                val username = viewModel.username.value
                val password = viewModel.password.value
                if (username.isEmpty()||password.isEmpty()||password.length<8){
                    viewModel.validateAndLogin()

                }else{
                    navController.navigate("HomepageView")
                }

            }
            Spacer(modifier = Modifier.height(22.dp))
            Ortext()

            Spacer(modifier = Modifier.height(22.dp))
            ButtonwithIcon(text = stringResource(id = R.string.SigninwithGoogle), painterResource = painterResource(
                id = R.drawable.google_icon
            ) )  {
            }
            Spacer(modifier = Modifier.height(12.dp))
            ButtonwithIcon(text = stringResource(id = R.string.Signinwithfacebook), painterResource = painterResource(
                id = R.drawable.facebooklogo
            ) )  {
                print("hello2")
            }
            Spacer(modifier = Modifier.height(12.dp))
            ButtonwithIcon(text = stringResource(id = R.string.SigninwithApple), painterResource = painterResource(
                id = R.drawable.applelogo
            ) )  {
                print("hello2")
            }

        }



    }
}

