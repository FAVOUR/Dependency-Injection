package com.example.dagger2

import dagger.Module
import dagger.Provides

/**
 * Created by Olije Favour on 8/1/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

  @Module
class WheelsModule {

    @Provides
    fun rimProvider():Rims{
      return  Rims()
    }

    @Provides
    fun tyreProvider():Tyre{
        return  Tyre()
    }

    @Provides
    fun Wheels():Tyre{
        return  Tyre()
    }


}