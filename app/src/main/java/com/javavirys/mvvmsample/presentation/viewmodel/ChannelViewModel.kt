package com.javavirys.mvvmsample.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javavirys.mvvmsample.core.entity.Channel
import com.javavirys.mvvmsample.domain.repository.ChannelRepository
import com.javavirys.mvvmsample.presentation.navigation.Router
import kotlinx.coroutines.launch

class ChannelViewModel(
    private val router: Router,
    private val channelRepository: ChannelRepository
) : ViewModel() {

    private val channelLiveData = MutableLiveData<List<Channel>>()

    fun getChannels(): LiveData<List<Channel>> = channelLiveData

    fun loadChannels() {
        viewModelScope.launch {
            val channelList = channelRepository.getAll()
            channelLiveData.postValue(channelList)
        }
    }
}