package com.example.loginui.app.screens.homepage.view.navpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.homepage.components.CustomTextfieldButton
import com.example.loginui.app.screens.homepage.components.navpagescarditems.Carditem2
import com.example.loginui.app.screens.homepage.model.botttomnavpagesmodel.DummyData
import com.example.loginui.ui.theme.backgroundcolorofscreens

@Composable
fun SearchScreen(navController: NavHostController) {
    val data= DummyData()
    Column(
        modifier = Modifier
            .background(backgroundcolorofscreens)
    ) {
        Spacer(modifier = Modifier.height(12.dp))
       Row(modifier = Modifier
           .fillMaxWidth()
           .padding(start = 20.dp, end = 20.dp)
       ) {
           CustomTextfieldButton(text = "Search") {

               navController.navigate("SearchBoxScreen")
           }
       }
       LazyColumn(modifier = Modifier.fillMaxSize() ){
           itemsIndexed(data){index, item ->
               Spacer(modifier = Modifier.height(12.dp))
               Carditem2(item)
           }
       }
    }
}