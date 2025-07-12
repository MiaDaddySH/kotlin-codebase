//package com.junfengtech.compose_ui_showcase.pages
//
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.itemsIndexed
//import androidx.compose.material3.Divider
//import androidx.compose.material3.ListItem
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.navigation.NavHostController
//
//@Composable
//fun ComponentListScreen(navController: NavHostController) {
//    val components = listOf(
//        "Article Card" to "article_card"
//        // 未来可添加更多组件
//    )
//
//    LazyColumn {
//        itemsIndexed(components) { index, (label, route) ->
//            ListItem(
//                headlineContent = { Text(label) },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clickable { navController.navigate(route) }
//            )
//
//            if (index < components.lastIndex) {
//                Divider()
//            }
//        }
//    }
//
//}
