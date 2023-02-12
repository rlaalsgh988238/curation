package com.example.curation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.curation.databinding.FlowerRecyclerViewItemBinding
import java.util.concurrent.Flow

class FlowerRecyclerAdapter(val context: Context, val datas: ArrayList<FlowerModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val list = datas

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        FlowerViewHolder(FlowerRecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val binding = (holder as FlowerRecyclerViewItemBinding)
//        holder.
    }

    override fun getItemCount(): Int  = list.size

}