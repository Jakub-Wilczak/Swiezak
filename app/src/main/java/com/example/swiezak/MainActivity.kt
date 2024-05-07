package com.example.swiezak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.swiezak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)



        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        ViewCompat.setOnApplyWindowInsetsListener(binding.main){v, insets =>
//            val systemBars= insets.getInsets(WindowInsetsCompat.Type.statusBars())
//        }
//        }
//
//
//        binding.button2.setOnClickListener{
//            setContentView(R.layout.second_screen)
//        }


    }
}