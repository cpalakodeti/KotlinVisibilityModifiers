package com.mc.support.services

interface IService {
    fun createUserId() : String
}

internal class TestService : IService {
    override fun createUserId() : String{
        if(checkIfUserIdAvailable()) {
            return getOldId()
        }

        return createANewId()
    }

    private fun checkIfUserIdAvailable(): Boolean = false

    private fun getOldId(): String = "1212121ASASASA"

    private fun createANewId(): String = "131313LKLKLK"

}