package com.papayacoders.bottomnavinjetpackcompose.screens

import android.accounts.Account
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph

@Destination<RootGraph>
@Composable
fun AccountScreen(){
    Text(text = "Account")

}