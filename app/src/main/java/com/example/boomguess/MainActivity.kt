package com.example.boomguess

import android.app.SearchManager
import android.content.DialogInterface
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
    val game=NumberGame()
    override fun onCreate(savedInstanceState: Bundle?) { //oncreate 一定會被執行
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//宣告取得外觀中的變數
        setContentView(binding.root)
    }
    /*
        var min = 1
        var max = 100
        var count = 0  //猜的次數
        var boom = Random.nextInt(100)

        fun Restart() {
            min = 1
            max = 100
            count = 0  //猜的次數
            boom = Random.nextInt(100)
            binding.guessnum.text.clear()//元件訊息框guessnum文字的清除
            binding.counter.text=("0")


        }

        fun inputnum(view: View) {
            var num = binding.guessnum.text.toString().toInt()
            count++
            binding.counter.text=("$count")
            val builder = AlertDialog.Builder(this)//產生builder物件

            Log.d("tips", boom.toString())
            Toast.makeText(this, boom.toString(), Toast.LENGTH_SHORT).show()//小訊息顯示較短時間的num值

            if (num != boom) {
                when {
                    num > boom -> max = num
                    num < boom -> min = num
                }
                AlertDialog.Builder(this)
                    .setMessage("請輸入$min 到$max ,已嘗試$count 次" )//相當於印出字print
                    .setTitle("終極密碼")//標題文字
                    .setPositiveButton("我再想想", null)//對話ok按鈕
                    .show() //顯示對話筐
                binding.guessnum.text.clear()
            } else if (num == boom) {

                AlertDialog.Builder(this)
                    .setMessage("恭喜爆炸")//相當於印出字print
                    .setTitle("終極密碼")//標題文字
                    .setPositiveButton("再玩一次") { dialog, which ->//選了對話按鈕後要做的事情
                        //也可以 .setPositiveButton("再玩一次") { d, w ->
                        Restart()

                        Toast.makeText(
                            this,
                            "炸彈已重設",
                            Toast.LENGTH_LONG
                        ).show()
                    }//對話ok按鈕
                    .show() //顯示對話筐

            }
        }

        */
fun inputnum(view:View) {
    val num =binding.guessnum.text.toString().toInt()
        val state =game.inputnum(num)
        val message=when(state){
            NumberGame.GameStage.BIGGER->getString(R.string.bigger)
            NumberGame.GameStage.SMALLER->getString(R.string.smaller)
            NumberGame.GameStage.BINGO->getString(R.string.bingo)


            else -> {getString(R.string.some_mistake)}
        }
       AlertDialog.Builder(this)
          // .setMessage(game.inputnum(num))//相當於印出字print
           //.setTitle("終極密碼")//標題文字
           .setMessage(message)
           .setTitle(resources.getString(R.string.dialog_title))//resource可刪除 /alt+enter 可以快速抽字串
           .setPositiveButton("OK") { dialog, which ->//選了對話按鈕後要做的事情
               if(game.end)game.reset()
               Toast.makeText(
                   this,
                   "炸彈已重設",
                   Toast.LENGTH_LONG
               ).show()

           }//對話ok按鈕
           .show() //顯示對話筐
        updateUI() //ctrl+alt+M 鍵= 抽出當方法


}

    private fun updateUI() {
        binding.counter.text = game.counter.toString()
    }

}




