package com.example.loginui.app.res.routes



import SignupViewModel
import android.annotation.SuppressLint
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginui.app.screens.auth.forgotscreen.view.Forgotscreen
import com.example.loginui.app.screens.auth.forgotscreen.view.Resetscreen
import com.example.loginui.app.screens.auth.forgotscreen.viewmodel.ForgotViewModel
import com.example.loginui.app.screens.auth.forgotscreen.viewmodel.ResetViewModel
import com.example.loginui.app.screens.auth.login.view.SigninScecondScreen
import com.example.loginui.app.screens.auth.login.view.Signupscreen
import com.example.loginui.app.screens.auth.login.viewmodel.LoginViewModel
import com.example.loginui.app.screens.auth.signup.View.SigninScreen
import com.example.loginui.app.screens.homepage.view.homepage.HomepageView
import com.example.loginui.app.screens.splash.view.splashscreen
import com.example.loginui.app.screens.splash.viewmodel.Splashviewmodel
@SuppressLint("SuspiciousIndentation")
@Composable
fun Nav(){

    val navController= rememberNavController()

    val viewModel1 = viewModel<LoginViewModel>()
    val viewModel2 = viewModel<SignupViewModel>()
    val viewModel3 = viewModel<ForgotViewModel>()
    val viewModel4 = viewModel<ResetViewModel>()
    val viewModel5 = viewModel<Splashviewmodel>()

        NavHost(navController =navController , startDestination = "splashscreen",
            enterTransition = {
                EnterTransition.None
            },
            exitTransition = {
                ExitTransition.None
            }

            ){

            composable(route="splashscreen",

                ){
                splashscreen(viewModel = viewModel5,navController)

            }
            composable(route="Resetscreen"){
                Resetscreen(viewModel = viewModel4,navController)

            }
            composable(route="HomepageView"){
                HomepageView()

            }



            composable(route="Signinscreen"){
           SigninScreen(navController)
       }
            composable(route="Signinsecondscreen"){
                SigninScecondScreen( viewModel =viewModel1,navController )
            }
            composable(route="Signupscreen"){
                Signupscreen(navController,viewModel=viewModel2)
            }


            composable(route="forgotscreen"){
            Forgotscreen(navController,viewModel=viewModel3)
            }
        }

}
