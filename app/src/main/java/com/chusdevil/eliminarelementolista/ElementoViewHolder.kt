package com.chusdevil.eliminarelementolista

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ElementoViewHolder(private val view :View) : ViewHolder(view){

    private val elemento = view.findViewById<TextView>(R.id.tvElemento)

    fun ingresarDatos (datos: String, borrarElemento: (Int) -> Unit){
        elemento.text = datos
        elemento.setOnClickListener{ borrarElemento(adapterPosition)}
    }

}