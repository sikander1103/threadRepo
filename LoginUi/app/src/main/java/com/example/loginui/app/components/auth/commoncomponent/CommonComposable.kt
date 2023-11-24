package com.example.loginui.app.components.auth.commoncomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginui.R
import com.example.loginui.ui.theme.blackColor
import com.example.loginui.ui.theme.darkbrown

@Composable
fun CustomButton(
    firaSansFamily: FontFamily = FontFamily(
        Font(R.font.sfprodisplay)
    ),
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(56.dp)
            .background(darkbrown)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(

            text = text,
            color = Color.White,
            fontSize = 14.sp,
            fontFamily = firaSansFamily

        )
    }
}
@Composable
fun Buttonwithouticon(
    sfpproFamily: FontFamily = FontFamily(
        Font(R.font.sfprodisplay)
    ),
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(

            text = text,
            color = blackColor,
            fontSize = 14.sp,
            fontFamily = sfpproFamily

            )
    }
}
@Composable
fun ButtonwithIcon(
    sfpproFamily: FontFamily = FontFamily(
        Font(R.font.sfprodisplay)
    ),
    painterResource:Painter,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White)
            .clickable { onClick() }
            .padding(start = 29.dp, top = 16.dp, bottom = 16.dp, end = 29.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource, contentDescription ="", modifier = Modifier
            .width(24.dp)
            .height(24.dp)
            .align(alignment = Alignment.CenterStart) )
        Text(
                   text = text,
                   color = blackColor,
                   fontSize = 14.sp,
                   fontFamily = sfpproFamily,
            modifier = Modifier.align(alignment = Alignment.Center)
               )
    }
}


@Composable
fun spacerBox(
    height: Dp,
    width: Dp,
    color:Color
){
 Box(
     modifier = Modifier.height(height).width(width).background(color)

 ) {

 }
}