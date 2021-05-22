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
package com.javavirys.mvvmsample.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.di.ChannelViewModelFactory
import com.javavirys.mvvmsample.presentation.adapter.ChannelAdapter
import com.javavirys.mvvmsample.presentation.navigation.Router
import com.javavirys.mvvmsample.presentation.viewmodel.ChannelViewModel

class ChannelFragment : Fragment(R.layout.fragment_channel) {

    private val router: Router by lazy {
        Router(
            requireActivity() as AppCompatActivity,
            R.id.fragmentContainer
        )
    }

    private val model: ChannelViewModel by viewModels { ChannelViewModelFactory(router) }

    private val adapter: ChannelAdapter by lazy {
        ChannelAdapter { _, channel ->
            router.navigateToProgramScreen(channel.id)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val channelRecyclerView =
            ViewCompat.requireViewById<RecyclerView>(view, R.id.channelRecyclerView)
        channelRecyclerView.adapter = adapter
        model.getChannels().observe(viewLifecycleOwner, adapter::setItems)
        model.loadChannels()
    }

    companion object {

        fun newInstance() = ChannelFragment()
    }
}