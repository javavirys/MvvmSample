package com.javavirys.mvvmsample.util.extension

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes resource: Int): View = LayoutInflater.from(this.context)
    .inflate(resource, this, false)