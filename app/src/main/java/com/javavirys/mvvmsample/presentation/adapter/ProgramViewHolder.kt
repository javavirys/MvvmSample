package com.javavirys.mvvmsample.presentation.adapter

import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.presentation.entity.BaseProgramUi
import com.javavirys.mvvmsample.presentation.entity.ProgramUi

class ProgramViewHolder(view: View) : BaseViewHolder<BaseProgramUi>(view) {

    private val timeTextView =
        ViewCompat.requireViewById<TextView>(itemView, R.id.timeTextView)

    private val nameTextView =
        ViewCompat.requireViewById<TextView>(itemView, R.id.nameTextView)

    override fun onBind(item: BaseProgramUi) {
        if (item is ProgramUi) {
            timeTextView.text = item.time
            nameTextView.text = item.name
        }
    }
}