package com.example.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Olije Favour on 8/12/2019.
 * Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


//Try to fix this in Kotlin this will fix all you Issues
@Module
public abstract  class DriverModule {


    //This method is used by dagger to instantiate the driver class
    @Provides
    @Singleton
    static  Driver getDriver(){
        return new Driver();
    }
}
