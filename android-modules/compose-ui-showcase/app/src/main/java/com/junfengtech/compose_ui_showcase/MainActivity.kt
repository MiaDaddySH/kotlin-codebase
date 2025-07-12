package com.junfengtech.compose_ui_showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junfengtech.compose_ui_showcase.ui.theme.ComposeuishowcaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeuishowcaseTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("Home Screen", fontSize = 24.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { }) {
                        Text("Go to ArticleCard")
                    }
                }
//
//                val navController = rememberNavController()
//                NavHost(
//                    navController = navController,
//                    startDestination = "home"
//                ) {
//                    composable("home") {
//                            Column(
//                                modifier = Modifier.fillMaxSize(),
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                                verticalArrangement = Arrangement.Center
//                            ) {
//                                Text("Home Screen", fontSize = 24.sp)
//                                Spacer(modifier = Modifier.height(16.dp))
//                                Button(onClick = { navController.navigate("article_card") }) {
//                                    Text("Go to ArticleCard")
//                                }
//                            }
//
////                        ComponentListScreen(navController)
//                    }
////                    composable("article_card") {
////                        ArticleCardScreen()
////                    }
//                }
////                CompositionLocalProvider(LocalNavController provides navController) {
//
//                }
            }
        }
    }
}

// 为了简化导航对象获取（可选）
//val LocalNavController = compositionLocalOf<NavHostController> {
//    error("NavController not provided")
//}