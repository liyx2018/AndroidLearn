package com.acewill.androidlearn.ui.activity.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.acewill.androidlearn.R
import com.acewill.androidlearn.ui.adapter.kotlin.RecyclerViewSelectionAdapter
import kotlinx.android.synthetic.main.activity_recycler_view_selection.*
import java.util.*

class RecyclerViewSelectionActivity : AppCompatActivity() {

    private val adapter = RecyclerViewSelectionAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_selection)
        setView()
    }

    private fun setView() {
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.setHasFixedSize(true)
        rv_news.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        rv_news.adapter = adapter
        adapter.list = createRandomIntList()
        adapter.notifyDataSetChanged()
    }

    private fun createRandomIntList(): List<Int> {
        val random = Random()
        return (1..10).map { random.nextInt(15) }
    }



}