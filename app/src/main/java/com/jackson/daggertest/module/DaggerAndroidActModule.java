package com.jackson.daggertest.module; /**
 * DaggerAndroidActModule  2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.app.Activity;

import com.jackson.daggertest.activity.DaggerAndroidActivity;
import com.jackson.daggertest.component.DaggerAndroidActSubComponent;
import com.jackson.daggertest.utils.Student;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Module(subcomponents = DaggerAndroidActSubComponent.class)
public abstract class DaggerAndroidActModule {

    @Binds
    @IntoMap
    @ActivityKey(DaggerAndroidActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDaggerAndroidActivityInjectorFactory(DaggerAndroidActSubComponent.Builder builder);

    @Provides
    @Singleton
    static Student provideStudent() {
        return new Student();
    }
}


