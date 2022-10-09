package com.example.myapplication8_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication8_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    val a = 324
    val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.b1.setOnClickListener{
            val result = a + b
            bindingClass.tvResult.text = "Результат сложения равен : $result"
        }
        bindingClass.b2.setOnClickListener{
            val result = a + b
            bindingClass.tvResult.text = result.toString()

        }
        bindingClass.b3.setOnClickListener{}
        val result = a + b
        bindingClass.tvResult.text = result.toString()

    }

}