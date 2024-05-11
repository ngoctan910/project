package com.training.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Test", "onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("Test", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Test", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Test", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Test", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Test", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Test", "onDestroy")
    }

}


