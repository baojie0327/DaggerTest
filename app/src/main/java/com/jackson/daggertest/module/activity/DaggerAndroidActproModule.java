package com.jackson.daggertest.module.activity; /**
 * DaggerAndroidActModule  2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.utils.Student;

import dagger.Module;
import dagger.Provides;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Module
public abstract class DaggerAndroidActproModule {


    @Provides
    static Student provideStudent() {
        return new Student();
    }
}


