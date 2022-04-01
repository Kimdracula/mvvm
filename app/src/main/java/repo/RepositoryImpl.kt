package repo

import model.MyData

class RepositoryImpl:Repository {
    override fun getDataLocal(): MyData {
        return MyData()
    }
}