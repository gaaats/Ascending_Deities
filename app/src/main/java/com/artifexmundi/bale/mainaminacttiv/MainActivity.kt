package com.artifexmundi.bale.mainaminacttiv


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.artifexmundi.bale.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}