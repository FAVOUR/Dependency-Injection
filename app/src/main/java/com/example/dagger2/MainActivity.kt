package com.example.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

     //This method is left public for the purpose of it been referenced and  assigned the instantiated car class
     @Inject lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**Call the auto generated DaggerCarComponent class  (Dagger as prefix) that extends  CarComponent interface
         *  it is also important to note that the create method is used when non of the modules in your component takes value(Parameter) over the constructor
         *  other wise you will require a builder method
         *  Below is the implementation that shows how to inject state into your  module to get it into your dependency graph
         * */

        var component:CarComponent = DaggerCarComponent.builder()
                .petrolEngineModule(PetrolEngineModule(300))
                //if I make wheels module static and the provides methods static then this class will be static
//                .wheelsModule(WheelsModule())
                .build()


        /** Field injection is used in cases where the constructor is instantiated by the framework  (eg Activities and fragment in the android framework)
         * This is the heart of method injection the injected  method here requires the instantiated class as a parameter
         *  to the inject method for the car class to be instantiated and assigned to the  "car" field already declared
         *
         *  The injected method is manually called here because the instantiation is done by the framework other wise we do not need to do this
         */
         component.inject(this)

        //Call the drive method in the car class
        car.drive()


    }
}
