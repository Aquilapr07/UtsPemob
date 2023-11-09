package com.example.projectuts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val myInfoTextView = findViewById<TextView>(R.id.forgotpw)

        // Menanggapi klik pada TextView
        myInfoTextView.setOnClickListener {
            // Pindah ke halaman lain di sini (misalnya RegistrationActivity)
            val intent = Intent(this, forgot::class.java)
            startActivity(intent)

        }




    }

    fun onLoginButtonClick(view: View) {
        val intent = Intent(this, utama::class.java)
        startActivity(intent)



    }


    fun Registration(view: View) {
        val intent = Intent(this, registration::class.java)
        startActivity(intent)


    }

    fun Regis(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)


    }

    fun verify(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)


    }
}

