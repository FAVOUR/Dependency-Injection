package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Olije Favour on 8/5/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

//This Demonstrates how the bind method is implemented

//Implement DieselEngineModule as an abstract class using binds annotation The provides method can be used but using a concrete class and a concrete method

@Module
abstract class DieselEngineModule {


    //This Demonstrates how the bind method is used with a method
    @Binds
    abstract fun bindsEngine(dieselEngine: DieselEngine):Engine

}