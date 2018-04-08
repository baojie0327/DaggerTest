package com.jackson.daggertest.module; /**
 * AllActivitysModule  2018-04-03
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.activity.DaggerAndroid2Activity;
import com.jackson.daggertest.activity.DaggerAndroidActivity;
import com.jackson.daggertest.component.BaseActivityComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 03
 */
@Module(subcomponents = BaseActivityComponent.class)
public abstract class AllActivitysModule {

    @ContributesAndroidInjector(modules = DaggerAndroidActproModule.class)
    abstract DaggerAndroidActivity contributeDaggerAndroidActivityInjector();

    @ContributesAndroidInjector(modules = DaggerAndroid2ActModule.class)
    abstract DaggerAndroid2Activity contributeDaggerAndroid2ActivityInjector();

}

