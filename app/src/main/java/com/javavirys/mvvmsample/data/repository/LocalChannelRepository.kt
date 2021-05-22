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
package com.javavirys.mvvmsample.data.repository

import com.javavirys.mvvmsample.R
import com.javavirys.mvvmsample.core.entity.Channel
import com.javavirys.mvvmsample.domain.repository.ChannelRepository

class LocalChannelRepository : ChannelRepository {

    override suspend fun getAll() = listOf(
        Channel(0, "ТНТ", "testtesttesttest", R.mipmap.tnt),
        Channel(0, "Cinema", "test", R.mipmap.cinema),
        Channel(0, "HDL", "test", R.mipmap.hdl),
        Channel(1, "Eurosport 1", "", R.mipmap.eurosport),
        Channel(2, "Discovery", "", R.mipmap.discovery),
        Channel(4, "National Geographic", "", R.mipmap.national_geographic),
        Channel(5, "Cartoon network", "", R.mipmap.cn),
        Channel(6, "Nickelodeon", "", R.mipmap.nickelodeon),
        Channel(7, "CBS Reality", "", R.mipmap.cbs),
        Channel(8, "Sony Sci-Fi", "", R.mipmap.sony),
        Channel(9, "Fox", "", R.mipmap.fox),
        Channel(10, "Animal planet", "", R.mipmap.animal_planet),
        Channel(11, "BBC World News", "", R.mipmap.bbc),
        Channel(12, "CNN", "", R.mipmap.cnn),
        Channel(13, "Bloomberg", "", R.mipmap.bloomberg),
    )
}