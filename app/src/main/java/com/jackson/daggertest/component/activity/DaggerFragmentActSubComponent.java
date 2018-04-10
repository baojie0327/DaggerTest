package com.jackson.daggertest.component.activity; /**
 *   2018-04-02
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import com.jackson.daggertest.activity.DaggerFragmentActivity;
import com.jackson.daggertest.module.fragment.Fragment01Module;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 02
 */
@Subcomponent(modules = {AndroidInjectionModule.class, Fragment01Module.class})
public interface DaggerFragmentActSubComponent extends AndroidInjector<DaggerFragmentActivity>{

    @Subcomponent.Builder
     abstract class Builder extends AndroidInjector.Builder<DaggerFragmentActivity>{

    }

}

