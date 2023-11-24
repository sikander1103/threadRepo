package com.example.loginui.app.screens.homepage.model.botttomnavpagesmodel

import com.example.loginui.R

data class Page2CardItem(
val ProfileImage:Int?,
val ProfileName:String,
val username:String,
val FollowersNumbers:Int


)
fun DummyData():List<Page2CardItem>{
    return listOf(
        Page2CardItem(null,"Taimoor Aslam","@taimoor_303",34),
        Page2CardItem(R.drawable.noti2,"Ali Ahmad","@Ali_03",10),
        Page2CardItem(R.drawable.noti3,"Alam Khan","@almkan_503",94)
    )
}