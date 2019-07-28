package com.example.dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

     lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var component:CarComponent = DaggerCarComponent.create()

        car = component.getCar()

        car.drive()

    }
}
