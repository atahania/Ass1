package com.example.ass1

import android.content.Intent
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var  name :EditText
    lateinit var location:EditText
    lateinit var mobile:EditText
    lateinit var toaBut:Button
    private lateinit var tvBut:Button
    lateinit var goBut:Button
    lateinit var tvShow:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.Name)
        location = findViewById(R.id.Location)
        mobile = findViewById(R.id.Mobile)
        toaBut = findViewById(R.id.toaBut)
        tvBut = findViewById(R.id.tvBut)
        goBut = findViewById(R.id.goBut)
        tvShow = findViewById(R.id.tv)

        toaBut.setOnClickListener {
            Toast.makeText(applicationContext,"${name.text.toString()} ${location.text} ${mobile.text}", Toast.LENGTH_LONG).show()
        }
        tvBut.setOnClickListener {
            tvShow.text = "${name.text} ${location.text} ${mobile.text}"
        }
        goBut.setOnClickListener {
           val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("nameE",name.text.toString())
            intent.putExtra("locationE",location.text.toString())
            intent.putExtra("mobileE",mobile.text.toString())
            startActivity(intent)
        }
    }}
