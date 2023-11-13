package com.example.skillup.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.skillup.R
import com.example.skillup.viewmodel.SplashViewModel
import com.example.skillup.viewmodel.UserRoleViewModel
import com.example.skillup.viewmodel.UserType

class UserRoleActivity : AppCompatActivity() {

    private val splashViewModel:SplashViewModel by viewModels()
    private val userRoleViewModel: UserRoleViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepOnScreenCondition{
                splashViewModel.isLoading.value
            }
        }
        setContentView(R.layout.activity_user_role)

        val btnTeacher: Button = findViewById(R.id.btnTeacher);
        val btnStudent: Button = findViewById(R.id.btnStudent);

        btnTeacher.setOnClickListener {
            userRoleViewModel.setSelectedUserType(UserType.TEACHER)
        }

        btnStudent.setOnClickListener {
            userRoleViewModel.setSelectedUserType(UserType.STUDENT)
        }
    }
}