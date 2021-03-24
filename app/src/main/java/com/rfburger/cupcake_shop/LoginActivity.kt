package com.rfburger.cupcake_shop

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgotMail : TextView = findViewById(R.id.ForgotEmail_text)
        forgotMail.setOnClickListener {
            Toast.makeText(this, "try remember it", Toast.LENGTH_SHORT).show()
        }


    }
}