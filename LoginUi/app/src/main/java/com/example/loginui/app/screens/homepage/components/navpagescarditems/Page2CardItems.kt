package com.example.loginui.app.screens.homepage.components.navpagescarditems

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.loginui.app.screens.homepage.components.FollowCustomButton
import com.example.loginui.app.screens.homepage.model.botttomnavpagesmodel.Page2CardItem
import com.example.loginui.app.components.auth.commoncomponent.Followersmutaul
import com.example.loginui.app.components.auth.commoncomponent.Profilename
import com.example.loginui.app.components.auth.commoncomponent.mutaulFollowers
import com.example.loginui.app.components.auth.commoncomponent.username
import com.example.loginui.R
import com.example.loginui.ui.theme.darkbrown

@Composable
fun Carditem2(items:Page2CardItem
){

    Card(modifier = Modifier
        .padding(start = 20.dp, end = 20.dp)
        .fillMaxWidth(),

        shape = RoundedCornerShape(10.dp),

        ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF))
            .padding(10.dp)
        ) {
            if (items.ProfileImage!=null)
            Image(painter = painterResource(id = items.ProfileImage), contentDescription ="", modifier = Modifier
                .height(48.dp)
                .width(48.dp).clip(CircleShape), contentScale = ContentScale.Crop )
            else  Image(painter = painterResource(id =R.drawable.noprofile), contentDescription ="", modifier = Modifier
                .height(48.dp)
                .width(48.dp).clip(CircleShape), contentScale = ContentScale.Crop )
            Spacer(modifier = Modifier.width(13.dp))
            Column() {
                Profilename(value = items.ProfileName)
                username(value = items.username)
                Row {
                    Followersmutaul(value = "${items.FollowersNumbers} followers")
                    mutaulFollowers(value = " mutual followers")
                }
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                FollowCustomButton(text = "Follow", bgColor = Color.White, textcolor = darkbrown) {

                }
            }
        }

    }

}