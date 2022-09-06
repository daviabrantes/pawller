package com.example.pawller.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pawller.data.models.Dog
import com.example.pawller.data.repositories.DogRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DogViewModel(private val repository: DogRepository): ViewModel() {

    private val _selectedDog: MutableStateFlow<Dog?> = MutableStateFlow(null)
    val selectedDog: StateFlow<Dog?> = _selectedDog

    private fun getSelectedDog(dogId: Int) {
        viewModelScope.launch {
            repository.getSelectedDog(dogId = dogId).collect() { dog ->
                _selectedDog.value = dog
            }
        }
    }

    private fun addDog(dog: Dog) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addDog(dog = dog)
        }
    }
}