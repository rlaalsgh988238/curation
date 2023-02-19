package com.example.curation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curation.databinding.ActivityMainBinding
import com.example.curation.detailPage.DetailActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var adapter: FlowerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        데이터 갱신
        Data.dataUpdate()
//        Data.flowerData.sortedWith(Comparator(OrderKoreanFirst::compare))
//        Data.flowerData.sortWith(Comparator(OrderKoreanFirst::compare))
        adapter = FlowerRecyclerAdapter(this)

//        리사이클러 뷰 생성
        makeRecyclerView()
    }

//    리사이클러 뷰 생성
    private fun makeRecyclerView() {
        binding.flowerRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.flowerRecyclerView.adapter = adapter
    }

//    -> 정렬순서를 정할 수 있는 화면 필요할 것 같습니다!
}
