package com.example.dagger2


import javax.inject.Singleton

import dagger.Component

/**
 * Created by Olije Favour on 8/12/2019.
 * Copyright (c) 2019.
 */

/**
 * This interface is the component class that for the driver module abstract class */
@Singleton
@Component(modules = [DriverModule::class])
interface AppComponents {

    /**This is commented out because the sub-component will now bw able to access the driver method without
      *exposing it explicitly
     */
//    val driver: Driver

    /**
     * Module was passed as a parameter when  it is  not abstract and have a default
     * constructor */
     fun getActivityComponent(petrolEngineModule: PetrolEngineModule):ActivityComponent


}
