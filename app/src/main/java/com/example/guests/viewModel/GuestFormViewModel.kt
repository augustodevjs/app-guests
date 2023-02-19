package com.example.guests.viewModel

import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel: ViewModel() {
    private val repository = GuestRepository.getInstance()
}