package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Olije Favour on 7/30/2019.
 * Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


public class Remote {
    private static final String TAG="Remote";
    //constructor injection for Remote  Class tells dagger to inject this class
    @Inject
   public Remote(){

    }

    //Here Car class serves as te dependency
    public void setListiner(Car car){

        Log.d(TAG, "control: Remote Connected..... ");
    }
}
