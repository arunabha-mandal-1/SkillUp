package com.example.skillup.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserRoleViewModel: ViewModel() {
    private val _selectedUserType = MutableLiveData<UserType>();
    val selectedUserType: LiveData<UserType> = _selectedUserType;

    fun setSelectedUserType(userType: UserType){
        _selectedUserType.value = userType;
    }
}

enum class UserType{
    TEACHER,
    STUDENT
}