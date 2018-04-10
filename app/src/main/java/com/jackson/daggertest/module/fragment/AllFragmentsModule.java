package com.jackson.daggertest.module.fragment; /**
 * AllActivitysModule  2018-04-03
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.component.fragment.BaseFragmentSubcomponent;
import com.jackson.daggertest.fragment.Fragment01;
import com.jackson.daggertest.fragment.Fragment02;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 03
 */
@Module(subcomponents = BaseFragmentSubcomponent.class)
public abstract class AllFragmentsModule {

    @ContributesAndroidInjector(modules = Fragment01ProModule.class)
    abstract Fragment01 contributeFragment01Injector();

    @ContributesAndroidInjector(modules = Fragment02ProModule.class)
    abstract Fragment02 contributeFragment02Injector();

}

