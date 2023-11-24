package com.example.loginui.app.components.auth.SignUp

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle


@Composable
fun CheckBoxComponents(value: String){
Row(modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.Start
    ) {
 val checkState= remember {
     mutableStateOf(false)
 }
    Checkbox( checked = checkState.value, onCheckedChange ={checkState.value=!checkState.value} )
    texttouch(value = value)
}
}
@Composable
fun texttouch(value: String){
    val initialText="By continuing you accept our"
    val privacypolicytext=" Privacy Policy "
    val andText=" and "
    val termsandpolicy="Terms of use"
    val annotatedString= buildAnnotatedString {
     append(initialText)
     withStyle(style = SpanStyle(color = Color.Blue)){
         pushStringAnnotation(tag = privacypolicytext, annotation = privacypolicytext)
         append(privacypolicytext)
     }
        append(andText)
        withStyle(style = SpanStyle(color = Color.Blue)){
            pushStringAnnotation(tag = termsandpolicy, annotation = termsandpolicy)
            append(termsandpolicy)
        }
    }
 ClickableText(text = annotatedString, onClick ={offset ->
     annotatedString.getStringAnnotations(offset,offset).firstOrNull()?.also {span ->

         Log.d("texttouch","{$span}")
     }
 } )
}
