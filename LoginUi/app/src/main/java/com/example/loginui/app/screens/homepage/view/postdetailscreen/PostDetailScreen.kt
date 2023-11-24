package com.example.loginui.app.screens.homepage.view.postdetailscreen

import CardItemData
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.homepage.components.CustomnorippleBUtton
import com.example.loginui.app.screens.homepage.components.navpagescarditems.DetailScreenCardItem
import com.example.loginui.app.screens.homepage.components.commentdetail.CommentItem
import com.example.loginui.app.screens.homepage.viewmodel.PostdetailVm
import com.example.loginui.app.components.auth.commoncomponent.Profilename
import com.example.loginui.app.components.auth.commoncomponent.spacerBox
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomThreadField
import com.example.loginui.R
import com.example.loginui.ui.theme.backgroundcolorofscreens

@RequiresApi(Build.VERSION_CODES.Q)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostDetailScreen1(cardItemData: CardItemData, navController: NavHostController, viewModel: PostdetailVm) {
    val comments = remember { mutableStateListOf<String>() }
    var commenttext =viewModel.addthread.value
    LocalView.current

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {

               Row(
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(IntrinsicSize.Min),
                   horizontalArrangement = Arrangement.SpaceBetween,
                   verticalAlignment = Alignment.CenterVertically
               ) {
                   CustomThreadField(
                       label = "Add Thread",
                       value = viewModel.addthread.value,
                       onValueChange = { newAddThread -> viewModel.addthreadstate(newAddThread) }){
                       if (commenttext.isNotEmpty()){
                           comments.add(commenttext)
                           commenttext=""
                           viewModel.addthreadstate("")

                       }
                   }

               }

                }
     
            


        }
    ) {paddingvalue->
        Column(
            modifier = Modifier
                .padding(paddingvalue)
                .fillMaxSize()
                .background(Color.White)
        ) {
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CustomnorippleBUtton(height = 24.dp, width =24.dp , Color = Color.Transparent ,
                    imageResId =R.drawable.backarrownew, enableHapticFeedback = false, onClick = {navController.popBackStack()} )

                Profilename(value = "Thread")
                spacerBox(height = 24.dp, width = 24.dp, color = Color.White)
            }
            DetailScreenCardItem(cardItemData)
           Box(modifier = Modifier
               .fillMaxSize()
               .background(backgroundcolorofscreens)) {
               LazyColumn(modifier = Modifier.padding(top = 16.dp, start = 20.dp, end = 20.dp)) {
                   items(comments) { comment ->
                       CommentItem(comment = comment)
                       Spacer(modifier = Modifier.height(16.dp))

                   }
               }
           }

        }
    }
}
