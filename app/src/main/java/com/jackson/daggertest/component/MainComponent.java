package com.jackson.daggertest.component; /**
 * MainComponent  2018-03-21
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.activity.Daggertest1Activity;
import com.jackson.daggertest.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2018 03 21
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(Daggertest1Activity daggertest1Activity);
}

