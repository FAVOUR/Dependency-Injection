package com.example.dagger2

import dagger.Module
import dagger.Provides
import kotlin.properties.Delegates

/**
 * Created by Olije Favour on 8/7/2019.
 * Copyright (c) 2019.
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
     * I could also make  the horse power method to be in this module class and there by injecting the
     * PetrolEngine as opposed to instantiation it it is also important to note that dagger cares about te
     * return  type and not the name of the method hence it is right to say whenever  an integer is
     * dagger checks the {@providesHorsePower} method when which is gonna be a challenge in the future incase
     * you need have more integers But there is a more efficient  way to achieve the sane result check the
     * {@DieselEngine} Class and the {@ActivityComponent}
     * */

    @Provides
    fun providesHorsePower():Int{
        return horsePower
    }



    /**
     * By venture of this module having a constructor the {@providesPetrolEngine} method
     * is able to return the instantiated {@PetrolEngine} class
     */
    @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine):Engine{

        return petrolEngine

    }
}
