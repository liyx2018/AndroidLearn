package com.acewill.androidlearn.utils

/**
 * 扩展函数
 */
fun String.getletterlength():Int{
    var count = 0
    for (str in this){
        if (str.isLetter()){
            count ++
        }

    }
    return count
}