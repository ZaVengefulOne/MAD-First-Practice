package com.example.awfd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val duration = Toast.LENGTH_SHORT
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "The app has been opened!", duration)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast2 = Toast.makeText(applicationContext, "The app has been destroyed!", duration)
        toast2.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast3 = Toast.makeText(applicationContext, "The app has been restarted!", duration)
        toast3.setGravity(Gravity.CENTER, 0, 50)
        toast3.show()
    }

    override fun onPause() {
        super.onPause()
        val toast4 = Toast.makeText(applicationContext, "The app has been paused!", duration)
        toast4.setGravity(Gravity.CENTER, 0, 70)
        toast4.show()
    }
}