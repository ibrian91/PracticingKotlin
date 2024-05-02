package com.example.myfirstapp.myfirstapp.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class ListaHolder (v: View) : RecyclerView.ViewHolder(v) {

var itemImage:ImageView
var itemTitle: TextView
var itemDetail: TextView

init {
    itemImage = itemView.findViewById(R.id.item_image)
    itemTitle = itemView.findViewById(R.id.item_title)
    itemDetail = itemView.findViewById(R.id.item_detail)
}







}