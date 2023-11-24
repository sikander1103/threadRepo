package com.example.loginui.app.screens.homepage.view.navpages



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton
import com.example.loginui.app.screens.homepage.components.FollowCustomButton
import com.example.loginui.app.components.auth.commoncomponent.Newpost
import com.example.loginui.app.components.auth.commoncomponent.Profilename
import com.example.loginui.app.components.auth.commoncomponent.username
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens
import com.example.loginui.ui.theme.darkbrown

@Composable
fun WriteScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundcolorofscreens)

    ) {
        Column(modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
             ) {
          Spacer(modifier = Modifier.height(20.dp))
          Row(Modifier.fillMaxWidth(),
              horizontalArrangement = Arrangement.Start,
              verticalAlignment = Alignment.CenterVertically
              ) {
              CustomnorippleBUtton(height = 18.dp, width = 18.dp, Color = Color.Transparent ,
                  imageResId =R.drawable.closebutton, enableHapticFeedback = false, onClick = {navController.popBackStack()} )
              Spacer(modifier = Modifier.width(24.dp) )
         Newpost(value = "New Post")
              Row(modifier = Modifier.fillMaxWidth(),
                  horizontalArrangement = Arrangement.End,
                  verticalAlignment = Alignment.CenterVertically

              ) {
                  FollowCustomButton(bgColor = darkbrown, text = "Post", textcolor = Color.White) {

                  }
              }
          }
            Spacer(modifier = Modifier.height(24.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))


            ) {
             Column(modifier = Modifier
                 .background(Color.White)
                 .fillMaxWidth()
                 .padding(15.dp)

             ) {
                 Row {

                     Image(painter = painterResource(id = R.drawable.profilepic), contentDescription ="" , modifier = Modifier
                         .width(42.dp)
                         .height(42.dp))
                     Spacer(modifier = Modifier.width(15.dp))
                     Profilename(value = "Emma")
                 }
                  Spacer(modifier = Modifier.height(12.dp))
                 username(value = "Start a Thread")
             }



            }



        }

    }
}