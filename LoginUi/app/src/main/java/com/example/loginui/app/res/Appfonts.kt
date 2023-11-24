package com.example.loginui.app.res


import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.Font
import com.example.loginui.R

object AppFonts {
    val primaryFontFamily = FontFamily(Font(R.font.poppinsregular))
    val sfprodisplay = FontFamily(Font(R.font.sfprodisplay))
    val interfont = FontFamily(Font(R.font.interregular))


    val AuthbodyTextStyle = TextStyle(
        fontFamily = primaryFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)
    )

    val donthaveanaccountandcreateaccount = TextStyle(
        fontFamily = primaryFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight(weight = 700)

    )
    val Joinnowtext = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 20.sp,
        fontWeight = FontWeight(weight = 600)

    )
    val profilename = TextStyle(
        fontFamily = interfont,
        fontSize = 16.sp,
        fontWeight = FontWeight(weight = 600)

    )
    val Newpost = TextStyle(
        fontFamily = interfont,
        fontSize = 18.sp,
        fontWeight = FontWeight(weight = 500)

    )
    val followersandmutaul = TextStyle(
        fontFamily = interfont,
        fontSize = 12.sp,
        fontWeight = FontWeight(weight = 600)

    )
    val profilecaption = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)

    )
    val Username = TextStyle(
        fontFamily = interfont,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)

    )
    val likeandreplies = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)

    )
    val Usernametext = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 600)

    )
    val Usernameandpasswordtext = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 500)

    )
    val Logintoyour = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 20.sp,
        fontWeight = FontWeight(weight = 600)

    )
    val loginscreentextstyle= TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)

    )
    val HeadingTextStyle = TextStyle(
        fontFamily = primaryFontFamily,
        fontSize = 35.sp,
        fontWeight = FontWeight(weight = 400)
    )

    val buttonTextStyle = TextStyle(
        fontFamily = primaryFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
    val createaccounttext = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight(weight = 400)
    )
    val Ortext = TextStyle(
        fontFamily = sfprodisplay,
        fontSize = 13.sp,
        fontWeight = FontWeight(weight = 500)
    )
    // Add more font styles as needed

    // You can also create a composable function to apply a custom style
    @Composable
    fun CustomTextStyle(fontSize: Float, fontWeight: FontWeight) = remember {
        TextStyle(
            fontFamily = primaryFontFamily,
            fontSize = fontSize.sp,
            fontWeight = fontWeight
        )
    }
}