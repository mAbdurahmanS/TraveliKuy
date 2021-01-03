package com.example.travelikuy

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_intent_hotel.view.*
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.item.view.tv_location
import kotlinx.android.synthetic.main.item.view.tv_title

class MyAdapter (val arrayList: ArrayList<Model>, val context: Context): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(model:Model){

            itemView.tv_title.text = model.title
            itemView.tv_location.text = model.location
            itemView.img_view.setImageResource(model.img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            val model = arrayList.get(position)

            var gTitle : String = model.title
            var gLocation : String = model.location
            var gImg : Int = model.img

            val intent = Intent(context, IntentHotel::class.java)

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iLocation", gLocation)
            intent.putExtra("iImg", gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}