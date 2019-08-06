package com.example.dagger2

import android.util.Log
import javax.inject.Inject

/**
 * Created by Olije Favour on 8/5/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


class DieselEngine :Engine {

      var horsePower:Int=0

    //constructor injection tells dagger to inject this class
    @Inject
    constructor()

    override fun start() {
        Log.d("Car ","Starting Car Engine")
    }

}