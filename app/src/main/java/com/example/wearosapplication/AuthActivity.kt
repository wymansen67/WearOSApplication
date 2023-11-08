package com.example.wearosapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AuthActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var psswd: EditText
    lateinit var sign_in: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        email = findViewById(R.id.email)
        psswd = findViewById(R.id.psswd)
        sign_in = findViewById(R.id.buttonSignIn)
        sign_in.setOnClickListener {
            if (email.text.toString().isNotEmpty() && psswd.text.toString().isNotEmpty()) {
                startActivity(Intent(this@AuthActivity, ResultActivity::class.java))
            } else {
                Toast.makeText(this, "Empty fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}