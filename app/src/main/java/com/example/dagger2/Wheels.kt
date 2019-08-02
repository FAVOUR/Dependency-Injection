package com.example.dagger2

import javax.inject.Inject

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */


class Wheels {

    //In this senerio we assume the wheels class alongside rims and tyre class are all from some kind of module
    // we added  to our project hence we cant us e the inject annotation
    constructor(rims: Rims, tyre: Tyre){

    }
}