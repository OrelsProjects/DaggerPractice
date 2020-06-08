package com.example.daggerpractice.ui.mainactivity

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel : ViewModel {
    @Inject
    constructor() {
        Log.d(TAG, ": viewmodel is working..")
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}