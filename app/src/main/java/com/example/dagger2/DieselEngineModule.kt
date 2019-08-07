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


    /**This Demonstrates how the bind method is used with a method
     Use @Bindes when you want to bind an implementation to an interface
     Note that dagger never creates an implementation nor instance of the module for this method it just instantiates the class of the parameter directly
     It is also important to note that you cannot add the provides annotation  with a method here because
     it needs an instance of the module but dagger never creates it
     you can use static provides method here  part 6 talks about when to use static
    **/
    @Binds
    abstract fun bindsEngine(dieselEngine: DieselEngine):Engine

}