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

        //임시
        binding.detailName.setText("안뇽")
        Glide.with(this)
            .load(Data.flowerData[0].profileImage) // 불러올 이미지 url
            .placeholder(R.drawable.ic_launcher_background) // 이미지 로딩 시작하기 전 표시할 이미지
            .error(R.drawable.ic_launcher_background) // 로딩 에러 발생 시 표시할 이미지
            .fallback(R.drawable.ic_launcher_background) // 로드할 url 이 비어있을(null 등) 경우 표시할 이미지 +) .circleCrop() // 동그랗게 자르기
            .into(binding.detailProfileImage) // 이미지를 넣을 뷰
    }
}
fun main(){
    Data.dataUpdate()
    var index: Int = 0

    println(Data.flowerData[index].name)
    Data.flowerData[index].language
    Data.flowerData[index].content
}