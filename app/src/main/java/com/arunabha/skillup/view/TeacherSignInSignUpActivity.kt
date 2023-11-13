package com.arunabha.skillup.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.skillup.R

class TeacherSignInSignUpActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_sign_in_sign_up)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fcvTeacherSignInSignUp) as NavHostFragment
        navController = navHostFragment.navController
    }
}