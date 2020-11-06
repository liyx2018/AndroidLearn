package com.acewill.androidlearn.ui.adapter.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.acewill.androidlearn.R

/**
 * @author: liyaxi
 * @date: 2020-11-06
 * @description:
 */
class RecyclerViewSelectionAdapter : RecyclerView.Adapter<RecyclerViewSelectionAdapter.ViewHolder>() {

    companion object {
        private val TAG = "RecyclerView"
    }

    var list: List<Int> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_selection,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var num =list[position]
        holder.tvName.text = num.toString()
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
         val tvName: TextView = view.findViewById(R.id.tv_name)
    }

}