package com.javavirys.mvvmsample.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javavirys.mvvmsample.core.entity.DayOfWeekEnum
import com.javavirys.mvvmsample.domain.repository.ProgramRepository
import com.javavirys.mvvmsample.presentation.entity.BaseProgramUi
import com.javavirys.mvvmsample.presentation.entity.DayUi
import com.javavirys.mvvmsample.presentation.entity.ProgramUi
import com.javavirys.mvvmsample.presentation.navigation.Router
import kotlinx.coroutines.launch
import java.util.*

class ProgramViewModel(
    private val router: Router,
    private val programRepository: ProgramRepository
) : ViewModel() {

    private val programsLiveData = MutableLiveData<List<BaseProgramUi>>()

    fun getPrograms(): LiveData<List<BaseProgramUi>> = programsLiveData

    fun loadPrograms(channelId: Int) {
        viewModelScope.launch {
            val program = mutableListOf<BaseProgramUi>()
            for (i in Calendar.SUNDAY..Calendar.SATURDAY) {
                val programForDay = mutableListOf<BaseProgramUi>()

                programForDay.addAll(
                    programRepository.getProgramByDay(channelId, i)
                        .map { ProgramUi(it.id, it.name, it.time) }
                        .toMutableList<BaseProgramUi>()
                )
                programForDay.add(0, DayUi(DayOfWeekEnum.findDayByIndex(i)))

                program.addAll(programForDay)
            }
            programsLiveData.postValue(program)
        }
    }
}