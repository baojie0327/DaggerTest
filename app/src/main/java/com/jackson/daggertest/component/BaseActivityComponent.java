package com.jackson.daggertest.component;

import com.jackson.daggertest.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Lenovo on 2018/4/4.
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseActivityComponent extends AndroidInjector<BaseActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity>{

    }
}
