package com.example.loginui.app.screens.auth.forgotscreen.view








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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.auth.forgotscreen.viewmodel.ForgotViewModel
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton

import com.example.loginui.app.components.auth.commoncomponent.Authscreenheader

import com.example.loginui.app.components.auth.commoncomponent.bodytext

import com.example.loginui.app.components.auth.commoncomponent.CustomButton
import com.example.loginui.app.components.auth.commoncomponent.textfieldheader
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomtextFieldnew
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens


@Composable
fun Forgotscreen(navController: NavHostController,viewModel: ForgotViewModel) {

    Surface(
        color = backgroundcolorofscreens

    ){
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp),
        ) {
            Spacer(modifier = Modifier.height(21.dp))
//            CustomBackbutton {
//                navController.popBackStack()
//            }
//            CustomBackbutton(width =24.dp , height =24.dp ,painterResource = R.drawable.arrowback) {
//
//            }
            CustomnorippleBUtton(height = 24.dp, width = 24.dp, Color = Color.Transparent , imageResId =R.drawable.arrowback, enableHapticFeedback =false, onClick = {navController.popBackStack()} )



            Spacer(modifier = Modifier.height(17.dp))
            Authscreenheader(value = stringResource(id = R.string.Forgotpassheading))
            Spacer(modifier = Modifier.height(10.dp))
            bodytext(value = stringResource(id = R.string.forgotscreenbody))

            Spacer(modifier = Modifier.height(24.dp))
            textfieldheader(value = stringResource(id = R.string.Email))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label = stringResource(id = R.string.Enteremail),
                value = viewModel.Email1.value,
                onValueChange = { newemail -> viewModel.Emailstate(newemail) })
            Text(
                text = viewModel._emailError1.value,
                color = Color.Red,
                modifier = Modifier.align(alignment = Alignment.End)
            )
            Spacer(modifier = Modifier.height(10.dp))
            CustomButton(text = stringResource(id = R.string.send)) {
                //Todo to perform activity to press
                val email = viewModel.Email1.value
                if (email.isEmpty() || !viewModel.isValidEmail1(email)) {

                        viewModel.validater()
                } else {
                    // Email is valid and not empty, navigate to the next screend

                    navController.navigate("Resetscreen")

                }



            }

        }

    }
}
