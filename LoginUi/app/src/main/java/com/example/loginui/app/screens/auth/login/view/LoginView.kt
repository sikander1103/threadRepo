package com.example.loginui.app.screens.auth.signup.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.components.auth.signin.imagecontainer

import com.example.loginui.app.components.auth.commoncomponent.bodytext

import com.example.loginui.app.components.auth.commoncomponent.ButtonwithIcon
import com.example.loginui.app.components.auth.commoncomponent.Buttonwithouticon
import com.example.loginui.app.components.auth.commoncomponent.CustomButton
import com.example.loginui.app.components.auth.commoncomponent.joinnow
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens


@Composable
fun SigninScreen(navController: NavHostController,) {

    Surface(
        color = backgroundcolorofscreens

    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp),
        ) {
            Spacer(modifier = Modifier.height(45.dp))

            imagecontainer()

            Spacer(modifier = Modifier.height(45.dp))
            joinnow(value = stringResource(id = R.string.Joinnowtext))
            Spacer(modifier = Modifier.height(10.dp))
            bodytext(value = stringResource(id = R.string.Createaccounttoget))
            Spacer(modifier = Modifier.height(22.dp))
            CustomButton(text = stringResource(id = R.string.createaccounttext)) {
                //perform navigation here
                navController.navigate("Signupscreen")
            }
            Spacer(modifier = Modifier.height(12.dp))
            Buttonwithouticon(text = stringResource(id = R.string.Logintext)) {
                //Todo to perform Activity to press
                navController.navigate("Signinsecondscreen")
            }
            Spacer(modifier = Modifier.height(22.dp))
//            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
//                orbuttontext(value = stringResource(id = R.string.or))
//            }
////////////////////////////////////or button portion
            Spacer(modifier = Modifier.height(22.dp))
            ButtonwithIcon(
                text = stringResource(id = R.string.SigninwithGoogle),
                painterResource = painterResource(
                    id = R.drawable.google_icon
                )
            ) {
                navController.navigate("A")
            }
            Spacer(modifier = Modifier.height(12.dp))
            ButtonwithIcon(
                text = stringResource(id = R.string.Signinwithfacebook),
                painterResource = painterResource(
                    id = R.drawable.facebooklogo
                )
            ) {
                navController.navigate("text")
            }
            Spacer(modifier = Modifier.height(12.dp))
            ButtonwithIcon(
                text = stringResource(id = R.string.SigninwithApple),
                painterResource = painterResource(
                    id = R.drawable.applelogo
                )
            ) {
                navController.navigate("myscreen")
            }

        }


    }
}

