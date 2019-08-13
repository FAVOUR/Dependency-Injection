package com.example.dagger2

import java.lang.annotation.Documented

import javax.inject.Scope
import kotlin.annotation.Retention

/**
 * Created by Olije Favour on 8/12/2019.
 * Copyright (c) 2019  Itex Integrated Services  All rights reserved.
 */

@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity
