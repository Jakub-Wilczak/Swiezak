package com.example.swiezak

import android.content.Context
import android.content.Intent

class SecondActivityFeature :Feature {
    override val isAvaible: Boolean
        get() = true
    override fun start(context: Context) {
        context.startActivity(Intent(context,SecondActivity::class.java))

    }




}