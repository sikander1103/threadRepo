import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier

import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent


import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtpChar(
    modifier: Modifier = Modifier,
    focusRequester: FocusRequester,
    onValueChange: (String) -> Unit
) {
    val pattern = remember { Regex("^[^\\t]*\$") }
    var (text, setText) = remember { mutableStateOf("") }
    val maxChar = 1

    LaunchedEffect(key1 = text) {
        if (text.isNotEmpty()) {
            focusRequester.requestFocus()
        }
    }


        OutlinedTextField(
            value = text,
            onValueChange = {
                if (it.length <= maxChar && (it.isEmpty() || it.matches(pattern))) {
                    setText(it)
                    onValueChange(it)
                }
            },
            modifier = modifier
                .width(50.dp)
                .onKeyEvent {
                    if (it.key == Key.Tab) {
                        focusRequester.requestFocus()
                        true
                    }
                    if (text.isEmpty() && it.key == Key.Backspace) {
                        focusRequester.requestFocus()
                    }
                    false
                },
            textStyle = LocalTextStyle.current.copy(
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                capitalization = KeyboardCapitalization.Characters,
                keyboardType = KeyboardType.Number
            ),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                unfocusedIndicatorColor = Color.Gray,
                focusedIndicatorColor = Color.Gray
            ),
        )
    }


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun OtpScreen() {
    var otp by remember { mutableStateOf(arrayOf("", "", "", "")) }

    val (item1, item2, item3, item4) = FocusRequester.createRefs()

    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        OtpChar(
            modifier = Modifier.focusRequester(item1),
            focusRequester = item2,
            onValueChange = { newChar -> otp[0] = newChar }
        )
        OtpChar(
            modifier = Modifier.focusRequester(item2),
            focusRequester = item3,
            onValueChange = { newChar -> otp[1] = newChar }
        )
        OtpChar(
            modifier = Modifier.focusRequester(item3),
            focusRequester = item4,
            onValueChange = { newChar -> otp[2] = newChar }
        )
        OtpChar(
            modifier = Modifier.focusRequester(item4),
            focusRequester = FocusRequester.Cancel,
            onValueChange = { newChar -> otp[3] = newChar }
        )
    }


}
