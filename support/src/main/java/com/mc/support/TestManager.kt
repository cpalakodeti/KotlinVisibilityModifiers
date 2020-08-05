package com.mc.support

import com.mc.support.services.IService
import com.mc.support.services.TestService

class TestManager {
    val service : IService = TestService()

    companion object {
        private lateinit var INSTANCE: TestManager
        fun getInstance() : TestManager{
            if(INSTANCE == null) {
                INSTANCE = TestManager()
            }
            return INSTANCE
        }
    }

    fun getUUID() : String = service.createUserId()
}