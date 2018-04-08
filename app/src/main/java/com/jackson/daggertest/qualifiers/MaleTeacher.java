package com.jackson.daggertest.qualifiers;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Lenovo on 2018/3/29.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MaleTeacher {
}
