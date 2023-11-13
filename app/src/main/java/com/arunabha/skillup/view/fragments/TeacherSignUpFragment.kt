package com.arunabha.skillup.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.skillup.R

class TeacherSignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_teacher_sign_up, container, false)
        val tvGoToSignIn = view.findViewById<TextView>(R.id.tvGoToSignIn)
        tvGoToSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_teacherSignUpFragment_to_teacherSignInFragment)
        }
        return view
    }
}