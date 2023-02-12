package com.example.curation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var adapter: FlowerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        데이터 갱신
        Data.dataUpdate()
        adapter = FlowerRecyclerAdapter(this)

//        리사이클러 뷰 생성
        makeRecyclerView()
    }

    private fun makeRecyclerView() {
        binding.flowerRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.flowerRecyclerView.adapter = adapter
    }
}