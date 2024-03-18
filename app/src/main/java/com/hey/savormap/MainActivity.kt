package com.hey.savormap

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goRegister(v:View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivities(arrayOf(intent))
    }

    fun goLogin(v:View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivities(arrayOf(intent))
    }

    fun goCreateSite(v:View) {
        val intent = Intent(this, CreateSiteActivity::class.java)
        startActivities(arrayOf(intent))
    }
}