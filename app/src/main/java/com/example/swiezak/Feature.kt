package com.example.swiezak

import android.content.Context

interface Feature {
    val isAvaible:Boolean get() = false
    fun start(context: Context)
}