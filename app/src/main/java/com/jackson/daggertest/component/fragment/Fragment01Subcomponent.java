package com.jackson.daggertest.component.fragment;

import com.jackson.daggertest.fragment.Fragment01;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Lenovo on 2018/4/8.
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface Fragment01Subcomponent extends AndroidInjector<Fragment01>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<Fragment01>{

    }
}
