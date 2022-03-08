package com.example.boomguess

class NumberGame {
    var secret = (1..10).random()
    var counter = 0
    var end = false
    enum class GameStage {
        INIT ,BIGGER,SMALLER,BINGO,END //列舉

    }    //列舉
    init{
        reset()    //要在建構子用發法用init
    }
    fun reset() {
        secret = (1..10).random()
        counter = 0
        end=false
    }

    fun inputnum(num: Int): GameStage{
        counter++
        val message = if (num > secret) GameStage.SMALLER
        else if (num < secret) GameStage.BIGGER
        else {
            end = true
            GameStage.BINGO
        }

     return  message



    }


}

