package com.example.myfirstapp.myfirstapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.myfirstapp.R
import com.example.myfirstapp.myfirstapp.holders.ListaHolder

class RecyclerAdapter : RecyclerView.Adapter<ListaHolder>() {

    private var titles = arrayOf(
        "Chapter One","Chapter Two","Chapter Three","Chapter Four","Chapter Five","Chapter Six","Chapter Seven",
        "Chapter Eight","Chapter Nine","Chapter Ten","Chapter Eleven","Chapter Twelve","Chapter Thirteen","Chapter Fourteen")

    private var details = arrayOf(
        "Item one details","Item two details","Item three details","Item four details","Item five details","Item six details","Item seven details",
        "Item Eight details","Item Nine details","Item Ten details","Item Eleven details","Item Twelve details","Item Thirteen details","Item Fourteen details")

    private var images = intArrayOf(R.drawable.android,R.drawable.android,R.drawable.android,
        R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,
                R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaHolder {
        // esta funcion se encarga de inflar o traer a la realidad el xml del cardview que estuvimos que trabajando donde justamente
        // ahi es donde se va a apoyar la lista
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ListaHolder(v)
    }

    override fun onBindViewHolder(holder: ListaHolder, position: Int) {
        // asignamos los valores

        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    // el item count define la cantidad de veces que se va a repetir la imagen
    // en el recycler view

    override fun getItemCount(): Int {
        return titles.size
    }
}


