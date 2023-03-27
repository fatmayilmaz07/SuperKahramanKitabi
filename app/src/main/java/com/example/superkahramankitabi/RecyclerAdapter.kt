package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(
    val kahramanListesi: ArrayList<String>,
    val kahramanGorselleri: ArrayList<Int>
) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    // private lateinit var tasarim : AdapterViewBindingAdapter

    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater, LayoutInflater, MenuInflater
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return SuperKahramanVH(itemView)

    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        // holder.itemView.rc_text.text = kahramanListesi.get(position)
        holder.itemView.findViewById<TextView>(R.id.rc_text).text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))

            holder.itemView.context.startActivity(intent)
        }

    }
}
