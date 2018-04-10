package com.jackson.daggertest.module.fragment; /**
 * Fragment01Module  2018-04-08
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.utils.Master;

import dagger.Module;
import dagger.Provides;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 08
 */
@Module
public abstract class Fragment02ProModule {

    @Provides
    static Master provideMaster() {
        return new Master();
    }
}

