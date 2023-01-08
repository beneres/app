package com.place.app.activities

import androidx.appcompat.app.AppCompatActivity
import android.view.animation.Animation
import android.widget.TextView
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.place.app.R
import android.content.Intent
import android.os.Handler
import android.widget.ImageView
import com.place.app.activities.MainActivity
import com.place.app.databinding.SplashActivityBinding

class SplashActivity : AppCompatActivity() {
    var topAnim: Animation? = null
    var bottomAnim: Animation? = null
    var logo: ImageView? = null
    var appName: TextView? = null
    private var binding: SplashActivityBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //init layout
        binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        //setup Animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim)
        //setup Views

        binding!!.logo.setAnimation(topAnim)
        binding!!.tvAppName.setAnimation(bottomAnim)
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 1800)
    }
}