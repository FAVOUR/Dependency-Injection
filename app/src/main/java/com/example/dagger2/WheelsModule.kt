package com.example.dagger2

import dagger.Module
import dagger.Provides

/**
 * Created by Olije Favour on 8/1/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


/* Annotates a class that contributes to the object graph.*/
  @Module
class WheelsModule {

    //Under the provider annotation you can conveniently instantiate/ do the setup of your module
    // and return its assigned variable the method
    @Provides
    fun rimProvider():Rims{
      return  Rims()
    }

    @Provides
    fun tyreProvider():Tyre{

        val tyre=Tyre()
        tyre.inflateTyres()
        return  tyre
    }

    @Provides
    fun wheels(rims: Rims,tyre: Tyre):Wheels{

        return Wheels(rims, tyre)
    }


}