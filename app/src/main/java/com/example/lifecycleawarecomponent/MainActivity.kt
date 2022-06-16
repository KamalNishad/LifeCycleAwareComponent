package com.example.lifecycleawarecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())

        Log.d("MAIN", "Activity OnCrete")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity OnPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MAIN","Activity OnRestart")
    }
}