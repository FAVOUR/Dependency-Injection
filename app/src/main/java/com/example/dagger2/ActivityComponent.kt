package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

/**This tells dagger to implement this method and the name of the concrete class will have Dagger as the prefix
 * note that you cannot add more than one class that extends the Engine interface because dagger will be confused on which class to use
*/
//@Component(dependencies = [DriverComponent::class],modules = [WheelsModule::class,DieselEngineModule::class])

/**The first  annotation  {@PerActivity} here because it  has  been used by the module
 * by virtue of this ben a subcomponent it has it will be only t take just modules and no
 * dependency in the component annotation */
@PerActivity
@Subcomponent(  modules = [WheelsModule::class,PetrolEngineModule::class])
interface ActivityComponent {

//    fun getCar():Car

    //This method is meant to instantiate the car method after the  Dagger class has has implemented the interface
     fun inject(mainActivity: MainActivity)

/**I no longer had use for the component builder because it is using a module that has
   *the values injected in the constructor
 */

//    @Component.Builder
//
//         interface Builder {
//
//            @BindsInstance
//            fun horsePower (@Named("horsePower")horsePower:Int):Builder
//
//           @BindsInstance
//            fun engineCapacity (@Named("engineCapacity")engineCapacity:Int):Builder
//
//
//            fun appComponent (driverComponent:AppComponents):Builder
//
//
//        fun build():ActivityComponent
//        }



}