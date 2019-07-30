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

        //Call the auto generated DaggerCarComponent class  (Dagger as prefix) that extends  CarComponent interface
        var component:CarComponent = DaggerCarComponent.create()

        /** Field injection is used in cases where the constructor is instantiated by the framework  (eg Activities and fragment in the android framework)
         * This is the heart of method injection the injected  method here passed the instantiated class as a parameter
         *  to the inject method for thcar class yo be instantiated and assigned to the  "car" field already declared
         */
         component.inject(this)

        //Call the drive method kin the car class
        car.drive()

    }
}
