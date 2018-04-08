package com.jackson.daggertest; /**
 * MyApplication  2018-03-30
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.app.Activity;
import android.app.Application;

import com.jackson.daggertest.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 03 30
 */
public class MyApplication extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}

