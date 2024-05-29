package com.training.myproject

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity() {

    private var buttonBack: ImageView? = null
    private var myPicture: ImageView? = null
    private var text: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val animal = intent.getStringExtra(Constant.ANIMAL_KEY)

        Log.d("animal","animal: $animal")

        myPicture = this.findViewById(R.id.picture)
        text = this.findViewById(R.id.text)
        buttonBack = findViewById(R.id.buttonBack)
        buttonBack?.setOnClickListener {
            finish()
        }

        //set Picture and Text
        myPicture?.setImageResource(getImageResource(animal ?: ""))
        text?.text = getString(getTextResource(animalText = animal ?: ""))

    }

    private fun getImageResource(animalName: String): Int {
        return when(animalName) {
            Constant.ELEPHANT -> R.drawable.voi
            Constant.DOG -> R.drawable.cho
            Constant.CAT -> R.drawable.meo
            Constant.CHICKEN -> R.drawable.ga
            Constant.DOLPHIN -> R.drawable.caheo
            Constant.DRAGONFLY -> R.drawable.df
            Constant.DUCK -> R.drawable.vit
            Constant.PIG -> R.drawable.heo
            Constant.TURTLE -> R.drawable.rua

            else -> R.drawable.button_back
        }
    }

    private fun getTextResource(animalText: String): Int {
        return when(animalText) {
            Constant.ELEPHANT -> R.string.text_elephant
            Constant.DOG -> R.string.text_dog
            Constant.CAT -> R.string.text_cat
            Constant.CHICKEN -> R.string.text_chicken
            Constant.DOLPHIN -> R.string.text_dolphin
            Constant.DRAGONFLY -> R.string.text_dragonfly
            Constant.DUCK -> R.string.text_duck
            Constant.PIG -> R.string.text_pig
            Constant.TURTLE -> R.string.text_turtle

            else -> R.string.text_elephant
        }
    }


}
