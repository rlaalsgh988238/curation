package com.example.curation

class FlowerModel(
    var id: Int,
    var profileImage: String?,
    var name: String?,
    var language: String?,
    var content: String?,
    var stickImage: ArrayList<String>
) {
//    기본 생성자
    init {

    }
}

//flower id: Int인 파라미터 추가 필요!
//Data.search() 또한 이 flower_id로 찾을 예정