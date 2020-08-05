package com.mc.accessmodifiers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mc.support.services.IService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var service1 = object: IService {
            override fun createUserId(): String = ""
        }

//        var service2 = AcuantService() - Not possible
//        var service3 = TestService() - Not possible
    }
}