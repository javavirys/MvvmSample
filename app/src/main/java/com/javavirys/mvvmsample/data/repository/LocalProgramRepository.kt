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
        Calendar.SUNDAY -> listOf(
            Program(0, "Program 1", "10:00"),
            Program(1, "Program 2", "11:00"),
            Program(2, "Program 3", "12:00"),
            Program(3, "Program 4", "14:00"),
            Program(4, "Program 5", "15:00"),
            Program(5, "Program 6", "18:00"),
            Program(6, "Program 7", "23:30"),
            Program(7, "Program 8", "02:00"),
            Program(8, "Program 9", "06:00"),
            Program(9, "Program 10", "08:00")
        )
        Calendar.MONDAY -> listOf(
            Program(0, "Program 1", "10:00"),
            Program(1, "Program 2", "11:00"),
            Program(2, "Program 3", "12:00"),
            Program(3, "Program 4", "14:00"),
            Program(4, "Program 5", "15:00"),
            Program(5, "Program 6", "18:00"),
            Program(6, "Program 7", "23:30"),
            Program(7, "Program 8", "02:00"),
            Program(8, "Program 9", "06:00"),
            Program(9, "Program 10", "08:00")
        )
        Calendar.TUESDAY -> listOf(

        )
        Calendar.WEDNESDAY -> listOf(

        )
        Calendar.THURSDAY -> listOf(

        )
        Calendar.FRIDAY -> listOf(

        )
        Calendar.SATURDAY -> listOf(

        )
        else -> throw RuntimeException("Unsupported day")
    }
}