package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import kotlin.properties.Delegates

/**
 * Created by Olije Favour on 8/7/2019.
 *Copyright (c) 2019
 */


class PetrolEngine :Engine {

    var horsePower: Int by Delegates.notNull<Int>()


    /**
     * The petrol engine now has  the inject annotator because a parameter has been provided by
     * the {@providesHorsePower} method in the {@PetrolEngineModule} hence no need to pass the parameter through its
     * constructor
     * */
    @Inject
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }


    override fun start() {
        Log.d("Car ", "Petrol Engine Started")
    }
}