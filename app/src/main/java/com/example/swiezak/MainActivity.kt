package com.example.swiezak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.swiezak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)



        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val array = resources.getStringArray(R.array.products)
        array.forEach {
            val label = TextView(this).apply {
                text = it
            }
            binding.productsLay.addView(label)
        }
        setContentView(binding.root)

        val student = SecondActivityFeature()
        binding.button2.setOnClickListener{
//            if (student.isAvaible){
            student.start(this)
//            }
//            else
//            binding.button2.visibility = View.GONE
        }


    }
}