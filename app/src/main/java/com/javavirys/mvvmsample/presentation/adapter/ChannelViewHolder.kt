package com.javavirys.mvvmsample.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import com.bumptech.glide.Glide
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.core.entity.Channel

class ChannelViewHolder(view: View) : BaseViewHolder<Channel>(view) {

    private val avatarImageView =
        ViewCompat.requireViewById<ImageView>(itemView, R.id.avatarTextView)

    private val channelNameTextView =
        ViewCompat.requireViewById<TextView>(itemView, R.id.channelNameTextView)

    private val channelDescriptionTextView =
        ViewCompat.requireViewById<TextView>(itemView, R.id.channelDescriptionTextView)

    override fun onBind(item: Channel) {
        Glide.with(avatarImageView)
            .load(item.iconId)
            .into(avatarImageView)
        channelNameTextView.text = item.name
        channelDescriptionTextView.text = item.description
    }
}