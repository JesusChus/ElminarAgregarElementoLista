package com.chusdevil.eliminarelementolista

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    private val texto = mutableListOf<String>()
    private val adapter = ListaAdapter(texto, borrarElemento = { borrarItem(it) })


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaAdapter = findViewById<RecyclerView>(R.id.rvLista)

        repeat(10) {
            texto.add("")
        }

        listaAdapter.layoutManager = LinearLayoutManager(this)
        listaAdapter.adapter = adapter

        val boton : Button = findViewById(R.id.btnBoton)
        boton.setOnClickListener {
            agregarElemento()
            adapter.notifyDataSetChanged()
        }

    }

    private fun agregarElemento(){
        texto.add("")
    }

    private fun borrarItem(position: Int) {
        texto.removeAt(position)
        adapter.notifyItemRemoved(position)
    }


}