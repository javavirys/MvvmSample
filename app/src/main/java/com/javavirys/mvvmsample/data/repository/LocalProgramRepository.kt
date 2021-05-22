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

import com.javavirys.mvvmsample.core.entity.Program
import com.javavirys.mvvmsample.domain.repository.ProgramRepository
import java.util.*

class LocalProgramRepository : ProgramRepository {

    override fun getProgramByDay(channelId: Int, dayOfWeek: Int): List<Program> = when (dayOfWeek) {
        Calendar.SUNDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.MONDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.TUESDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.WEDNESDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.THURSDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.FRIDAY -> throw RuntimeException("Day is unsupported!")
        Calendar.SATURDAY -> throw RuntimeException("Day is unsupported!")
        else -> throw RuntimeException("Day is unsupported!")
    }
}