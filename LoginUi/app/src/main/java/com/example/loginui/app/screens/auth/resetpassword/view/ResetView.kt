
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
import com.example.loginui.app.screens.auth.forgotscreen.viewmodel.ResetViewModel
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton

import com.example.loginui.app.components.auth.commoncomponent.Authscreenheader

import com.example.loginui.app.components.auth.commoncomponent.bodytext

import com.example.loginui.app.components.auth.commoncomponent.CustomButton
import com.example.loginui.app.components.auth.commoncomponent.textfieldheader
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomtextFieldnew
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens


@Composable
fun Resetscreen(viewModel: ResetViewModel, navController: NavHostController) {

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
//            CustomBackbutton(width = 24.dp, height =24.dp ,painterResource = R.drawable.arrowback) {
//            }
            CustomnorippleBUtton(height = 24.dp, width = 24.dp, Color = Color.Transparent ,
                imageResId =R.drawable.arrowback , enableHapticFeedback = false ,onClick = {   navController.popBackStack()})

            Spacer(modifier = Modifier.height(17.dp))
            Authscreenheader(value = stringResource(id = R.string.ResetPassword))
            Spacer(modifier = Modifier.height(10.dp))
            bodytext(value = stringResource(id = R.string.Pleaseenteryournewpassword))

            Spacer(modifier = Modifier.height(24.dp))
            textfieldheader(value = stringResource(id = R.string.Password))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label = stringResource(id = R.string.Enterpassword),
                value = viewModel.password.value,
                onValueChange = { createpassword -> viewModel.passwordstate(createpassword) })
            Text(
                text = viewModel._passwordError.value,
                color = Color.Red,
                modifier = Modifier.align(alignment = Alignment.End)
            )
            textfieldheader(value = stringResource(id = R.string.confrimpassword))
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label = stringResource(id = R.string.Reenterpassword),
                value = viewModel.confrimpassword.value,
                onValueChange = { createconfrimpassword -> viewModel.confrimpasswordstate(createconfrimpassword) })
            Text(
                text = viewModel._confrimpasswordError.value,
                color = Color.Red,
                modifier = Modifier.align(alignment = Alignment.End)
            )
            Spacer(modifier = Modifier.height(10.dp))
            CustomButton(text = stringResource(id = R.string.Gobackname)) {
                val password=viewModel.password.value
                val confrimpassword=viewModel.confrimpassword.value
            if(password.isEmpty()&&confrimpassword.isEmpty()||password!=confrimpassword){
                viewModel.validatorreset()

            }else{
                navController.popBackStack()
                navController.navigate("Signinsecondscreen")
            }



            }

        }

    }
}
