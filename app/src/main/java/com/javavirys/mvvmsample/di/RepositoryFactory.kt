package com.javavirys.mvvmsample.di

import com.javavirys.mvvmsample.data.repository.LocalChannelRepository
import com.javavirys.mvvmsample.data.repository.LocalProgramRepository
import com.javavirys.mvvmsample.domain.repository.ChannelRepository
import com.javavirys.mvvmsample.domain.repository.ProgramRepository

object RepositoryFactory {

    fun createChannelRepository(): ChannelRepository = LocalChannelRepository()

    fun createProgramRepository(): ProgramRepository = LocalProgramRepository()
}