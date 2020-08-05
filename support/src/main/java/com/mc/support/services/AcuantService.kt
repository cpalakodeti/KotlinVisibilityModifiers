package com.mc.support.services

internal class AcuantService: IService {
    override fun createUserId() : String{
        if(checkIfUserIdAvailable()) {
            return getOldId()
        }

        return createANewId()
    }

    private fun checkIfUserIdAvailable(): Boolean = false

    private fun getOldId(): String = "Acuant-1212121ASASASA"

    private fun createANewId(): String = "Acuant-131313LKLKLK"
}