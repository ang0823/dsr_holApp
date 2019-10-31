package com.example.holapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class sign_up : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        cancelarBtn.setOnClickListener {
            val intent : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
