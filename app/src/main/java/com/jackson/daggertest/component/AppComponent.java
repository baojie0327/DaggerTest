package com.jackson.daggertest.component; /**
 * AppComponent  2018-03-30
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.MyApplication;
import com.jackson.daggertest.module.AllActivitysModule;
import com.jackson.daggertest.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2018 03 30
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, AllActivitysModule.class})
public interface AppComponent {
    void inject(MyApplication application);
}

