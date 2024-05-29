package com.training.myproject

import android.content.Intent
import android.graphics.Picture
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Telephony.Mms.Intents
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.text.FieldPosition
import kotlin.math.log

class MainActivity : AppCompatActivity(), ItemClick {

    var list = listOf<Int>(
        R.drawable.elephant, R.drawable.dog, R.drawable.duck, R.drawable.dolphin, R.drawable.cat,
        R.drawable.chuon_chuon, R.drawable.chicken, R.drawable.turtle, R.drawable.pig
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var animal = intent.getStringExtra(Constant.ANIMAL_KEY)
        intent.putExtra("" ,"")

        Log.d("Test", "onCreate: $animal")
        var animalAdapter = AnimalAdapter(list,this)
        var recyclerView = this.findViewById<RecyclerView>(R.id.recycle_view)

        recyclerView.adapter = animalAdapter

    }

    private fun goToDetail(animalName: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(Constant.ANIMAL_KEY, animalName)
        startActivity(intent)
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

    override fun onItemClick(position: Int) {
        goToDetail(animalName = getAnimalName(position))

    }

    fun getAnimalName(position: Int): String {
        return when(position) {
            0 -> Constant.ELEPHANT
            1 -> Constant.DOG
            2 -> Constant.DUCK
            3 -> Constant.DOLPHIN
            4 -> Constant.CAT
            5 -> Constant.DRAGONFLY
            6 -> Constant.CHICKEN
            7 -> Constant.TURTLE
            8 -> Constant.PIG

            else -> Constant.DOLPHIN
        }
    }
}



