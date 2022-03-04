package com.example.boomguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Toast
import com.example.boomguess.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding //lateinit 晚點給
        override fun onCreate(savedInstanceState: Bundle?) { //oncreate 一定會被執行
            super.onCreate(savedInstanceState)
            binding=ActivityMainBinding.inflate(layoutInflater)//宣告取得外觀中的變數
            setContentView(binding.root)
        }



        fun inputnum(view: View) {
        val num=binding.guessnum.text.toString().toInt()
        Log.d("you guess",num.toString())
        Toast.makeText(this,num.toString(),Toast.LENGTH_LONG).show()//小訊息顯示較長時間的num值
    }


    }

