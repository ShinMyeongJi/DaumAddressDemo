package com.techtown.daumaddressdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var popAdd : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popAdd = findViewById(R.id.popAdd)

        popAdd.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent = Intent(this@MainActivity, AddressActivity::class.java)
                startActivity(intent)
            }
        })
    }
}
