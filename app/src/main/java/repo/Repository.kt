package repo

import model.MyData

interface Repository {
    fun getDataLocal():MyData
}