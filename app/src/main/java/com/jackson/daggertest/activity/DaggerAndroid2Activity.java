package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.util.Log;

import com.jackson.daggertest.BaseActivity;
import com.jackson.daggertest.R;
import com.jackson.daggertest.utils.Master;

import javax.inject.Inject;

public class DaggerAndroid2Activity extends BaseActivity {

    @Inject
    Master mMaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_android2);
        Log.d("hbj--",mMaster.toString());
    }
}
