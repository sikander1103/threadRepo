package com.example.loginui.app.screens.homepage.model

import com.example.loginui.R

data class NavItem(
    val selectedIcon:Int,
    val unselectedIcon:Int,
    val route:String,
    val lable:String
)

val listofNavItems: List<NavItem> = listOf(

    NavItem(
        unselectedIcon = R.drawable.homeoutlinedicon,
        selectedIcon = R.drawable.homefilledicon,
        route = Screens.HomeScreen.name,
        lable = "Home"
    ),
    NavItem(
        unselectedIcon = R.drawable.searchfilleicon,
        selectedIcon = R.drawable.searchoutlinedicon,
        route = Screens.SearchScreen.name,
        lable = "searh screen"
    ),
    NavItem(
        unselectedIcon = R.drawable.writeoutlinedicon,
        selectedIcon = R.drawable.writefilledicon,
        route = Screens.WriteScreen.name,
        lable = "write screen"
    ),
    NavItem(
        unselectedIcon = R.drawable.likeoutlinedicon,
        selectedIcon = R.drawable.likefilledicon,
        route = Screens.LikeScreen.name,
        lable = "Likescreen"
    ),
    NavItem(
        unselectedIcon = R.drawable.accountoutlinedicon,
        selectedIcon = R.drawable.accountfilledicon,
        route = Screens.AccountScreen.name,
        lable = "Accountscreen"
    ),


)