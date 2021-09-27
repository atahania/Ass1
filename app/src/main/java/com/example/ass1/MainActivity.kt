package com.example.ass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var  Name :EditText
    lateinit var Location:EditText
    lateinit var Mobile:EditText
    lateinit var toaBut:Button
    lateinit var tvBut:Button
    lateinit var goBut:Button
    lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val layout = findViewById<ConstraintLayout>(R.id.root)
        Name=findViewById(R.id.Name)
        Location =findViewById(R.id.Location)
        Mobile=findViewById(R.id.Mobile)
        tv=findViewById(R.id.tv)

        toaBut=findViewById(R.id.toaBut)
        tvBut=findViewById(R.id.tvBut)
        goBut=findViewById(R.id.goBut)

        val list = listOf(Name.text,Location.text,Mobile.text)

        toaBut.setOnClickListener{
            Toast.makeText(applicationContext, list.toString(),Toast.LENGTH_SHORT).show()
        }
        tv.setOnClickListener{
            tv.text=list.toString()
        }
        goBut.setOnClickListener{
            val intent = Intent(this, test::class.java)
            intent.putExtra("test","2Activity")
        }
    }
}