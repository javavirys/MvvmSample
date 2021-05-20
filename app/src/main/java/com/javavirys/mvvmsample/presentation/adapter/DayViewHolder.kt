package com.javavirys.mvvmsample.presentation.adapter

import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.presentation.entity.BaseProgramUi
import com.javavirys.mvvmsample.presentation.entity.DayUi

class DayViewHolder(view: View) : BaseViewHolder<BaseProgramUi>(view) {

    private val dayTextView =
        ViewCompat.requireViewById<TextView>(itemView, R.id.dayTextView)

    override fun onBind(item: BaseProgramUi) {
        if (item is DayUi) {
            dayTextView.text = item.day.name
        }
    }
}