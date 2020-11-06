package com.acewill.androidlearn.repository

import android.content.Context
import androidx.core.content.edit
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/10/2
 *     desc  :
 *
 *     SharedPreferences 文件存放目录: /data/data/<包名>/shared_prefs
 *     hi-dhl 的公众号：ByteCode
 *
 * </pre>
 */
@OptIn(ExperimentalCoroutinesApi::class)
class SharedPreferencesRepository(context: Context) : IRepository {

    val sp = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    override fun saveData(key: String) {
        sp.edit {
            val value = !readData(key)
            putBoolean(key, value)
        }
    }

    override fun readData(key: String): Boolean {
        return sp.getBoolean(key, false)
    }

    companion object {
        val PREFERENCE_NAME = "Preferences"
    }
}