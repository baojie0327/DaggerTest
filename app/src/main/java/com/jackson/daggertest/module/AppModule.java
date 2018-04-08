package com.jackson.daggertest.module; /**
 * AppModule  2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.utils.LogUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    static LogUtil provideLogUtil(){
        return new LogUtil();
    }

}

