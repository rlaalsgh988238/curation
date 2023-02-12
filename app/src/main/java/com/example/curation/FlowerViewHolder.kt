package com.example.curation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.curation.databinding.FlowerRecyclerViewItemBinding

class FlowerViewHolder(itemView: FlowerRecyclerViewItemBinding): RecyclerView.ViewHolder(itemView.root) {
    private val image = itemView.flowerImg
    private val name = itemView.flowerNameTxt
    private val language = itemView.flowerLanguageTxt
    private val story = itemView.flowerStoryTxt

//    기본 생성자
    init {

    }

//
    fun bind(myModel: FlowerModel){
        name.text = myModel.name
    }
}