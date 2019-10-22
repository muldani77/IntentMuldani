package com.example.intentmuldani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namet = findViewById<EditText>(R.id.nama)
        val nimt = findViewById<EditText>(R.id.nim)
        val nilait = findViewById<EditText>(R.id.nilai)

        btn_proses.setOnClickListener {
            val name = namet.text.toString()
            val nim = nimt.text.toString()
            val nilai = nilait.text.toString()

            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("name_id",name)
            intent.putExtra("nim_id",nim)
            intent.putExtra("nilai_id",nilai)

            startActivity(intent)
        }
    }
}
