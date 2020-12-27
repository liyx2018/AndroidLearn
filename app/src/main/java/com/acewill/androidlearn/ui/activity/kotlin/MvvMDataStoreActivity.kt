package com.acewill.androidlearn.ui.activity.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acewill.androidlearn.R
import java.lang.StringBuilder

class MvvMDataStoreActivity : AppCompatActivity() {

    val name by lazy {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvv_m_data_store)
        init()
    }

    private fun init() {

        mapOf("001" to 12, "002" to 15)

       val sb = StringBuilder()
        sb.apply {
            append("liyaxi")
            append("zhangsna")
            append("liyaxi")
        }

    }

}