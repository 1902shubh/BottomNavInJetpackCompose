package com.papayacoders.bottomnavinjetpackcompose

import com.ramcosta.composedestinations.generated.destinations.AccountScreenDestination
import com.ramcosta.composedestinations.generated.destinations.FavouriteScreenDestination
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.generated.destinations.SearchScreenDestination

sealed class BottomNavItem(
    val title : String,
    val icon : Int,
    val route : String,
){
    data object Home : BottomNavItem(
        title = "Home",
        icon = R.drawable.ic_home,
        route = HomeScreenDestination.route
    )
    data object Search : BottomNavItem(
        title = "Search",
        icon = R.drawable.ic_search,
        route = SearchScreenDestination.route
    )
    data object Favourite : BottomNavItem(
        title = "Favourite",
        icon = R.drawable.ic_star,
        route = FavouriteScreenDestination.route
    )
    data object Account : BottomNavItem(
        title = "Account",
        icon = R.drawable.ic_profile,
        route = AccountScreenDestination.route
    )
}