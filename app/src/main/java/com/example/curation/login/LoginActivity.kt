package com.example.curation.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.curation.MainActivity
import com.example.curation.R
import com.example.curation.databinding.ActivityLoginBinding
import com.example.curation.utils.Constants

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(Constants.TAG, "LoginActivitiy")

        binding.login.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }



    }
}