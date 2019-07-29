package com.example.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

     lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Call the auto generated DaggerCarComponent class  (Dagger as prefix) that extends  CarComponent interface
        var component:CarComponent = DaggerCarComponent.create()

        //Call the overridden getcar() method implemented by the DaggerCarComponent class which returns the Instantiated  car method
        car = component.getCar()

        //Call the drive method kin the car class
        car.drive()

    }
}
