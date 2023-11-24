package com.example.loginui.app.screens.homepage.components.commentdetail


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.loginui.app.screens.homepage.components.CustomnLikeandbookmarkButton
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton
import com.example.loginui.app.components.auth.commoncomponent.Profilename
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun CommentItem(comment: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundcolorofscreens)
            .clip(RoundedCornerShape(15.dp))
    ) {


        Card(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.White)) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.profilepic)
                        , contentDescription ="" ,
                        modifier = Modifier.size(height = 34.dp, width = 34.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Profilename(value = "Comment Test")
//                        Text(text = comment,
//                            fontFamily = FontFamily(Font(R.font.sfprodisplay))
//                        ),
                        Text(text = comment, fontFamily = FontFamily(Font(R.font.sfprodisplay)))
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
                            CustomnLikeandbookmarkButton(
                                height = 24.dp,
                                width =24.dp ,
                                Color = Color.Transparent ,
                                iconunselected = R.drawable.heart1,
                                iconselected =R.drawable.heart2
                            ) {

                            }
                            Spacer(modifier = Modifier.width(15.dp))

                            CustomnorippleBUtton(height = 24.dp, width =24.dp , Color = Color.Transparent ,
                                imageResId =R.drawable.message, enableHapticFeedback = false, onClick = {} )


                            Spacer(modifier = Modifier.width(15.dp))

                            CustomnorippleBUtton(height = 24.dp, width =24.dp , Color = Color.Transparent ,
                                imageResId =R.drawable.repost, enableHapticFeedback = false, onClick = {} )
                            Spacer(modifier = Modifier.width(15.dp))

                            CustomnorippleBUtton(height = 24.dp, width =24.dp , Color = Color.Transparent , imageResId =R.drawable.send,
                                enableHapticFeedback = false, onClick = {} )
                        }
                    }
                }
            }
        }
    }
}