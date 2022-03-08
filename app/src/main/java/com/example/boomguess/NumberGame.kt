package com.example.boomguess

class NumberGame {
    var secret = (1..10).random()
    var counter = 0
    var end = false
    fun reset() {
        secret = (1..10).random()
        counter = 0
        end=false
    }

    fun inputnum(num: Int): String {
        counter++
        val message = if (num > secret) "Smaller"
        else if (num < secret) "Bigger"
        else {
            end = true
            "you got it"
        }

        return message



    }


}

