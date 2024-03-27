package com.chusdevil.eliminarelementolista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class ListaAdapter(val texto: MutableList<String>, val borrarElemento :(Int)-> Unit) : Adapter<ElementoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementoViewHolder {

        val elementoActivity = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_elemento_view_holder,parent,false)
        val elemento = ElementoViewHolder(elementoActivity)
        return elemento
    }

    override fun getItemCount(): Int {
        return texto.size
    }

    override fun onBindViewHolder(holder: ElementoViewHolder, position: Int) {
        holder.ingresarDatos(texto[position]+" $position")
        holder.itemView.setOnClickListener {
            borrarElemento(holder.adapterPosition)
        }

//        elemento.setOnClickListener{ borrarElemento(adapterPosition)}



    }

}