/*
 * Copyright (C) 2021 Vitaliy Sychov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.javavirys.mvvmsample.presentation.adapter

import android.view.ViewGroup
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.core.entity.Channel
import com.javavirys.mvvmsample.util.extension.inflate

class ChannelAdapter : BaseAdapter<Channel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ChannelViewHolder(parent.inflate(R.layout.view_channel_item))
}