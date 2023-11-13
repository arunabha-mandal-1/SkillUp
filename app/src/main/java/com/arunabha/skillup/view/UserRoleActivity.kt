package com.arunabha.skillup.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.skillup.R
import com.arunabha.skillup.viewmodel.SplashViewModel
import com.arunabha.skillup.viewmodel.UserRoleViewModel
import com.arunabha.skillup.viewmodel.UserType

class UserRoleActivity : AppCompatActivity() {

    private val splashViewModel: SplashViewModel by viewModels()
    private val userRoleViewModel: UserRoleViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); // to disable dark mode

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
            val intent = Intent(this, TeacherSignInSignUpActivity::class.java)
            startActivity(intent)
        }

        btnStudent.setOnClickListener {
            userRoleViewModel.setSelectedUserType(UserType.STUDENT)
            val intent = Intent(this, StudentSignInSignUpActivity::class.java)
            startActivity(intent)
        }
    }

//    override fun onStart() {
//        super.onStart()
//        val intent = Intent(this, StudentSignInSignUpActivity::class.java)
//        startActivity(intent)
//    }
}