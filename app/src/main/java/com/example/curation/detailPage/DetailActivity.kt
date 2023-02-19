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

//        val index = intent.getIntExtra("index")

        binding.detailName.setText("안뇽")
    }
}
