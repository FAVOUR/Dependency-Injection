package com.example.dagger2

import dagger.Component
import dagger.Module

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

//This tells dagger to implement this method and the name of the concrete class will have Dagger as the prefix
@Component(modules = [WheelsModule::class,DieselEngineModule::class])
interface CarComponent {

    //This method is meant to instantiate the car method after the  Dagger class has has implemented the interface
    fun inject(mainActivity: MainActivity)
}