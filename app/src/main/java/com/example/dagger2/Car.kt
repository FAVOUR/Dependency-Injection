package com.example.dagger2

import android.util.Log
import javax.inject.Inject

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


class Car {

      private  var wheels:Wheels




//      private var engine: Engine
//
//    //constructor injection tells dagger to inject this class
//    @Inject
//    constructor(wheels: Wheels, engine: Engine) {
//        this.wheels = wheels
//        this.engine = engine
//    }

    //Note that where a constructor is instantiated the field constructor and method are instantiated
    // correspondingly in that order but the field and method injection can only be done if we do the
    // constructor injection else you may have to do the field injection as was done in the MainActivity


    private var _engine: Engine

    @Inject lateinit var engine: Engine

    //constructor injection tells dagger to inject this class
    @Inject
    constructor(wheels: Wheels) {

        this.wheels = wheels

        _engine = engine

    }


    fun drive(){
    Log.d("Car Class ", "Driving....")
    }


    //This is considered when  the instantiated class  needs to be used by another class
    @Inject
    fun enableRemote(remote:Remote){

        remote.setListiner(this)

    }
}