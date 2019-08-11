package com.example.dagger2

import android.app.Application

/**
 * Created by Olije Favour on 8/11/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


  class App: Application() {

    private lateinit var _carComponent: CarComponent

        override fun onCreate() {
            super.onCreate()
        /**
         * Considering an App Lifecycle in relation to singleton which preserves an instance of an
         * object once created we will need to consider extending the application class and making the
         * instantiation of the {@CarComponent} Class form here
         * */

        _carComponent = DaggerCarComponent.builder()
                //Used when injecting value at runtime in the builder method
                .horsePower(150)
                .engineCapacity(200)

                //Used when injecting value at runtime using module
//                .petrolEngineModule(PetrolEngineModule(300))
                //if I make wheels module static and the provides methods static then this class will be static
//                .wheelsModule(WheelsModule())
                .build()
    }



    fun getCarComponent():CarComponent{
       return  _carComponent
    }

}