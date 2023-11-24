package com.example.loginui.app.components.auth.signin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.loginui.app.components.auth.commoncomponent.orbuttontext
import com.example.loginui.R

@Composable
fun Ortext(){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        orbuttontext(value = stringResource(id = R.string.or))
    }
}




@Composable
fun ForgotPasswordText(
    onClick: () -> Unit

) {
    val text = buildAnnotatedString {
        withStyle(SpanStyle(color = Color.Black, fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.sfprodisplay)))) {
            append("Forgot Password?")
        }
    }

Box(
    modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.CenterEnd
) {
    ClickableText(

        text = text,
        onClick = {
            onClick()
        },
    )
}


}
