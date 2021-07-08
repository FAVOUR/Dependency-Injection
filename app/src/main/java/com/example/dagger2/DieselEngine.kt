package com.example.dagger2

import android.support.annotation.MainThread
import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import kotlin.properties.Delegates

/**
 * Created by Olije Favour on 8/5/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

class DieselEngine :Engine {

    /**
     * Horsepower variable will be supplied an runtime through the build method check the
     * {@CarComponent method } and the {@MainActivity} Method */
   var horsePower by Delegates.notNull<Int>()
    var engineCapacity by Delegates.notNull<Int>()

    //constructor injection tells dagger to inject this
    @Inject
    constructor(@Named("horsePower")horsePower:Int, @Named("engineCapacity")engineCapacity:Int){
        this.horsePower=horsePower
        this.engineCapacity=engineCapacity
    }

    override fun start() {
        Log.d("Car ","Starting Diesel Engine with $horsePower horsepower \n and engine Capacity of $engineCapacity" )
    }

}