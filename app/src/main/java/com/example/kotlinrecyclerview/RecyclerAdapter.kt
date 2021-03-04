package com.example.kotlinrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //Image list
    private val images: IntArray
        get() {
            val intArrayOf = intArrayOf(
                R.drawable.cardview_1,
                R.drawable.cardview_2,
                R.drawable.cardview_3,
                R.drawable.cardview_4,
                R.drawable.cardview_5,
                R.drawable.cardview_6,
                R.drawable.cardview_7,
                R.drawable.cardview_8

            )
            return intArrayOf
        }

    //Title list
    private val titles = arrayOf(
        "Kani Roll",
        "Egg Chicken Roll",
        "Chicken Roll",
        "Ekkado",
        "Ebi Furai",
        "Chicken Karage",
        "Tori Ball",
        "Shrimp Roll"

    )

    //Detail list
    private val details = arrayOf(
        "Rp.32.000,00",
        "Rp.24.000,00",
        "Rp.38.000,00",
        "Rp.28.000,00",
        "Rp.31.000,00",
        "Rp.42.000,00",
        "Rp.37.000,00",
        "Rp.24.000,00"
    )

    //ViewHolder class
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.cardImage)
            itemTitle = itemView.findViewById(R.id.cardTitle)
            itemDetail = itemView.findViewById(R.id.cardDetail)

            itemView.setOnClickListener { v: View ->
                val context=itemView.context
                val intent = Intent( context, DetailsActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
    //onCreateViewHolder()
    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.row_main, ViewGroup, false)
        return ViewHolder(v)
    }

    //onBindViewHolder()
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    //getItemCount()
    override fun getItemCount(): Int {
        return titles.size
    }
}