package com.br.usemobile.feed.di

import com.br.usemobile.feed.presentation.MainViewModel
import com.br.usemobile.feed.presentation.profile.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModules = module {
    viewModel { MainViewModel() }
    viewModel { ProfileViewModel() }
}