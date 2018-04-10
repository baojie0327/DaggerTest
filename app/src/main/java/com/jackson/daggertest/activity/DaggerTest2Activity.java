package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jackson.daggertest.R;
import com.jackson.daggertest.component.DaggerMainComponent;
import com.jackson.daggertest.module.MainModule;
import com.jackson.daggertest.utils.Student;

import javax.inject.Inject;

/**
 * Scope的用法
 */
public class DaggerTest2Activity extends AppCompatActivity {

    @Inject
    Student mStudent1;

    @Inject
    Student mStudent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_test2);

        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);
        Log.d("student--1",mStudent1.toString());
        Log.d("student--2",mStudent2.toString());

    }
}
