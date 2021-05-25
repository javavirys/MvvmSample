package com.javavirys.mvvmsample.di

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.javavirys.mvvmsample.presentation.navigation.Router

object RouterFactory {

    fun createRouter(
        activity: AppCompatActivity,
        @IdRes containerVIewId: Int
    ) = Router(activity, containerVIewId)
}