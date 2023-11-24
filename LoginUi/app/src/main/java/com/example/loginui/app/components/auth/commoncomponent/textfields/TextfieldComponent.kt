package com.example.loginui.app.components.auth.commoncomponent.textfields

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginui.app.utils.componentShapes
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens
import com.example.loginui.ui.theme.blackColor
import com.example.loginui.ui.theme.fieldsColor
import com.example.loginui.ui.theme.graycolor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomtextFieldnew(
    label:String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions= KeyboardOptions.Default,
    keyboardAction:KeyboardActions= KeyboardActions.Default,



) {
    OutlinedTextField(
        modifier= Modifier
            .clip(componentShapes.small)
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,

        placeholder={
            Text(
                text = label ,fontWeight = FontWeight(500), color = graycolor, fontSize = 14.sp, fontFamily = FontFamily(
                    Font(R.font.sfprodisplay)
                )
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = fieldsColor,
            cursorColor= blackColor,
            disabledBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent

        ),
        keyboardOptions = keyboardOptions

    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun CustomTextFieldpassword(
    onValueChange: (String) -> Unit,
    label: String,
    value: String,
    keyboardType: KeyboardType = KeyboardType.Text,



) {

    val  passwordVisible = remember {
        mutableStateOf(false)
    }
    OutlinedTextField(modifier = Modifier
        .clip(componentShapes.small)
        .fillMaxWidth()
        ,

        value = value,
        onValueChange = onValueChange,

        placeholder = {
            Text(
                text = label ,fontWeight = FontWeight(500), color = graycolor, fontSize = 14.sp, fontFamily = FontFamily(
                    Font(R.font.sfprodisplay)
                )
            )
        },

        trailingIcon = {
            val iconImage=if(passwordVisible.value){
                Icons.Filled.Visibility
            }else{
                Icons.Filled.VisibilityOff
            }
            IconButton(onClick = { passwordVisible.value=!passwordVisible.value}) {
                Icon(imageVector = iconImage,contentDescription = null)

            }

        },
        visualTransformation = if(passwordVisible.value) VisualTransformation.None else
            PasswordVisualTransformation(),
//


        colors = TextFieldDefaults.outlinedTextFieldColors(

            containerColor = fieldsColor,
            cursorColor= blackColor,
            disabledBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent

        ),

        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = keyboardType
        )

    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomThreadField(
    label:String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions= KeyboardOptions.Default,
    keyboardAction:KeyboardActions= KeyboardActions.Default,
    onclick: () -> Unit,



    ) {
    val haptic= LocalHapticFeedback.current
    OutlinedTextField(
        modifier= Modifier
            .clip(RoundedCornerShape(15.dp))
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,

        trailingIcon = {
            if (value.isNotEmpty()){
         Image(painter = painterResource(id = R.drawable.threadsend), contentDescription = "",Modifier.size(height = 24.dp,
             width = 24.dp
         ).clickable {
             haptic.performHapticFeedback(hapticFeedbackType = HapticFeedbackType.LongPress)
             onclick() })}
        else null
        },

        placeholder={
            Text(
                text = label ,fontWeight = FontWeight(500), color = graycolor, fontSize = 14.sp, fontFamily = FontFamily(
                    Font(R.font.sfprodisplay)
                )
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = backgroundcolorofscreens,
            cursorColor= blackColor,
            disabledBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,

        ),
        keyboardOptions = keyboardOptions

    )
}



