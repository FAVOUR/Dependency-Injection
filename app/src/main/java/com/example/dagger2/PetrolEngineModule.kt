package com.example.dagger2

import dagger.Module
import dagger.Provides
import kotlin.properties.Delegates

/**
 * Created by Olije Favour on 8/7/2019.
 * Copyright (c) 2019
 */

@Module
class PetrolEngineModule{

    var horsePower by Delegates.notNull<Int>()

    /**
     * The constructor is necessary to accept the parameter necessary for the {@PetrolEngine} class to be instantiated
     * in this case it is the Variable horsepower
     * */

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }


    /**
     * By venture of this module having a constructor the {@providesPetrolEngine} method
     * is able to return the instantiated {@PetrolEngine} class
     */
    @Provides
    fun providesPetrolEngine():Engine{

        return PetrolEngine(horsePower)

    }
}
