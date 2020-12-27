package com.acewill.androidlearn.utils

import android.content.Context
import android.content.Intent

/**
 * 页面跳转
 */
inline fun < reified T> startActivity(context : Context){
    val intent = Intent(context,T::class.java)
    context.startActivity(intent)
}

/**
 * 页面跳转带参数
 */
inline fun < reified T> startActivity(context : Context,block:Intent.() -> Unit){
    val intent = Intent(context,T::class.java)
    intent.block()
    context.startActivity(intent)
}
