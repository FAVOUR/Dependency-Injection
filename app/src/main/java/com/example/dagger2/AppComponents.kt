package com.example.dagger2


import javax.inject.Singleton

import dagger.Component

/**
 * Created by Olije Favour on 8/12/2019.
 * Copyright (c) 2019.
 */
@Singleton
@Component(modules = [DriverModule::class])
interface AppComponents {

    val driver: Driver


}
