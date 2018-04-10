package com.jackson.daggertest.module.activity; /**
 * AllActivitysModule  2018-04-03
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.activity.DaggerAndroid2Activity;
import com.jackson.daggertest.activity.DaggerAndroidActivity;
import com.jackson.daggertest.activity.DaggerFragmentActivity;
import com.jackson.daggertest.component.activity.BaseActivityComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 改进官网
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 03
 */
@Module(subcomponents = BaseActivityComponent.class)
public abstract class AllActivitysModule {

    @ContributesAndroidInjector(modules = DaggerAndroidActproModule.class)
    abstract DaggerAndroidActivity contributeDaggerAndroidActivityInjector();

    @ContributesAndroidInjector(modules = DaggerAndroid2ActProModule.class)
    abstract DaggerAndroid2Activity contributeDaggerAndroid2ActivityInjector();

    @ContributesAndroidInjector(modules = DaggerFragmentActProModule.class)
    abstract DaggerFragmentActivity contributeDaggerFragmentActivityInjector();



}

