package com.nkatha99.bills_management_app_assessment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nkatha99.bills_management_app_assessment3.databinding.ActivitySignInPageBinding

class SignIn_Page : AppCompatActivity() {
    lateinit var binding: ActivitySignInPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
