package com.nkatha99.bills_management_app_assessment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nkatha99.bills_management_app_assessment3.databinding.ActivityMainBinding
import com.nkatha99.bills_management_app_assessment3.databinding.ActivitySignUpPageBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this,SignUp_Page::class.java)
            startActivity(intent)
        }
        binding.btnSignIn.setOnClickListener {
            val intent = Intent(this,SignIn_Page::class.java)
            startActivity(intent)
        }
    }
}

