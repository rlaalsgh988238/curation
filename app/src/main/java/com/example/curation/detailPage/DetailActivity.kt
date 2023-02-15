package com.example.curation.detailPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.curation.Data
import com.example.curation.R
import com.example.curation.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var DeatailActivityBinding: ActivityDetailBinding? = null
    private val binding get() = DeatailActivityBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DeatailActivityBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.detailName.setText("안뇽")
    }
}
fun main(){
    Data.dataUpdate()
    var index: Int = 0

    Data.flowerData[index].name
    Data.flowerData[index].language
    Data.flowerData[index].content
}