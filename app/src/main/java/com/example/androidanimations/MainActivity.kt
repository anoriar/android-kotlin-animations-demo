package com.example.androidanimations

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.androidanimations.ScaleActivity
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.animationImageView)

        val background = imageView.background as AnimationDrawable
        background.setEnterFadeDuration(3000)
        background.setExitFadeDuration(1000)
        background.start()

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val backgroundLinearLayout = linearLayout.background as AnimationDrawable
        background.setEnterFadeDuration(3000)
        background.setExitFadeDuration(1000)

        backgroundLinearLayout.start()
        background.start()

//        Вызов другого активити с задержкой
        Timer("MyTimer", false).schedule(10000){
            openScaleActivity()
        }
    }

    fun openScaleActivity() {
        intent = Intent(this, ScaleActivity::class.java)
        startActivity(intent)
    }
}