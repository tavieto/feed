package com.br.usemobile.feed.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _toolbarTitle: MutableLiveData<String> = MutableLiveData()
    val toolbarTitle: LiveData<String> = _toolbarTitle

    fun setToolbarTitle(title: String) {
        _toolbarTitle.value = title
    }

}