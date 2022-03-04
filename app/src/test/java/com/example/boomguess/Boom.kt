package com.example.boomguess

import kotlin.random.Random

class Boom {

    var min = 1
    var max = 100
    var count = 0  //猜的次數
    var boom = Random.nextInt(100)


    fun restart() {
        min = 1
        max = 100
        count = 0  //猜的次數
        boom = Random.nextInt(100)

    }
}



