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
package com.javavirys.mvvmsample.presentation.navigation

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.javavirys.mvvmsample.presentation.screen.ChannelFragment

class Router(
    private val activity: AppCompatActivity,
    @IdRes private val containerVIewId: Int
) {

    fun navigateToChannelScreen() {
        navigateTo(ChannelFragment.newInstance())
    }

    fun navigateToProgramScreen(channelId: Int) {
        TODO()
    }

    private fun navigateTo(fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .add(containerVIewId, fragment)
            .commit()
    }
}