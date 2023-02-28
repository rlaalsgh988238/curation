package com.example.curation.detailPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.curation.Data.Data
import com.example.curation.R
import com.example.curation.databinding.ActivityDetailBinding
import com.example.curation.utils.Constants.TAG

class DetailActivity : AppCompatActivity() {
    private var DeatailActivityBinding: ActivityDetailBinding? = null
    private val binding get() = DeatailActivityBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "DetailActivity - onCreate() 실행")
        super.onCreate(savedInstanceState)
        DeatailActivityBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        해당 하는 데이터의 id 값 전달
        Log.d(TAG, "DetailActivity - id 값 전달")
        val index = intent.getIntExtra("index", 0)
//        id값을 통해 Data에서 값을 찾아 따로 저장
        Log.d(TAG, "DetailActivity - id 값을 통해 data 찾기")
        val data = Data.dataSearch(index)

        Log.d(TAG, "DetailActivity - 이미지 생성")
        binding.detailName.setText(data.name)
        Glide.with(this)
            .load(data.profileImage) // 불러올 이미지 url
            .placeholder(R.drawable.ic_launcher_background) // 이미지 로딩 시작하기 전 표시할 이미지
            .error(R.drawable.ic_launcher_background) // 로딩 에러 발생 시 표시할 이미지
            .fallback(R.drawable.ic_launcher_background) // 로드할 url 이 비어있을(null 등) 경우 표시할 이미지 +) .circleCrop() // 동그랗게 자르기
            .into(binding.detailProfileImage) // 이미지를 넣을 뷰
    }
}
