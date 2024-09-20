package com.example.laba2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun formula(view: View)
    {
        if (findViewById<EditText>(R.id.editTextNumber).text.toString().equals(""))
        {
            return
        }
        val x = findViewById<EditText>(R.id.editTextNumber).text.toString().toDouble()
        var y = 1.0
        for(n in 1..7)
        {
            y *= (x-Math.pow(2.0,n.toDouble()))/(x-(Math.pow(2.0,n.toDouble())-1))
        }
        Toast.makeText(this,y.toString(),Toast.LENGTH_SHORT).show()
    }
}