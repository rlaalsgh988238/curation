package com.example.curation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var modelList = ArrayList<FlowerModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..10){
            val myModel = FlowerModel(null,"장미 꽃 $i", null, null)
            this.modelList.add(myModel)
        }
    }
}