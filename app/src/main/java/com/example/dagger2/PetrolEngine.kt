package com.example.dagger2

import android.util.Log
import kotlin.properties.Delegates

/**
 * Created by Olije Favour on 8/7/2019.
 *Copyright (c) 2019
 */


class PetrolEngine :Engine {

    var horsePower: Int by Delegates.notNull<Int>()


    /**
     * The petrol engine is not having the inject annotator because a parameter has to be passed
     * in at runtime hence it is we depend on the {@PetrolEngineModule} to pass the parameter through its
     * constructor
     * */
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }


    override fun start() {
        Log.d("Car ", "Petrol Engine Started")
    }
}