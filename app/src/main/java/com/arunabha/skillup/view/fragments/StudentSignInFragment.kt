package com.arunabha.skillup.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.skillup.R

class StudentSignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_student_sign_in, container, false)
        val tvGoToSignUp = view.findViewById<TextView>(R.id.tvGoToSignIn)
        tvGoToSignUp.setOnClickListener{
            findNavController().navigate(R.id.action_studentSignInFragment_to_studentSignUpFragment)
        }
        return view
    }
}