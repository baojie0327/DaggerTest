package com.jackson.daggertest.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Lenovo on 2018/3/29.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivitySingleton {
}
