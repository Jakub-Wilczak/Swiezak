package com.example.swiezak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.swiezak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Log.d("TestMessage","WTF ??")

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val array = resources.getStringArray(R.array.products)
        array.forEach {
            val label = TextView(this).apply {
                text = it
            }
            binding.productsLay.addView(label)
        }
        setContentView(binding.root)
    }
}