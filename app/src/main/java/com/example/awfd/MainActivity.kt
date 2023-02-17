package com.example.awfd

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "AWFD"
    val duration = Toast.LENGTH_SHORT
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "The app has been created!", duration)
        toast.show()
        Log.i(TAG, "This log confirms that the application has been successfully created")
    }

    override fun onStart() {
        super.onStart()
        val toast7 = Toast.makeText(applicationContext, "The app's work has been started!", duration)
        toast7.show()
        Log.d(TAG, "This log states that the application has been successfully started")
    }
    override fun onDestroy() {
        super.onDestroy()
        val toast2 = Toast.makeText(applicationContext, "The app has been destroyed!", duration)
        toast2.show()
        Log.e(TAG, "Pozdravlyayu, vy ubili prilozhenie")
    }

    override fun onRestart() {
        super.onRestart()
        val toast3 = Toast.makeText(applicationContext, "The app has been restarted!", duration)
        toast3.show()
        Log.v(TAG,"Prilozhenie zarestarcheno")
    }

    override fun onPause() {
        super.onPause()
        val toast4 = Toast.makeText(applicationContext, "The app has been paused!", duration)
        toast4.show()
        Log.w(TAG, "Is paused.")
    }

    override fun onResume() {
        super.onResume()
        val toast5 = Toast.makeText(applicationContext, "The app's work has been resumed!", duration)
        toast5.show()
        Log.v(TAG, "App is resumed")
    }

    override fun onStop() {
        super.onStop()
        val toast6 = Toast.makeText(applicationContext, "The app has been stopped", duration)
        toast6.show()
        Log.w(TAG, "APP IS STOPPED!!!")
    }
}