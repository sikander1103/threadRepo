package com.example.loginui.app.screens.homepage.view.navpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.loginui.app.screens.homepage.viewmodel.SearchBoxViewModel
import com.example.loginui.app.components.auth.commoncomponent.textfields.CustomtextFieldnew
import com.example.loginui.ui.theme.backgroundcolorofscreens

@Composable
fun SearchBoxScreen(viewModel: SearchBoxViewModel, navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundcolorofscreens)
        
    ) {
         
        Column() {
            Spacer(modifier = Modifier.height(12.dp))
            CustomtextFieldnew(label ="Search" , value =viewModel.searchfield.value , onValueChange ={ Searchfield -> viewModel.searchfieldstate(Searchfield) } )

        }
        
    }
}