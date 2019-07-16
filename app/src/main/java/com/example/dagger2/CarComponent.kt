package com.example.dagger2

import dagger.Component

/**
 * Created by Olije Favour on 7/16/2019.
 *Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

@Component
interface CarComponent {

    fun getCar():Car
}