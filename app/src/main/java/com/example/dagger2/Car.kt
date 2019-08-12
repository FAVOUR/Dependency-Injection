package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019.
 */

@PerActivity
class Car {

      private  var wheels:Wheels
      private  var engine:Engine
      private  var driver:Driver



    //constructor injection tells dagger to inject this class
    @Inject
    constructor(wheels: Wheels,engine: Engine,driver: Driver) {

        this.wheels = wheels
        this.engine = engine
        this.driver = driver




    }


    fun drive(){
        engine.start()
    Log.d("Car Class ", "Driving....")
    Log.d("Car Class ", "Driver .... $driver  driving  $this" )

    }


    //This is considered when  we need to pass the injected object to the dependency
    // eg passing the car class to the dependency remote class
    @Inject
    fun enableRemote(remote:Remote){

        remote.setListiner(this)

    }
}