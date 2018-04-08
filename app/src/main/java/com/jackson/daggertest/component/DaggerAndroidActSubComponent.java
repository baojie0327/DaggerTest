package com.jackson.daggertest.component; /**
 *   2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.activity.DaggerAndroidActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Subcomponent(modules = AndroidInjectionModule.class)
public interface DaggerAndroidActSubComponent extends AndroidInjector<DaggerAndroidActivity>{

    @Subcomponent.Builder
     abstract class Builder extends AndroidInjector.Builder<DaggerAndroidActivity>{

    }

}

