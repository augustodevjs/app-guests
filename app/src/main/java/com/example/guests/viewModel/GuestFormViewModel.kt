package com.example.guests.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.guests.model.GuestModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {
    private val repository = GuestRepository.getInstance(application)

    fun insert(guest: GuestModel) {
        repository.insert(guest)
    }
}