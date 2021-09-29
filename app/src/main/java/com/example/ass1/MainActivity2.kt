package com.example.ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv2=findViewById(R.id.print)

            val str1 =intent.getStringExtra("nameE")
            val str2 =intent.getStringExtra("locationE")
            val str3 =intent.getStringExtra("mobileE")

            tv2.text="$str1 $str2 $str3"
    }
}