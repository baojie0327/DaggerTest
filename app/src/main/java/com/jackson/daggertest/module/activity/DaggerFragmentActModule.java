package com.jackson.daggertest.module.activity; /**
 * DaggerAndroidActModule  2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.app.Activity;

import com.jackson.daggertest.activity.DaggerFragmentActivity;
import com.jackson.daggertest.component.activity.DaggerFragmentActSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Module(subcomponents = DaggerFragmentActSubComponent.class)
public abstract class DaggerFragmentActModule {

    @Binds
    @IntoMap
    @ActivityKey(DaggerFragmentActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDaggerFragmentActivityInjectorFactory(DaggerFragmentActSubComponent.Builder builder);

}


