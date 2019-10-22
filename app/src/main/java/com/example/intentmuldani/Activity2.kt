package com.example.intentmuldani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intent = intent
        val nama = intent.getStringExtra("name_id")
        val nim = intent.getStringExtra("nim_id")
        val nilai = intent.getStringExtra("nilai_id")

        val nilaii = nilai.toInt()
        val result = findViewById<TextView>(R.id.hasil)
        if(nilaii >= 80){
            result.text = "Nama: "+nama+"\nNim: "+nim+"\nNilai: A"
        }else if(nilaii >= 60){
            result.text = "Nama: "+nama+"\nNim: "+nim+"\nNilai: B"
        }else if(nilaii >= 40){
            result.text = "Nama: "+nama+"\nNim: "+nim+"\nNilai: C"
        }else if(nilaii >= 20){
            result.text = "Nama: "+nama+"\nNim: "+nim+"\nNilai: D"
        }else if(nilaii >= 0){
            result.text = "Nama: "+nama+"\nNim: "+nim+"\nNilai: E"
        }
    }
}
