package com.example.dagger2

import android.util.Log
import javax.inject.Inject

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


class Car {

      private  var wheels:Wheels

      private var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }


    fun drive(){
    Log.d("Car Class ", "Driving....")
    }
}