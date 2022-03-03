package com.example.boomguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.boomguess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun inputnum(view: View) {
            val num = binding
        }

    }
}