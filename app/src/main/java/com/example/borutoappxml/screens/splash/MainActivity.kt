package com.example.borutoappxml.screens.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.example.borutoappxml.R
import com.example.borutoappxml.databinding.ActivityMainBinding
import com.example.borutoappxml.screens.home.HomeActivity

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val rotateAnimation = AnimationUtils.loadAnimation(applicationContext,
                R.anim.splash_anim
            )
            borutoAppLogo.startAnimation(rotateAnimation)

            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(applicationContext, HomeActivity::class.java))
            }, 1500)

        }

    }
}