package com.sanjay.ottbase.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sanjay.ottbase.R
import com.sanjay.ottbase.auth.LoginScreen

class SplashScreen : AppCompatActivity() {
    private val SPLASH_DELAY = 1500
    private var mImageViewLogo: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        window.statusBarColor = Color.TRANSPARENT
        initializeViews()
        animateLogo()
        goToMainPage()
    }

    private fun initializeViews() {
        mImageViewLogo = findViewById(R.id.imageView)
    }

    /**
     * This method takes user to the login page
     */
    private fun goToMainPage() {
        Handler().postDelayed({
            this@SplashScreen.startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }, SPLASH_DELAY.toLong())
    }

    private fun animateLogo() {
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in_without_duration)
        fadeInAnimation.duration = SPLASH_DELAY.toLong()
        mImageViewLogo!!.startAnimation(fadeInAnimation)
    }
}