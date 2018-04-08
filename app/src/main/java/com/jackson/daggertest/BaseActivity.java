package com.jackson.daggertest; /**
 * BaseActivity  2018-04-04
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 04
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}

