package com.example.curation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curation.Data.Data
import com.example.curation.RecyclerView.FlowerRecyclerAdapter
import com.example.curation.databinding.ActivityMainBinding
import com.example.curation.utils.Constants.TAG

// release

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var adapter: FlowerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        데이터 갱신
        Log.d(TAG, "MainActivity - Data 업데이트 전")
        adapter = FlowerRecyclerAdapter(this)
        Data.dataUpdate(this, adapter)
        Log.d(TAG, "MainActivity - Data 업데이트 후")

        binding.tempBtn.setOnClickListener {
            Data.dataSort()
            adapter.notifyDataSetChanged()
        }

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
