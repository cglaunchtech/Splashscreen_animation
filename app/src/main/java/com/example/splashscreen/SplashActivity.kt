package com.example.splashscreen


import android.content.Intent
import android.os.Bundle
import android.os.Handler

import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import com.google.android.material.imageview.ShapeableImageView

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activity)

        val backgroundimg : ShapeableImageView = findViewById(R.id.logo)

            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            backgroundimg.startAnimation(animation)

        Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 5000)




    //        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
//        backgroundimg.startAnimation(slideAnimation)
//
//            Handler().postDelayed({
//                startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        }, 3000)


    }
}