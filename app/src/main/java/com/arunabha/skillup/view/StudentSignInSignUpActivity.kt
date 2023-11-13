package com.arunabha.skillup.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.skillup.R

class StudentSignInSignUpActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_sign_in_sign_up)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fcvStudentSignInSignUp) as NavHostFragment
        navController = navHostFragment.navController
    }
}