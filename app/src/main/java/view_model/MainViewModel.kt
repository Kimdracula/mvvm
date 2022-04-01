package view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import repo.RepositoryImpl


class MainViewModel(
    val liveData: MutableLiveData<String>,
    private val repo:RepositoryImpl): ViewModel() {

fun setMyText(){
    liveData.value = repo.getDataLocal().toString()
}


    }

