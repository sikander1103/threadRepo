package com.example.loginui.app.screens.homepage.components.navpagescarditems

import CardItemData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.loginui.app.screens.homepage.components.CustomnLikeandbookmarkButton
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton
import com.example.loginui.app.components.auth.commoncomponent.Profilecaption
import com.example.loginui.app.components.auth.commoncomponent.Profilename
import com.example.loginui.app.components.auth.commoncomponent.likeandreplies
import com.example.loginui.app.components.auth.commoncomponent.username
import com.example.loginui.R

@Composable
fun CardItem(items:CardItemData, navController: NavController,){


    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 18.dp, end = 18.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .padding(top = 12.dp, start = 13.dp, end = 13.dp, bottom = 12.dp),
            verticalArrangement = Arrangement.Center
            ) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
                ) {

                if (items.profilepic != null)  Image(painter = painterResource(id = items.profilepic), contentDescription ="", modifier = Modifier
                    .clip(
                        CircleShape,
                    )
                    .height(32.dp)
                    .width(32.dp),
                    contentScale = ContentScale.Crop
                )  else  Image(painter = painterResource(id = R.drawable.noprofile), contentDescription ="", modifier = Modifier
                    .clip(
                        CircleShape,
                    )
                    .height(32.dp)
                    .width(32.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(13.dp))
                Column(

                    ) {
                    Row(verticalAlignment = Alignment.CenterVertically){
                        Profilename(value = items.Idname)
                        Spacer(modifier = Modifier.width(5.dp))
                        if(items.verifiedtick!=null)
                        Image(painter = painterResource(id = R.drawable.verified),
                            contentDescription ="" ,
                            modifier = Modifier
                                .height(12.dp)
                                .width(12.dp))
                        else null
                    }
                    username(value = items.username)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    likeandreplies(value = "${items.mintes}m")
                    Spacer(modifier = Modifier.width(11.dp))

                    CustomnorippleBUtton(height =24.dp , width =19.dp , Color = Color.Transparent
                        , imageResId =R.drawable.threedots, onClick = {} , enableHapticFeedback = true)
                        

                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            if (items.post != null) Profilecaption(value = items.post)  else null
            Spacer(modifier = Modifier.height(12.dp))

                  (if (items.imageRes != null) painterResource(id = items.imageRes) else null)?.let {
                      Image(
                          painter = it,
                          contentDescription = "",
                          modifier = Modifier
                              .clip(RoundedCornerShape(10.dp))
                              .clickable() {

                                 // navController.navigate("PostDetailScreen1/${items.index}")
                                  navController.navigate("ImageDetailScreen/${items.index}")
                              }
                      )
                  }

            Spacer(modifier = Modifier.height(12.dp))
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

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    CustomnLikeandbookmarkButton(
                        height = 18.dp,
                        width =18.dp ,
                        Color = Color.Transparent,
                        iconunselected = R.drawable.bookmark1,
                        iconselected =R.drawable.bookmark2
                    ) {

                    }


                    }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth()) {
                likeandreplies(value = "${items.replies} replies")
                Spacer(modifier = Modifier.width(15.dp))
                likeandreplies(value = "${items.likes} likes")
            }
        }

    }
}