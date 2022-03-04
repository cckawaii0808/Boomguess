package com.example.boomguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.boomguess.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding //lateinit 晚點給
        override fun onCreate(savedInstanceState: Bundle?) { //oncreate 一定會被執行
            super.onCreate(savedInstanceState)
            binding=ActivityMainBinding.inflate(layoutInflater)//宣告取得外觀中的變數
            setContentView(binding.root)

        }

    var min = 1
    var max = 100
    var boom = Random.nextInt(100)

        fun inputnum(view: View) {
            var num = binding.guessnum.text.toString().toInt()

            val builder = AlertDialog.Builder(this)//產生builder物件

            Log.d("tips", boom.toString())
            Toast.makeText(this, boom.toString(), Toast.LENGTH_LONG).show()//小訊息顯示較長時間的num值

            if(num != boom) {
                when {
                    num > boom -> max = num
                    num < boom -> min = num
                }
                AlertDialog.Builder(this)
                    .setMessage("請輸入$min 到$max")//相當於印出字print
                    .setTitle("終極密碼")//標題文字
                    .setPositiveButton("我再想想",null)//對話ok按鈕
                    .show() //顯示對話筐
            }

                AlertDialog.Builder(this)
                    .setMessage("恭喜爆炸")//相當於印出字print
                    .setTitle("終極密碼")//標題文字
                    .setPositiveButton("哈哈", null)//對話ok按鈕
                    .show() //顯示對話筐




        }



        }




