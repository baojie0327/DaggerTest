package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.util.Log;

import com.jackson.daggertest.BaseActivity;
import com.jackson.daggertest.R;
import com.jackson.daggertest.utils.LogUtil;
import com.jackson.daggertest.utils.Student;

import javax.inject.Inject;

/**
 * Dagger-Android基本用法
 */
public class DaggerAndroidActivity extends BaseActivity {

    @Inject
    LogUtil mLogUtil;

    @Inject
    Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_android);

        Log.d("hbj--",mLogUtil.toString());
        Log.d("hbj--",mStudent.toString());
        mLogUtil.d("inject success!");
    }
}
