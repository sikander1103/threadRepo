package com.example.loginui.app.components.auth.commoncomponent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.loginui.app.res.AppFonts

import com.example.loginui.ui.theme.blackColor

import com.example.loginui.ui.theme.graycolor

@Composable
fun Heading(value: String){
    Text(
        text = value,
        style = AppFonts.HeadingTextStyle,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun joinnow(value: String){
    Text(
        text = value,
        style = AppFonts.Joinnowtext,
        color = Color.Black,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Newpost(value: String){
    Text(
        text = value,
        style = AppFonts.profilename,
        color = Color.Black,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Profilename(value: String){
    Text(
        text = value,
        style = AppFonts.profilename,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Followersmutaul(value: String){
    Text(
        text = value,
        style = AppFonts.followersandmutaul,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun mutaulFollowers(value: String){
    Text(
        text = value,
        style = AppFonts.followersandmutaul,
        color = graycolor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Profilecaption(value: String){
    Text(
        text = value,
        style = AppFonts.profilecaption,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun username(value: String){
    Text(
        text = value,
        style = AppFonts.Username,
        color = graycolor,
        textAlign = TextAlign.Start
    )

}
@Composable
fun likeandreplies(value: String){
    Text(
        text = value,
        style = AppFonts.likeandreplies,
        color = graycolor,
        textAlign = TextAlign.Start
    )

}
@Composable
fun Authscreenheader(value: String){
    Text(
        text = value,
        style = AppFonts.Joinnowtext,
        color = Color.Black,
        textAlign = TextAlign.Start
    )
}
@Composable
fun textfieldheader(value: String){
    Text(
        text = value,
        style = AppFonts.Usernametext,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Forgotpassword(value: String){
    Text(
        text = value,
        style = AppFonts.Usernametext,
        color = Color.Black,
        textAlign = TextAlign.Start
    )
}
@Composable
fun Password(value: String){
    Text(
        text = value,
        style = AppFonts.Usernametext,
        color = blackColor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun usernameandpasswordtextfield(value: String){
    Text(
        text = value,
        style = AppFonts.Usernameandpasswordtext,
        color = graycolor   ,
        textAlign = TextAlign.Start
    )
}

@Composable
fun bodytext(value: String){
    Text(
        text = value,
        style = AppFonts.loginscreentextstyle,
        color = graycolor,
        textAlign = TextAlign.Start
    )
}
@Composable
fun createbuttontext(value: String){
    Text(
        text = value,
        style = AppFonts.createaccounttext,
        color = Color.White,
        textAlign = TextAlign.Start
    )
}
@Composable
fun orbuttontext(value: String) {
    Text(
        text = value,
        style = AppFonts.Ortext,
        color = blackColor,
        textAlign = TextAlign.Center,

    )
}



