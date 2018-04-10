package com.jackson.daggertest.component.fragment;

import com.jackson.daggertest.BaseFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Lenovo on 2018/4/8.
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseFragmentSubcomponent extends AndroidInjector<BaseFragment>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<BaseFragment>{

    }
}
