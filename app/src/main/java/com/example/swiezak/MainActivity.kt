package com.example.swiezak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiezak.adapters.ProductListAdapter
import com.example.swiezak.data.ProductRepository
import com.example.swiezak.data.ProductRepositoryInMemory
import com.example.swiezak.databinding.ActivityMainBinding
import com.example.swiezak.databinding.ItemProductBinding
import com.example.swiezak.databinding.SecondScreenBinding

class MainActivity : AppCompatActivity() {


    lateinit var ProductRepository: ProductRepository
    lateinit var binding1: ActivityMainBinding
    lateinit var binding2: SecondScreenBinding
    lateinit var productListAdapter: ProductListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding1=ActivityMainBinding.inflate(layoutInflater)
        binding2= SecondScreenBinding.inflate(layoutInflater)
        var productRepository = ProductRepositoryInMemory


        binding1.button2.setOnClickListener{
            setContentView(binding2.root)
        }
        productListAdapter= ProductListAdapter()
        binding1.ProductList.apply {
            layoutManager= LinearLayoutManager(context)
            adapter=productListAdapter
        }

        productListAdapter.productList = productRepository.getProductList()


        setContentView(binding1.root)


        ViewCompat.setOnApplyWindowInsetsListener(binding1.mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }





    }
}