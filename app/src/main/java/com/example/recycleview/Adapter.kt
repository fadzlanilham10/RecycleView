package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<Adapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: Model){
            itemView.titleTv.text = model.title
            itemView.descriptionTv.text = model.des
            itemView.imageTv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener {
            if (position == 0){
                Toast.makeText(
                    context,
                    "Fadzlan Ilham",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 1){
                Toast.makeText(
                    context,
                    "Yayang Setiyawan",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 2){
                Toast.makeText(
                    context,
                    "Ziyan Fadilah",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 3){
                Toast.makeText(
                    context,
                    "Faqih Zada",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (position == 4){
                Toast.makeText(
                    context,
                    "Nurul Chotimah",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}