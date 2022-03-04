package com.example.boomguess

import android.util.Log
import android.view.View
import android.widget.Toast
import kotlin.random.Random

fun main() {

        var num=0
        var min = 1
        var max = 100
        val boom = Random.nextInt(100)

        while (num != boom) {
            println("$min 到$max")
            println("現在的炸彈$boom")
            num = readLine().toString().toInt()
            when {
                num > boom -> max = num
                num < boom -> min = num

            }
            println("現在輸入$num")
        }

    print("over")






}