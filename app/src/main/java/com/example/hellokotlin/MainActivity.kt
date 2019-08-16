package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import com.example.mylibrary.MyClass

const val TAG = "MainActivity"
const val MSGC = "onCreate"
const val MSGR = "onResume"
const val MSGS = "onStart"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strings = arrayOf("one", "four")
        println(strings[1])
        Log.d(TAG, MSGC)

        val c = MyClass()
        println(c.string)

        doSomething()

    }

    fun doSomething() {
        println("Hello!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, MSGS)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, MSGR)
        println("Hello")

    }
}
