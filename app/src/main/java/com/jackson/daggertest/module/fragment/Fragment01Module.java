package com.jackson.daggertest.module.fragment; /**
 * Fragment01Module  2018-04-08
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.support.v4.app.Fragment;

import com.jackson.daggertest.component.fragment.Fragment01Subcomponent;
import com.jackson.daggertest.fragment.Fragment01;
import com.jackson.daggertest.utils.Student;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 08
 */
@Module(subcomponents = Fragment01Subcomponent.class)
public abstract class Fragment01Module {
    @Binds
    @IntoMap
    @FragmentKey(Fragment01.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFragment01InjectorFactory(Fragment01Subcomponent.Builder builder);

    @Provides
    static Student provideStudent() {
        return new Student();
    }
}

