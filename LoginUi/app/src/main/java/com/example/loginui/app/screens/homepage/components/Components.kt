package com.example.loginui.app.screens.homepage.components
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginui.R
import com.example.loginui.ui.theme.darkbrown
import com.example.loginui.ui.theme.newgraycolor

@Composable
fun logoandprofile() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 18.dp, end = 18.dp, top = 12.dp)) {

        Image(
            painter = painterResource(id = R.drawable.profilepic),
            contentDescription = "",
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .height(44.dp)
                .width(44.dp)
                .align(alignment = Alignment.TopStart)
        )

        Image(
            painter = painterResource(id = R.drawable.tlogo2),
            contentDescription = "", modifier = Modifier
                .padding(7.dp)
                .height(30.dp)
                .align(alignment = Alignment.TopCenter)
        )
//     }

    }
}
@Composable
fun FollowCustomButton(
   bgColor: Color,
   textcolor:Color,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .border(border = BorderStroke(1.dp, darkbrown), shape = RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .background(bgColor)

            .clickable { onClick() }
            .padding(start = 19.dp, end = 19.dp, top = 5.dp, bottom = 5.dp)
            .wrapContentSize(Alignment.TopEnd),
           contentAlignment = Alignment.Center
        ) {
        Text(
            text = text,
            color = textcolor,
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sfprodisplay)),
            fontWeight = FontWeight(400)
        )
    }
}


@Composable
fun CustomTextfieldButton(

    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.White)
            .clickable() { onClick() }
            .padding(start = 16.dp, end = 16.dp, top = 15.dp, bottom = 15.dp)

        ,

    ) {
       Row(
           horizontalArrangement =Arrangement.Start,
           verticalAlignment = Alignment.CenterVertically,
       ) {
        Image(painter = painterResource(id = R.drawable.saerchicon1), contentDescription ="" )
           Spacer(modifier = Modifier.width(12.dp))
        Text(text = text, fontWeight = FontWeight(400), fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.interregular)), color = newgraycolor )
       }
    }
}
@Composable
fun CustomIcon(resourceId: Int, contentDescription: String) {

    Icon(

        painter = painterResource(id = resourceId),
        contentDescription = contentDescription,
        modifier = Modifier
            .height(32.dp)
            .width(32.dp)
        ,

        )
}
/////////////////////Test no splash button
@Composable
fun CustomnorippleBUtton(
    height:Dp,
    width:Dp,
    Color:Color,
    imageResId: Int,
    onClick: () -> Unit,
    enableHapticFeedback: Boolean = true


) {
    val interactionSource = remember { MutableInteractionSource() } // or use val interactionSource = MutableInteractionSource()
    val haptic = LocalHapticFeedback.current


    Box(
        modifier = Modifier
            .size(width = width, height = height)
            .background(
                color = Color,
                shape = RoundedCornerShape(percent = 16)
            )
            .clickable(

                interactionSource = interactionSource,
                indication = null
            ) {
                if (enableHapticFeedback){
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)}
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
       Image(painter = painterResource(id = imageResId), contentDescription = "")
    }
}
/////////////////////like and Book mark button without ripple effect/////////////////////
@Composable
fun CustomnLikeandbookmarkButton(
    height:Dp,
    width:Dp,
    Color:Color,
    iconunselected: Int,
    iconselected:Int,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() } // or use val interactionSource = MutableInteractionSource()
    val haptic = LocalHapticFeedback.current
    var isClicked by rememberSaveable { mutableStateOf(false) }


    Box(
        modifier = Modifier
            .size(width = width, height = height)
            .background(
                color = Color,
            )
            .clickable(

                interactionSource = interactionSource,
                indication = null
            ) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                isClicked = !isClicked
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
       // Image(painter = painterResource(id = imageResId), contentDescription = "")
        val imageResId = if (isClicked) iconselected else iconunselected
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .align(alignment = Alignment.BottomEnd)
        )
    }
}
