package com.example.loginui.app.screens.homepage.view.homepage
import NoRippleInteractionSource

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.loginui.app.screens.homepage.components.CustomIcon
import com.example.loginui.app.screens.homepage.model.Screens
import com.example.loginui.app.screens.homepage.model.listofNavItems
import com.example.loginui.app.screens.homepage.view.imagedetailScreen.ImageDetailScreen
import com.example.loginui.app.screens.homepage.view.navpages.AccountScreen
import com.example.loginui.app.screens.homepage.view.navpages.HomeScreen
import com.example.loginui.app.screens.homepage.view.navpages.LikeScreen
import com.example.loginui.app.screens.homepage.view.navpages.SearchBoxScreen
import com.example.loginui.app.screens.homepage.view.navpages.SearchScreen
import com.example.loginui.app.screens.homepage.view.navpages.WriteScreen
import com.example.loginui.app.screens.homepage.view.postdetailscreen.PostDetailScreen1
import com.example.loginui.app.screens.homepage.viewmodel.PostdetailVm
import com.example.loginui.app.screens.homepage.viewmodel.SearchBoxViewModel
import com.example.loginui.ui.theme.backgroundcolorofscreens
import generateDummyData

@RequiresApi(Build.VERSION_CODES.Q)
@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageView() {
    val viewModel6 = SearchBoxViewModel()
    val navController: NavHostController = rememberNavController()
    var showBottomNavigation by remember { mutableStateOf(true) }

    DisposableEffect(navController) {
        val callback = NavController.OnDestinationChangedListener { _, destination, _ ->
            showBottomNavigation = when (destination.route) {
                Screens.HomeScreen.name,
//                Screens.SearchBoxScreen.name,
                Screens.SearchScreen.name,
//                Screens.WriteScreen.name,
                Screens.LikeScreen.name,
                Screens.AccountScreen.name -> true

                else -> false
            }
            }
        navController.addOnDestinationChangedListener(callback)
        onDispose {
            navController.removeOnDestinationChangedListener(callback)
        }
        }

        Scaffold(
            containerColor = backgroundcolorofscreens,


            bottomBar = {

                if (showBottomNavigation)
                    NavigationBar(
                        modifier = Modifier
                            .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
                            .height(62.dp)
                            .clip(
                                RoundedCornerShape(15.dp)
                            ),
                        containerColor = Color(0xFFFFFFFF),
                    ) {
                        val navBackStackEntry by navController.currentBackStackEntryAsState()
                        val currentDestination = navBackStackEntry?.destination
                        listofNavItems.forEach { navItem ->
                            NavigationBarItem(

                                interactionSource = NoRippleInteractionSource(),
                                //if i want to add color on selected item  ->  //   currentDestination?.hierarchy?.any { it.route == navItem.route } == true//
                                selected =false  ,

                                onClick = {
                                    navController.navigate(navItem.route) {
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            saveState = true
                                        }
                                        launchSingleTop = true
                                        restoreState = true

                                    }

                                },
                                icon = {
                                    if (currentDestination?.route == navItem.route) {
                                        CustomIcon(

                                            resourceId = navItem.selectedIcon,
                                            contentDescription = "",
                                            )
                                    } else {
                                        CustomIcon(
                                            resourceId = navItem.unselectedIcon,
                                            contentDescription = ""
                                        )
                                    }
                                },
                            )
                        }
                    }
            }

        ) { paddingvalue
            ->

            NavHost(
                navController = navController, startDestination = Screens.HomeScreen.name,
                enterTransition = {
                    // you can change whatever you want transition
                    EnterTransition.None
                },  exitTransition = {
                    // you can change whatever you want transition
                    ExitTransition.None
                },
                modifier = Modifier
                    .padding(paddingvalue),


                ) {

                composable(route = Screens.HomeScreen.name) {
                    HomeScreen(navController)
                }
                composable(route = Screens.SearchBoxScreen.name) {

                    SearchBoxScreen(viewModel = viewModel6, navController)

                }
                composable(route = Screens.SearchScreen.name) {
                    SearchScreen(navController)
                }
                composable(route = Screens.WriteScreen.name) {
                    WriteScreen(navController)
                }
                composable(route = Screens.LikeScreen.name) {
                    LikeScreen()
                }
                composable(route = Screens.AccountScreen.name) {
                    AccountScreen()
                }
                composable(route = "PostDetailScreen1/{index}",
                    arguments = listOf(navArgument("index"){ type= NavType.IntType })
                    )
                 {backStackEntry->
                     val selectedIndex= backStackEntry.arguments?.getInt("index")
                     val selectedData = generateDummyData().find { it.index == selectedIndex }
                     selectedData?.let { PostDetailScreen1(it,navController, PostdetailVm()) }

                 }
                composable(route = "ImageDetailScreen/{index}",
                    arguments = listOf(navArgument("index"){ type= NavType.IntType })
                )
                {backStackEntry->
                    val selectedIndex= backStackEntry.arguments?.getInt("index")
                    val selectedData = generateDummyData().find { it.index == selectedIndex }
                    selectedData?.let { ImageDetailScreen(it,navController) }

                }

            }
        }
    }









