package com.example.swiezak.data

import com.example.swiezak.model.Product

interface ProductRepository {
    fun getProductList(): List<Product>

    fun getProductList(category: Int): List<Product>
}