package com.example.loginui.app.screens.homepage.view.navpages
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.homepage.components.navpagescarditems.CardItem
import com.example.loginui.app.screens.homepage.components.logoandprofile
import com.example.loginui.ui.theme.backgroundcolorofscreens
import generateDummyData
@Composable
fun HomeScreen(navController: NavHostController) {
    val data = generateDummyData()

    Box(
        modifier = Modifier
            .background(backgroundcolorofscreens)
    ) {

         val  liststate= rememberLazyListState()

        LazyColumn(

            modifier = Modifier
                .fillMaxSize(),
            state = liststate

        ) {
          item {
              logoandprofile()
          }
            itemsIndexed(data) {index,
                    item ->
                Spacer(modifier = Modifier.height(11.dp))
                CardItem(item, navController)
                Spacer(modifier = Modifier.height(12.dp))
            }


        }
    }




}

