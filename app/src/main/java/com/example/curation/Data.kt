package com.example.curation

object Data {
    val flowerData = ArrayList<FlowerModel>()

//    꽃 데이터 갱신 -> 꽃 데이터 다시 받아오기
    fun dataUpdate() {
//        더미 데이터 생성
    for (i in 1..10){
        flowerData.add(FlowerModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU",
            "강장미꽃",
            "사랑, 아름다움, 낭만적인",
            "100자 이상 - 로마인들은 장미를 재배해서 로사 겔리카(Rosa gallica)라고 이름을 붙였다. 신랑 신부들은 장미 관을 쓰기도 했으며, 로마의 귀족 여자들은 장미꽃을 찜질 약으로 사용하면 주름을 없애준다고 믿었으며, 거의 화폐로 사용하다시피 했다. 장미용액이 취기를 없애줄 것이라는 생각에 포도주를 마실 때 잔에 띄우기도 하고, 전쟁에 승리한 군대는 거리의 발코니에 모인 군중들로부터 장미꽃잎 세례를 받았으며, 또 장미는 영원한 생명과 부활을 나타낸다고 생각해서 장례식에 사용되거나 묘지에 재배되기도 했다. 이 시기에 시작된 천장부터 늘어뜨린 장미아래서 주고 받은 이야기는 절대적으로 비밀을 지켜야 한다는 관습이 오늘날까지 전해 오고 있다.",
            arrayListOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU")))
        flowerData.add(FlowerModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU",
            "나장미꽃",
            "사랑, 아름다움, 낭만적인, 변하지 않는 사랑, 질투, 시기, 이별, 첫사랑 고백, 수줍음, 행복한 사랑",
            "50자 이상 100자 미만 - 로마인들은 장미를 재배해서 로사 겔리카(Rosa gallica)라고 이름을 붙였다. 신랑 신부들은 장미 관을 쓰기도 했으며, 로마의 귀족 여자들은 장미꽃을 찜질 약으로 사용하면 주름을 없애준다고 믿었으며",
            arrayListOf("")))
        flowerData.add(FlowerModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU",
            "다장미꽃",
            "사랑",
            "50자 미만 - 로마인들은 장미를 재배해서 로사 겔리카(Rosa gallica)라고 이름을 붙였다. ",
            arrayListOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmmpU1dFWAyZgqaiYepS2c8_b1RyA62-TxE2pME5whZHqq8mAfZjgxCfKXIfQOBRQzA4E&usqp=CAU")))
    }
//        서버에서 받은 데이터 갱신

    }
//    꽃 데이터 정렬 -> 꽃의 이름 순으로 정렬함
    fun dataSort() {

    }
//    꽃 데이터 탐색 -> detail page를 들어갈 때 꽃의 이름을 통해서 전달해 줌
/*
    fun dataSearch(id: String): FlowerModel {
        var dcount = flowerData.count()-1
        var index: Int

        for (i in 0..dcount){


            index = i
        }
        return flowerData[i]    //원하는 데이터의 index를 참조해서 알려줌 ?
    }
*/
}